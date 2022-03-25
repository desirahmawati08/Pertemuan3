package id.ac.polbeng.depandi.tes_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    val desi = PersonC("Desi", "Rahmawati", 20)
    println("Name : ${desi.firstName} ${desi.lastName}")
    println("Age : ${desi.age}")
}

//nah kode ini untuk lebih ringkasnya lagi, deklarasi dan inisialisasi property dapat dilakukab
//hanya dalam parameter konstruktor utama