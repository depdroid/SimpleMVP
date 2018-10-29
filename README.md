# SimpleMVP
Simple MVP Example for student GDK Kotlin On Android

1. Buat Model seperti yang ada pada package xxx.model
2. Buat interface view dan letakkan pada package xxx.view
   didalam interface view buat method apa saja yang dilakukan oleh view
   yang saya contohkan disini viewnya hanya menampilkan data saja
   view tidak boleh akses langsung ke model
3. Buat Presenter dan letakkan pada package xxx.presenter
   presenter menggunakan view dan utils lain yang berfungsi untuk mendapatkan data
   untuk contoh disini saya buat ApiRepository yang mengakses mock data berupa array dari User (model)
4  implementasikan interface view pada activity atau fragment.
