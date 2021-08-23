class Home: OperasiKalkulator() {
    var pilihanKalkulator: String?=""
    fun tampilkanMenu() {
        do {
            println ("========MENU========")
            println ("1. Penambahan")
            println ("2. Pengurangan")
            println ("3. Perkalian")
            println ("4. Pembagian")
            print ("Masukan pilihan anda: ")
            pilihanKalkulator= readLine()
            valid=validasi(pilihanKalkulator)
        }while(valid==false)

    }
}