package id.ac.polbeng.depandi.tes_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get(){
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Desi", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1
}

//terdapat dua keyword asing yaitu value dan field
//value adalah nama parameter setter
//field atau disebut juga backing fields membantu kita untuk menunjuk property didalam method getter dan setter
//field ini sangat dibutuhkan, jika kita menggunakan property secara langsung didalam method getter dan setter maka memanggil program secara rekursif dan menyebabbkan erorr.