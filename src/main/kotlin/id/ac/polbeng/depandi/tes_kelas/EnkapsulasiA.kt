package id.ac.polbeng.depandi.tes_kelas

class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val emp = Employee(1101, "Desi", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}

//inisialisasi sintaks getter dan setter dikotlin bersifat opsional, karena secara default
//kotlin telah menggenerate method getter dan setter untuk property yang mutable(var) dan hanya getter
//untuk property yang read-only (val). secara default kode yang tergenerate secara otomatis