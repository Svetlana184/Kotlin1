import jdk.jfr.internal.test.DeprecatedMethods.counter

//data-классы - для хранения данных
data class Person(val name: String, val age: Int)
//equals()
//hashcode()
//toString()
//copy()


fun main() {
//    //создание сущностей класса
//    val alice = Person("Alice", 29)
//    println(alice.toString())
//    val bob = alice.copy(name = "Bob")
//    println(bob.toString())
//
//    //декомпозиция
//    val (name, age) = bob
//    println("$name, $age")
//
//    val day = Day.Friday
//    println(day.value)
//    println(Day.Monday.value)
//    var day1 = Day.Tuesday
//    var day2 = Day.Saturday
//    println(day1.getDuration(day2))
//    println(day2.name)
//    println(day2.ordinal)
//    for (d in Day.entries) println(d)
//    println(Day.valueOf("Friday"))


//    DayTime.DAY.printName()
//    DayTime.NIGHT.printName()
//
//    println(operate(6,9,Operation.ADD))
//    val telegram = InstantMessage("Telegram")
//    val samsung = SmartPhone("Samsung S", telegram)
//    samsung.sendMessage("hello")
//
//    //анонимные классы и объекты
//    val person = object{
//        val name = "Tom"
//        var age = 20
//        fun sayHello(){
//            println("Hello, my name is $name")
//        }
//    }
//    println(person.sayHello())

//    println(CutePerson.printCounter())
//    CutePerson("Tom")
//    CutePerson("Sam")
//    println(CutePerson.printCounter())

    val tom:GenPerson<Int> = GenPerson(1, "Tom")
    val bob:GenPerson<String> = GenPerson("ah5", "Bob")
    println(bob)
    println("${tom.id} ${tom.name}")
    println("${bob.id} ${bob.name}")
    tom.checkId(1)

    display("456")
    display(789)
}

//обобщенные классы и функции
//обобщенные типы
class GenPerson<T>(var id:T, var name: String) {
    fun checkId(_id:T){
        if(id == _id){ println("same")}
        else println("different")
    }
}
//обобщенные функции
fun<T> display(obj:T){
    println(obj)
}

//companion-объекты
class CutePerson(val name: String){
    init{
        counter++
    }
    companion object{
        private var counter=0
        fun printCounter(){
            println(counter)}

    }
}



//делегирование - паттерн ооп, возможность одного объекта перенаправлять все запросы другому объекту
interface Messanger{
    fun sendMessage(message: String)
}
class InstantMessage(val programName: String) : Messanger {
    override fun sendMessage(message: String) {
        println("message $message has been sent")
    }
}
class SmartPhone(val name:String, m:Messanger) : Messanger by m{

}

//перечисления
enum class Day(val value:Int){
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);
    fun getDuration(day: Day):Int{
        return  value-day.value
    }
}
enum class DayTime{
    DAY{
        override val startHour=6
        override val endHour=21
        override fun printName(){
            println("Day")
        }
    },
    NIGHT{
        override val startHour=22
        override val endHour=5
        override fun printName(){
            println("Night")
        }
    };
    abstract val startHour:Int
    abstract val endHour:Int
    abstract fun printName()
}
enum class Operation{
    ADD, SUBSTRACT, MULTIPLY
}
fun operate(n1:Int, n2:Int, operation:Operation):Int{
    return  when(operation){
        Operation.ADD -> n1+n2
        Operation.SUBSTRACT -> n1-n2
        Operation.MULTIPLY -> n1 *n2
    }
}