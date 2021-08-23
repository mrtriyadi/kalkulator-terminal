fun main(){
    //tampilkan menu pilihan dengan memanggil fungsi tampilkanMenu() pada class Home
    do {
        val menu = Home()
        menu.tampilkanMenu()
        when (menu.pilihanKalkulator) {
            //bila user memasukan 1, maka akan membuat objek dari clas Penambahan
            // dan melakukan fungsi operasi() yang ada di class Penambahan
            "1" -> {
                val pilihanKalkulator = Penambahan()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 2, maka akan membuat objek dari clas Pengurangan
            // dan melakukan fungsi operasi() yang ada di class Pengurangan
            "2" -> {
                val pilihanKalkulator = Pengurangan()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 3, maka akan membuat objek dari clas Perkalian
            // dan melakukan fungsi operasi() yang ada di class Perkalian
            "3" -> {
                val pilihanKalkulator = Perkalian()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 4, maka akan membuat objek dari clas Pembagian
            // dan melakukan fungsi operasi() yang ada di class Pembagian
            "4" -> {
                val pilihanKalkulator = Pembagian()
                pilihanKalkulator.operasi()
            }else ->{
                println ("")
                println ("Inputan anda salah, silahkan input pilihan angka sesuai menu yang ada.")
                continue
            }
        }
    } while (ulang()==true)
}