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

    println("введите номер месяца")
    var numberMonth = readln().toInt()
//    when (numberMonth) {
//        12,1,2 -> println("winter")
//        3,4,5 -> println("spring")
//        6,7,8 -> println("summer")
//        9,10,11 -> println("autumn")
//    }
    var monthSeason =  when (numberMonth) {
        12,1,2 -> "winter"
        3,4,5 -> "spring"
        6,7,8 -> "summer"
        9,10,11 -> "autumn"
        else -> "error"
    }
    println(monthSeason)

}