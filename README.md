# No.1 Program Looping Angka dengan Kondisi Khusus
## Deskripsi
Program ini adalah aplikasi Java yang meminta pengguna untuk memasukkan angka akhir perulangan. Program akan melakukan iterasi dari 1 hingga angka yang dimasukkan oleh pengguna. Selama iterasi, program akan mencetak:
* "OKYES" jika angka tersebut habis dibagi 3 dan 4.
* "YES" jika angka tersebut hanya habis dibagi 3.
* "OK" jika angka tersebut hanya habis dibagi 4.
* Angka itu sendiri jika tidak memenuhi kondisi di atas.

# No.2  Program Algoritma dengan Empat Bagian
## Deskripsi
Program ini adalah aplikasi Java yang meminta pengguna untuk memasukkan nilai n. Program akan menampilkan hasil dari empat algoritma berbeda berdasarkan nilai n yang dimasukkan.
## Penjelasan Algoritma
#### Algoritma Bagian A
Algoritma ini mencetak angka dari 1 hingga n secara berulang pada setiap baris hingga nilai dari angka tersebut.
#### Algoritma Bagian B
Algoritma ini mencetak angka dari 1 hingga n, dan kemudian mencetak angka secara menurun hingga 1 pada setiap baris.
#### Algoritma Bagian C
Algoritma ini mencetak angka secara bertingkat dari 1 hingga n, kemudian menurun kembali hingga 1 pada setiap baris.
#### Algoritma Bagian D
Algoritma ini mengisi matriks n x n dengan angka yang berurutan, dengan arah pengisian setiap kolomnya bergantian dari atas ke bawah dan dari bawah ke atas.

# No.3 Program Menghapus Angka Kelipatan Tiga dan Mengurutkan
## Deskripsi
Program ini adalah aplikasi Java yang mengelola sebuah ArrayList berisi sejumlah bilangan bulat. Program akan menghapus semua bilangan yang merupakan kelipatan dari tiga, kemudian mengurutkan sisa bilangan tersebut dalam urutan menaik.
## Penjelasan Kode
#### main
* Membuat sebuah ArrayList arr dan mengisinya dengan bilangan bulat: 12, 9, 13, 6, 10, 4, 7, 2.
* Memanggil metode removeThree untuk menghapus bilangan yang merupakan kelipatan dari tiga dan mengurutkan sisa bilangan.
* Mencetak hasil yang dikembalikan oleh metode removeThree.
#### removeThree
* Menerima sebuah ArrayList n sebagai parameter.
* Membuat sebuah ArrayList container untuk menyimpan bilangan yang bukan kelipatan dari tiga.
* Menggunakan perulangan for-each untuk memeriksa setiap bilangan dalam n.
* Menambahkan bilangan ke container jika bilangan tersebut bukan kelipatan dari tiga.
* Mengurutkan container menggunakan Collections.sort.
* Mengembalikan container yang sudah diurutkan.

# No.4 Dokumentasi SQL Queries
## Deskripsi
Dokumentasi ini menjelaskan beberapa kueri SQL yang digunakan untuk mengelola dan mendapatkan informasi dari beberapa tabel dalam sebuah database. Tabel-tabel yang digunakan meliputi barang, pelanggan, dan transaksi.

#### Struktur Tabel
1. barang
  * kode: Kode unik barang
  * nama: Nama barang
  * harga: Harga barang
2. pelanggan
  * kode: Kode unik pelanggan
  * nama: Nama pelanggan
  * alamat: Alamat pelanggan
3. transaksi
  * kode: Kode unik transaksi
  * tanggal: Tanggal transaksi
  * kode_pelanggan: Kode pelanggan yang melakukan transaksi
  * kode_barang: Kode barang yang dibeli
  * jumlah_barang: Jumlah barang yang dibeli
