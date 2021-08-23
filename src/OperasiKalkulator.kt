open class OperasiKalkulator() {
    //variabel untuk menyimpan bilangan yang diinput
    var inputAngka: String?=""

    //variabel untuk menyimpan bilangan pertama
    var angka1:String?=""

    //variabel untuk menyimpan bilangan kedua
    var angka2:String?=""

    //variabel untuk menyimpan hasil operasi
    var hasil:Double=0.0

    //variabel untuk melakukan pengecekan validasi inputan
    var valid:Boolean=true

    //merupakan fungsi untuk melakukan inputan angka
    //fungsi ini juga akan memanggil fungsi validasi() untuk mengecek apakah inputan telah sesuai
    //fungsi memiliki parameter dengan type data String dan akan mengembalikan type data Double
    fun fungsiInput(index:String):Double{
        do {
            print ("Masukan Bilangan ke-$index: ")
            inputAngka = readLine()

            //melakukan pengecekan apakah inputan berupa angka dengan fungsi validasi()
            this.valid = validasi(inputAngka)
        }while (this.valid!=true)
        return inputAngka!!.toDouble()
    }

    //melakukan pengecekan apakah inputan berupa angka atau yang lain
    //apabila inputan bukan angka, maka akan kembali memanggil fungsi inputan
    //fungsi memiliki parameter dengan type data String dan akan mengembalikan type data Boolean
    fun validasi(inputCek: String?):Boolean {
        if (inputCek?.toDoubleOrNull() != null){
            this.valid=true
        }else{
            this.valid=false
            println ("")
            println ("Inputan anda salah. silahkan ulangi kembali!!")
            println ("")
        }
        return this.valid
    }

}