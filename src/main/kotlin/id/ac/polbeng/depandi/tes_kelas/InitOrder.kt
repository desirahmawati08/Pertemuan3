package id.ac.polbeng.depandi.tes_kelas

class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(::println)

    //blok inisialisasi diawalidengan key init. selama instansi sebuah objek,
    //urutan eksekusi blok inisialisasi sama dengan urutan yang ada pada tubuh kelas, berselangkan inisialisasi propertynya.
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}
fun main(){
    val initOrder = InitOrder("RPL")
}