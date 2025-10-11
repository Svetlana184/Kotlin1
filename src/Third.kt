//fun main() {
//    println("enter name")
//    val name = readln()
//    println("enter age")
//    val age = readln().toInt()
//    val tom:Person = Person(name, age)
//    println(tom.getName())
//    println(tom.age)
//    tom.sayHello()
//    tom.go("somewhere")
//    tom.print()
//    val bob:Employee = Employee("bob", 15, "apple")
//    println(bob.getName())
//    println(bob.age)
//    bob.print()
//
//
//    val rect = Rectangle(6.0,9.0)
//    println(rect.area())
//    println(rect.perimetr())

//    val car = Car()
//    val aircraft = Aircraft()
//    travel(car)
//    travel(aircraft)
//
//
//}
//fun travel(obj:Movable)=obj.move()
//fun work(worker:Worker)=worker.doWork()
//fun study(worker: Worker)=worker.doWork()
//abstract  class Human(val name:String){
//    abstract var age: Int
//    abstract fun print()
//
//}
//open class Person(name: String, override var age:Int) : Human(name) {
////    constructor(name:String) : this(name,age=18)
//    private var _age: Int = 1
////    var age:Int = 18
////        set(value) {
////            if((value > 0) and (value < 100)) field = value
////        }
////        get() = field
//    fun getName(): String {
//        return name
//    }
//    fun sayHello(){
//        println("Hello")
//    }
//    fun go(location:String){
//        println(location)
//    }
//    override fun print(){return println("my name is ${getName()}")}
//}
//
//class  Employee(name: String, age: Int, val company:String) :Person(name, age) {
//    override fun print(){
//        super.print()
//        println("${getName()}, $age, $company")
//    }
//}
//
//abstract class Figure{
//    abstract fun perimetr():Double
//    abstract fun area():Double
//}
//class Rectangle(private val height:Double,private val width:Double) : Figure() {
//
//    override fun perimetr(): Double {
//       return height*2+width*2
//    }
//
//    override fun area(): Double {
//        return width*height
//    }
//
//}
//
//interface Movable{
//    fun move()
//}
//
//class Car : Movable{
//    override fun move() {
//        println("Car")
//    }
//}
//class Aircraft : Movable{
//    override fun move() {
//        println("Car")
//    }
//}
//
//interface Worker{
//    fun doWork()
//}
//interface Learner{
//    fun doLearn()
//}
//class WorkingStudent(private val name:String):Worker, Learner{
//    override fun doLearn() {println("Learning $name")}
//    override fun doWork() {println("Working $name")}
//}