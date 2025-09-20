import kotlin.random.Random

//psvm - сокращение для функции main
/*
    sout - сокращение для println
 */
// var - изменяемая переменная
// val - константа

/* ТИПЫ ДАННЫХ
* целочисленные:
*   Byte 1byte -2^7 до (2^7)-1
*   UByte 1byte 0 до (2^8)-1
*   Short 2byte -2^14 до (2^15)-1
*   UShort 2byte 0 до (2^16)-1
*   Int 4byte -2^31 до (2^31)-1
*   UInt 4byte 0 до (2^32)-1
*   Long 8byte -2^63 до (2^63)-1
*   ULong 8byte 0 до (2^64)-1
*
* вещественные:
*   Float 4byte -3.14*10^38 до 3.14*10^38
*   Double 8byte +-5.0*10^-324 до +-1.7*10^308
*
* логический:
*   Boolean
*
* символьный:
*  Char
*
* строковый:
*   String
*
* Any
*
* ОПЕРАЦИИ
*   && and
*   || or
*   ! not
*   ^ xor
*   in
* */

const val maxAge = 150

fun main() {
//    println("Enter your age:")
//    var age = readln().toInt()
//    println("Мне $age")

//    val a:Double = 5.0
//    val b = a in 1..8 //Проверка, что значение а находится в опр диапазоне
//    println(b)
//    val c = b.not()
//    println(c)

//    val f = Math.sqrt(a)
//    println("f = $f")

//    println("введите первое число:")
//    var firstNumber = readln().toFloat()
//    println("введите второе число:")
//    var secondNumber = readln().toFloat()
//    var resultSum = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = ${String.format("%.0f", resultSum)}")
//    println("введите третье число:")
//    var thirdNumber = readln().toFloat()
//    var desc = Math.pow(secondNumber.toDouble(), 2.0) - 4*firstNumber*thirdNumber
//    if(desc > 0)
//    {
//        val x1 = (-secondNumber + Math.sqrt(desc))/2*firstNumber
//        val x2 = (secondNumber + Math.sqrt(desc))/2*firstNumber
//        println("$x1 = ${String.format("%.2f", x1)}")
//        println("$x2 = ${String.format("%.2f", x2)}")
//    }
//    else if(desc == 0.0){
//        val x = (-secondNumber)/2*firstNumber
//        println("$x = ${String.format("%.2f", x)}")
//    }
//    else
//    {
//        println("-----")
//    }
//    println("введите номер дня недели")
//    val  n = readln().toInt()
//    when (n) {
//        1-> println("понедельник")
//        3-> println("среда")
//        4-> println("четверг")
//        5-> println("пятница")
//        6-> println("суббота")
//        7-> println("воскресенье")
//        else -> println("---")
//
//    }


    //switch
//    println("введите номер месяца")
//    var numberMonth = readln().toInt()
//    when (numberMonth) {
//        12,1,2 -> println("winter")
//        3,4,5 -> println("spring")
//        6,7,8 -> println("summer")
//        9,10,11 -> println("autumn")
//    }
//    var monthSeason =  when (numberMonth) {
//        12,1,2 -> "winter"
//        3,4,5 -> "spring"
//        6,7,8 -> "summer"
//        9,10,11 -> "autumn"
//        else -> "error"
//    }
//    println(monthSeason)


    //циклы
//    var i =10;
//    while(i>0){
//        println(i*i)
//        i--
//    }
//
//    do{
//        println(i*i)
//        if(i==5) break
//        i++
//    } while(i<11)

//    for(j in 1..10){
//        println(j)
//        for(k in 1..10){
//            println(j*k)
//        }
//
//    }
//    for(g in 10 downTo 1 step 2){
//        println(g)
//    }
//    for(g in 1 until 10 step 2){
//        println(g)
//    }
//
//    if(7 in 1..10) println("yes")
//    if(7 !in 1..10) println("no")

    //массивы
//    val meArray = arrayOf(1,2,3,4,5)
//    println(meArray[3])
//    println(meArray.size)
//    var myArray = arrayOf(1,2,3,4,5, "korushka", "ttt", 5.0)
//    val arr1 = arrayOf<Int>(1,2,3,4,5)
//    println(arr1[2])
//    val arr2 = intArrayOf(1,2,3,4,5)
//    println(arr2[2])
//    for((i,v) in arr1.withIndex()) {
//        println("index: ${i}")
//        println("value: ${v}")
//    }
//    for(index in arr2.indices) println("index: $index значение: ${arr2[index]}")
//
//    //сложение массивов
//    val num1 = intArrayOf(1,2,3,4,5)
//    val num2 = intArrayOf(6,7,8,9)
//    val num3 = num1 + num2
//    for(index in num3.indices) println("index: $index значение: ${num3[index]}")
//
//    //массив со значениями null
//    var nullArray = arrayOfNulls<String>(3)
//    for(index in nullArray.indices) println("index: $index значение: ${nullArray[index]}")
//    nullArray.set(1,"1")
//    nullArray[2] = "2"
//
//    var arr3 = emptyArray<String>()
//    arr3+="1"
//    arr3+="2"
//    arr3+="3"
//    for(index in arr3.indices) println("index: $index значение: ${arr3[index]}")

    //конструктор массивов
//    var rray1 = Array(5, {i->i*2})
//    for (i in rray1) println(i)
//    val letters = Array<String>(26) {i->('A'+i).toString()}
//    for (i in letters) println(i)
//    letters.forEach {i-> println(i) }
//    letters.forEachIndexed{i,j-> println("i: $i j $j")}
//
//    //поворот массива
//    var reverseLetters = letters.reversedArray()
//    reverseLetters.forEach {i-> print("$i ") }
//    println()
//    reverseLetters.reversed()
//    reverseLetters.forEach {i-> print("$i ") }
//    println()
//
//    var randomNumber = Random.nextInt(100)
//
//    var intArr = Array(5) { _ ->Random.nextInt(100)}
//    intArr.forEach {i-> print("$i ") }
//    println()
//    //сортировка
//    intArr.sort(0,3)
//    intArr.forEach {i-> print("$i ") }
//    println()
//    intArr.sortDescending()
//    intArr.forEach {i-> print("$i ") }
//    println()
//
//    val isContains = intArr.contains(1)
//    println(isContains)
//    println(intArr.average())
//    println(intArr.sum())
//    println(intArr.max())
//    println(intArr.min())
//
//
//    var intArr2 = Array(5) { _ ->Random.nextInt(100)}
//    val intersectMas = intArr.intersect(intArr2.toList()).toIntArray() //общие элементы двух массивов
//    println(intersectMas.contentToString())

    //перемешать элементы
//    intArr.shuffle()
//    intArr.forEach {i-> print("$i ") }
//    println()
//
//    //операция с каждым элементом массива по очереди
//    val nums = arrayOf(1,2,3,4,5,5)
//    var str = ""
//    nums.onEach { str+= "${it*2} "  }
//    println( nums.contentToString())
//
//    //удалить дубликаты
//    val newSet = nums.distinct()
//    println( nums.toSet().joinToString())



    //двумерные массивы
    var cinema = arrayOf<Array<Int>>()
    for(i in 0..10) {
        var array = arrayOf<Int>()
        for(j in 0..10) {
            array += Random.nextInt(100)
        }
        cinema+=array
    }
    for(array in cinema){
        for(value in array){
            print("$value ")
        }
        println()
    }
}