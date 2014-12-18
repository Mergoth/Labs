package lab02

import groovy.json.JsonSlurper
import groovy.transform.Canonical
import jdk.nashorn.internal.ir.annotations.Immutable

/**
 * Created by Admin on 18.12.2014.
 */
@Canonical
@Immutable
class Money {
    Integer amount
    String currencyCode

    Money plus (Integer plus) {
        new Money(amount+plus, currencyCode)
    }

    Money plus (Money plus) {
       new Money(amount+convert(plus.currencyCode,plus.amount),currencyCode)
    }

    Integer convert(String code, Integer amount) {
        if (code!=currencyCode) {
            int rate = new JsonSlurper().parse(new URL("http://rate-exchange.appspot.com/currency?from=$code&to=$currencyCode")).rate
            return amount * rate
        }else {
            return amount
        }
    }

}
