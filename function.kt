//simple function
fun fuck(){
    println("Hello you!!!")
}

//parameters
fun fuckName(name: String){
    println("Hello you, $name!!!")
}

// returned
fun p(x: Int, y:Int): Int{
    return x + y
}

//Short function
fun r(): Int = 5

fun main(args: Array<String>){
    fuck()
    fuckName("Bill")
    println(p(2, r()))

}