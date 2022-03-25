package id.ac.polbeng.depandi.tes_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main(){
    val desi = PersonB("Desi", "Rahmawati", 20)
    println("Name : ${desi.firstName} ${desi.lastName}")
    println("Age : ${desi.age}")
}

//untuk meringkas kode program kelas person diatas maka kita dapat menggabungkan
//proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi kedalam satu statment.