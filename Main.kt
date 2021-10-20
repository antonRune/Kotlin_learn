//Global variables
var glob = "One"

fun main(args: Array<String>) {
    //String
    val s = "it is a good day to die"
    //Integer
    val i = 4
    //Float
    val f = 3.14f
    //Double
    var d = 3.1415926535
    //Char
    val c = 'f'
    //Boolean
    val bt = true
    val bf = false

    println("String: $s")
    println("Integer: $i")
    println("Float: $f")
    println("Double: $d")
    println("Char: $c")
    println("Boolean: $bt, $bf")

    //variables
    var v = 2
    v++
    //constants
    val con = "Constants"
    //Null
    var n: Int? = null
    println("Variables: $v")
    println("Constants: $con")
    println("Global variables: $glob")
    println("Null: $n")

    // If
    if(n==null){
        println("И все-таки ее нет")
    }
    //If-Else
    if(v<=2){
        println("Не сработает")
    }else{
        println("Сработет")
    }
    //Else-if
    if(v>72){
        println("Несработает")
    }else if(v<12){
        println("Сработет")
    }else{
        println("То же не сработает")
    }
    //bool
    if(bt){
        println("Это сработает потому что bt = $bt")
    }else{
        println("Это не сработает")
    }
    //or
    if(bf || i==4){
        println("Полюбому сработает($i)")
    }else{
        println("Не сработает")
    }
    //and not
    if(bt && v!=0){
        println("Это работает!!!")
    }else{
        println("Это не работает :(")
    }

    //when
    when(i){
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Не чего не понимаею")
    }

    //Присвоение значений условных операторов
    var jim = if(i==90) 5 else "Jimmy is a good boy"
    println(jim)

    val bill = when(i){
        1 -> "Jimmy is a good boy"
        2 -> "Tommy is a good boy"
        3 -> "Bobby is a good boy"
        4 -> "Billy is a good boy"
        else -> "no good boys is here"
    }
    println(bill)
}