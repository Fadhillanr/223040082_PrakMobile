fun main() {
    val greet = { name: String -> greeting(name) }
    greet("Dila")
}

fun greeting(name: String) {
    println("Hi $name!")
}