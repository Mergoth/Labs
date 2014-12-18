package lab07

/**
 * Created by Admin on 18.12.2014.
 */
class Equalator {
     int calculateDuplicates(List list, Object obj, Closure closure) {
        int res = 0
         list.each {
             if(closure.call(it)) res++;
         }
        res
    }
}
