package id.ac.polbeng.depandi.tes_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val desi = PersonE("Desi", "Rahmawati", 20)
    desi.cetakInfo()
}

//konstruktor tambahan bisa didefenisikan lebih dari satu.
//key this merujuk pada konstruktor kelas saat ini yang bersesuaian.
//pada contoh diatas this(firstName_lastName) merujuk pada kontruktor yang berwarna kuning dan akan memanggilnya
//terlebih dahulu sebelum kode didalam konstruktor yang berwarna hijau dieksekusi.