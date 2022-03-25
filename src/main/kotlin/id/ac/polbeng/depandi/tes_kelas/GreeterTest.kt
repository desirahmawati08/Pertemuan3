package id.ac.polbeng.depandi.tes_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Desi")
    greeter.greet("Rahmawati")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Risky"))
}