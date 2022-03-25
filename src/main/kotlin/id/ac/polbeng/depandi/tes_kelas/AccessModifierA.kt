package id.ac.polbeng.depandi.tes_kelas

open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info() {
        println(nama +'\n'+ nrp);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {

    @Override
    override fun info(){
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}

fun main(){
    val desi = Mahasiswa("Desi Rahmawati", 630419120)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")
    println(anton.toString());

    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)

    println()
    desi.info()
    println("Jenis Kelas = " + desi.javaClass.simpleName)


    val aris = KetuaHima("Dwi Riskyadi", 1105239, "Teknik Elektro")
    println()
    aris.info()
    println("Jenis Kelas = " + aris.javaClass.simpleName)
}