fun main() {
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
     	println("value is $i!")
    }

    val ranges2 = 1.rangeTo(10) step 3
    for ((index, value) in ranges2.withIndex()) {
     	println("value $value with index $index")
    }
}