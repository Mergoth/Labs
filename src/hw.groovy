
/*import lab02.Money

Money m1 = new Money(13,"RUB")
Money m2 = new Money(2,"ILS")

println m1+2+m2 */
import lab07.Equalator


List list = ["Jan", "Dec", "Feb", "Dec"]
println list
def objt = 'dec'
Equalator.metaClass.getName={ "Hello" }
count = Equalator.calculateDuplicates(list, objt) { it, obj ->
((String) it).equalsIgnoreCase(obj)
}
println Equalator.getName()
println "count = $count"