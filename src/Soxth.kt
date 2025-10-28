///

fun main(){
//    var people = listOf("tom", "sam", "mike", "bob", "alice")
//    people = people.filter{ it.length > 3}
//    println(people.joinToString(", "))
//    var employer = listOf(Chel("tom", 45), Chel("bob", 15), Chel("alice", 25))
//    var emps = employer.filter { it.age>18 }
//    println(emps.joinToString(", "))
//    var filter_by_index = employer.filterIndexed{ index, _ -> index %2 ==0}
//    println(filter_by_index.joinToString(", "))
//    val group = listOf(Student("Misha"), Masha("Masha"), Student("Bob"), Student("Alice"), null, null)
//    val mash = group.filterIsInstance<Masha>()
//    println(mash.joinToString(", "))
//    val not_null = group.filterNotNull()
//    println(not_null)
//
//    println(people.all{ it.length == 3 })
//    println(people.none{ it.length == 3 })
//    println(people.any{ it.length == 3 })
//    println(people.contains("sam"))
//    println(people.containsAll(listOf("sam", "mike", "bob")))


    //трансформация
    val group = listOf(Chel("Misha", 5), Chel("Bob", 88), Chel("Alice", 43), Chel("Alex", 33))
    val names = group.map { it.name }
    names.forEach { println(it) }
    val nums = listOf(1,2,3,3,4,5)
    val squares = nums.map{it * it}
    val group1 = listOf(Student("Misha"), Student("Bob"), Student("Alice"))
    val namesList = group1.mapIndexed{ idx, name -> "${idx + 1}.$name" }
    namesList.forEach { println(it) }

    //группировка


    //сортировка
}

data class Chel(var name: String, var age: Int)
open class Student(var name: String){
    override fun toString(): String=name
}

class Masha(name:String): Student(name) {}