import lab07.Equalator

/*import lab02.Money

Money m1 = new Money(13,"RUB")
Money m2 = new Money(2,"ILS")

println m1+2+m2 */


List list = ["Jan", "Dec", "Feb", "Dec"]
println list
def objt = 'dec'

def duplicates = new Equalator()
int count = duplicates.calculateDuplicates(list, objt, { it ->
((String) it).equalsIgnoreCase(objt)
})

println "count = $count"