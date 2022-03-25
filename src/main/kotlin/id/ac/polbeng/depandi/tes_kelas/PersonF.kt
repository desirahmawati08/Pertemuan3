package id.ac.polbeng.depandi.tes_kelas

class PersonF  (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi bestiehhh!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}

fun main(){
    val anton = PersonF("Aya", "wae")
    val desi = PersonF("Desi", "Rahmawati", 20)
    val caca = PersonF("Caca", "Andika", "Indonesia")
    val dono = PersonF("Dono", "Putri", 25, "Indonesia")
}

//terdapat 1 konstruktor utama berwarna kuning dan 3 buah konstruktor tambahan hijau, merah dan biru. konstruktor tambahan
//pertama dan kedua medelegasikan konstruktor utama. sedngkan konstruktor tamabhan ketiga mendelegasikan konstruktor tamabahn pertama
//yang secara tidak langsung mendelegasikan konstruktor utama.