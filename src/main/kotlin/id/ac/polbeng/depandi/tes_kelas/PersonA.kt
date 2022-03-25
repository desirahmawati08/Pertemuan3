package id.ac.polbeng.depandi.tes_kelas

class PersonA  (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(){
    val desi = PersonA("Desi", "Rahmawati", 20)
    println("Name : ${desi.firstName} ${desi.lastName}")
    println("Age : ${desi.age}")
}