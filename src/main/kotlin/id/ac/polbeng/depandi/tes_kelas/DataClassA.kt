package id.ac.polbeng.depandi.tes_kelas

data class Student(val name: String, val age: Int)

fun main() {
    val desi = Student("Desi", 21)
    val rahma = Student("Rahma", 20)
    println("Student Name is: ${desi.name}")
    println("Student Age is:  ${desi.age}")
    println("Student Name is: ${rahma.name}")
    println("Student Age is:  ${rahma.age}")
}