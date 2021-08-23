//class Pengurangan merupakan class Extend dari class OperasiKalkulator()
//sehingga memiliki variabel dan fungsi yang ada di class OperasiKalkulator()
class Pengurangan:OperasiKalkulator() {
    fun operasi(){
        //melakukan pemanggilan fungsiInput() yang ada di class OperasiKalkulator()
        // dan ditampung di variabel angka1 dan angka2
        var angka1 = fungsiInput("1").toString()
        var angka2 = fungsiInput("2").toString()
        var hasil:Double=angka1.toDouble()-angka2.toDouble()
        println ("Hasilnya ($angka1 - $angka2) adalah: $hasil")
    }
}