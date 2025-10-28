//null и nullable типы

fun main() {
    //?:
//    val n:Int? =null
//    //val n:Int =null - error
//    var name:String?="tom"
//    val user_name:String=name?:"undefined"
//    //val user_name:String=name - error
//    var age:Int?=20
//    val user_age:Int = age?:0
//    println(name)


    //?.
    val message :String?="Hello"
    val length : Int = message?.length?:0


    //!!(not-null assertion operator)
    var last : String?="day"
    val id:String?=last!!
    println(id)


    //is
    val tom = PersonSeven("tom")
    val bob = EmployeeSeven("bob", "jetbrains")
    checkEmployment(tom)
    checkEmployment(bob)

    //as
    checkEmployment(tom)
    checkEmployment(bob)

    //функции расширения
    val hello = "hellowrld"
    println(hello.wordCount('o'))

    //scope-функции позволяют выполнить для некоторого объекта некоторый код в виде лямбда-выражения

    //let
    val sam = PersonSeven("sam", age=45)
    sam.age.let { println(it) }

    //with
    var jack = PersonSeven("jack")
    val age_jack = with(jack) {
        if(age==null) age=0
        age
    }
    println(age_jack)

    //run
    val sir = PersonSeven("sir")
    val age_sir = sir.run {
        if(age==null) age=0
        age
    }
    println(age_sir)

    //apply
    val alice = PersonSeven("al")
    alice.apply { if(age==null) age=0 }
    println(alice.age)

    //also
    val miha = PersonSeven("miha")
    miha.also { if(it.age==null) it.age=0 }
    println(miha.age)
}
fun String.wordCount(c:Char):Int{
   var count=0
   for(n in this){if(n==c){count++}}
    return count
}
fun checkCompany(person: PersonSeven){
    val emp = person as? EmployeeSeven
    if (emp != null) println("name: ${person.name} company: ${person.company}")
    else println("name: ${person.name}")
}
fun checkEmployment(person:PersonSeven){
    if (person is EmployeeSeven) println("name: ${person.name} company: ${person.company}")
    else println("name: ${person.name}")
}
open class PersonSeven(val name:String, var age:Int=0)
class  EmployeeSeven(name:String, val company:String): PersonSeven(name) {}