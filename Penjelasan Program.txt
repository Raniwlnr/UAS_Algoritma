“Sistem Penjadwalan Praktik Dokter”

   Sistem Penjadwalan Praktik Dokter adalah program manajemen jadwal dokter berbasis Java yang menggunakan konsep OOP (Object-Oriented Programming) dengan perulangan, pencabangan, fungsi/prosedur, dan list (ArrayList). Sebuah aplikasi berbasis Java yang berfungsi untuk mengelola jadwal dokter. Aplikasi ini memungkinkan pengguna untuk menambahkan dokter, menampilkan jadwal dokter, mencari dokter berdasarkan spesialisasi, menghapus dokter, dan keluar dari program. 
Program ini menggunakan struktur Perulangan While (true) untuk terus menampilkan menu hingga pengguna memilih opsi untuk keluar. Struktur Percabangan If-Else digunakan untuk menangani berbagai pilihan menu yang dimasukkan oleh pengguna. Metode input.nextLine() digunakan untuk membaca input dari pengguna, dan input.nextInt() digunakan untuk membaca input berupa angka. Metode remove digunakan untuk menghapus dokter dari daftarDokter berdasarkan nama yang diberikan. Program ini dirancang untuk mempermudah admin di lingkungan kesehatan dan menyediakan antarmuka sederhana untuk mengelola data dokter dan jadwal prakteknya.

• Didalam LatihanUAS ada class yang merepresentasikan seorang dokter.
Setiap dokter memiliki 3 atribut:
Nama → Menyimpan nama dokter.
Spesialisasi → Menyimpan bidang spesialisasi dokter.
Jadwal → Menyimpan jadwal praktik dokter.

• terdapat Constructor digunakan untuk membuat objek dokter dengan nilai awal.
this.nama → Menyimpan nilai parameter nama ke atribut nama dalam objek.

• Getter Methods (Akses Data Dokter)
Digunakan untuk mengambil data dokter saat ingin ditampilkan di menu.

• Fungsi main() (Eksekusi Program)
Fungsi utama untuk mengeksekusi program.

• Scanner untuk Input User
Digunakan untuk membaca input dari user.

• List (ArrayList) untuk Menyimpan Data Dokter
ArrayList<> digunakan untuk menyimpan banyak objek dokter secara dinamis.
Setiap kali user menambahkan dokter, data akan disimpan dalam daftarDokter.

• Perulangan while(true) (Loop Menu)
while(true) → Program akan terus berjalan sampai user memilih menu keluar (4).
User diminta memilih menu (1-4) menggunakan Scanner.

Langkah-langkah yang dilakukan:
Menampilkan menu utama dengan opsi:
1. Tambah Dokter
2. Tampilkan Jadwal Dokter
3. Cari Dokter Berdasarkan Spesialisasi
4. Hapus Dokter
5. Keluar

Pemrosesan Pilihan Pengguna:
Menu 1: Tambah Dokter
Meminta User memasukkan nama, spesialisasi, dan jadwal dokter. Menampilkan pesan konfirmasi bahwa dokter berhasil ditambahkan.
Menu 2: Tampilkan Jadwal Dokter
Jika belum menginput Menu 1 daftarDokter kosong, menampilkan pesan bahwa belum ada dokter terdaftar. Jika tidak kosong, menampilkan daftar dokter beserta spesialisasi dan jadwal prakteknya.
Menu 3: Cari Dokter Berdasarkan Spesialisasi
Meminta User memasukkan spesialisasi yang ingin dicari., mencari dokter dengan spesialisasi tersebut dalam daftarDokter. Jika ditemukan, menampilkan nama dan jadwal dokter tersebut. Jika tidak ditemukan, menampilkan pesan bahwa dokter dengan spesialisasi tersebut tidak ditemukan.
Menu 4: Hapus Dokter
Meminta User memasukkan nama dokter yang ingin dihapus. Jika dokter ditemukan dan dihapus, menampilkan pesan konfirmasi. Jika tidak ditemukan, menampilkan pesan bahwa dokter tidak ditemukan.
Menu 5: Keluar
Menampilkan pesan terima kasih dan mengakhiri loop untuk keluar dari program.
Opsi Lain:
Menampilkan pesan bahwa pilihan tidak valid dan meminta pengguna untuk mencoba lagi.
