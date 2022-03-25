package id.ac.polbeng.depandi.tes_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age

    }
}
fun main(){
    val desi = PersonD("Desi", "Rahmawati", 20)
    println("Name : ${desi.firstName} ${desi.lastName}")
    println("Age : ${desi.age}")
}

//secondary constructor(tambahan konstruktor) didefenisikan didalam tubuh kelas.
//jika kelas tidak diinisialisasi pada saat mendeklarasikan maka property tersebut harus di inisilaisasi dlam konstructor tambahan atau blok inisialisasi
//konstrukto tambahan memerlukan tambahan key constructor untuk mendefenisikannya. selain itu konstruktor tambahan boleh tidak memiliki tubuh kelas dalam pendefenisiannya.