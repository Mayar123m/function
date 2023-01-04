fun main() {
    sayHello()
    old()
}

fun sayHello() {
    println("Hello?")
    println("Hello?")
}


fun old() {
    println("how old are you?")

    fun age() {
        println(40)

        fun nice() {
            println("nice to meet you")
        }
        nice()
    }
    age()
}