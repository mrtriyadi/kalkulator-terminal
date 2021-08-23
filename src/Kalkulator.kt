fun main(){

    //variabel untuk melakukan perulangan pada do while
    var ulang:Boolean=true

    //tampilkan menu pilihan dengan memanggil fungsi tampilkanMenu() pada class Home
    do {
        var menu = Home()
        menu.tampilkanMenu()
        when (menu.pilihanKalkulator) {
            //bila user memasukan 1, maka akan membuat objek dari clas Penambahan
            // dan melakukan fungsi operasi() yang ada di class Penambahan
            "1" -> {
                var pilihanKalkulator = Penambahan()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 1, maka akan membuat objek dari clas Pengurangan
            // dan melakukan fungsi operasi() yang ada di class Pengurangan
            "2" -> {
                var pilihanKalkulator = Pengurangan()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 1, maka akan membuat objek dari clas Perkalian
            // dan melakukan fungsi operasi() yang ada di class Perkalian
            "3" -> {
                var pilihanKalkulator = Perkalian()
                pilihanKalkulator.operasi()
            }

            //bila user memasukan 1, maka akan membuat objek dari clas Pembagian
            // dan melakukan fungsi operasi() yang ada di class Pembagian
            "4" -> {
                var pilihanKalkulator = Pembagian()
                pilihanKalkulator.operasi()
            }else ->{
                println ("")
                println ("Inputan anda salah, silahkan input pilihan angka sesuai menu yang ada.")
                continue
            }
        }
        //memanggil fungsi ulang()
        ulang=ulang()


    } while (ulang==true)
}