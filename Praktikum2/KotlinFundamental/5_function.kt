fun main() {
    val user = setUser("Rifkiy Stark", 20)
    println(user)
    printUser("Rifkiy Stark ")
}
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String) {
 	println("Your name is $name")
}