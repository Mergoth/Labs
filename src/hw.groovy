import lab07.Equalator

/*import lab02.Money

Money m1 = new Money(13,"RUB")
Money m2 = new Money(2,"ILS")

println m1+2+m2 */


List list = ["Jan", "Dec", "Feb", "Dec"]
println list
def objt = 'dec'

count = Equalator.calculateDuplicates(list, objt) { it, obj ->
((String) it).equalsIgnoreCase(obj)
}

println "count = $count"