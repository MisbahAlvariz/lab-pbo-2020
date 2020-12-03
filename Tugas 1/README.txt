NAMA	: M. MISBAH ALVARIZ
NIM	: 1908107010006

<<<< DESKRIPSI PROGRAM >>>>

Program tersebut merupakan program sederhana untuk mengelola penumpang di bus Trans Koetaradja dengan ketentuan:
1.	Bus hanya memiliki 6 kursi penumpang, yang terdiri dari 4 kursi penumpang biasa dan 2 kursi prioritas.
2.	Kursi prioritas hanya dapat diisi oleh orang-orang berikut : 
	Lansia : umur lebih dari 60 tahun 
	Anak-anak : umur kurang dari 10 tahun 
	Dan Ibu hamil
3.	Penumpang biasa dilarang duduk di kursi prioritas
4.	Penumpang prioritas boleh duduk di kursi biasa.
5.	Penumpang tidak bisa lagi menaiki bus jika bus sudah penuh.

<<<< PENJELASAN CLASS DAN METHOD >>>>

1. Class Penumpang
	Class ini mewakili entitas penumpang bus
	Satu objek penumpang mewakili satu penumpang
	Setiap penumpang mempunyai attribut nama, umur, dan status hamil
	Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
	Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.

2. Class Bus
	Class ini mewakili bus
	Class ini memiliki attribute berupa objek dari Class Penumpang
		Attribute penumpangBiasa berisi penumpang biasa (minimal 0, maksimal 4)
		Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
		Method getPenumpang….() mengembalikan list penumpang yang diminta.
		Method getJumlahPenumpang….() mengembalikan jumlah penumpang yang diminta.
		Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus (jika ada kursi untuk penumpang tsb).
			Method ini mengembalikan true jika penumpang berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang, dan mengembalikan false jika penumpang tidak bias naik.
		Method turunkanPenumpang(nama) menerima parameter nama penumpag. 
			Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan kembalikan nilai true. Sebaliknya, kembalikan false.
		Method toString() untuk mencetak daftar nama Penumpang Biasa, Penumpang Prioritas, dan Jumlah semua penumpang.

3. Class Main
	Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus.



<<<< INSTALASI PROGRAM >>>>

1. Buka Folder Tugas 1
	* D:\Praktikum PBO 2020>cd Tugas 1

2. Complie Code Program
	* D:\Praktikum PBO 2020\Tugas 1>javac PenumpangBus.java

3. Run Program
	* D:\Praktikum PBO 2020\Tugas 1>java PenumpangBus


<<<< PENJELASAN CODE >>>>

*** CODE Penumpang.java ***

Line 7-9   : Deklarasi variable class penumpang
Line 11    : Method public Penumpang
Line 17    : Method String getNama
Line 21    : Method int getUmur
Line 25    : Method bolean getHamil


*** CODE Bus.java ***

Line 6-7     : Import Package Java
Line 10-12   : Deklarasi variable class Bus
Line 18-20   : Deklarasi variable baru Method Bus
Line 24      : Method ArrayList getPenumpangBiasa
Line 33      : Method ArrayList getPenumpangPrioritas
Line 43      : Method int getJumlahPenumpangBiasa, Menampilkan dan memberikan jumlah pada penumpang di kursi Biasa
Line 49      : Method int getJumlahPenumpangPrioritas, Menampilkan dan memberikan jumlah pada penumpang di kursi Prioritas
Line 55      : Method int getJumlahSemuaPenumpang, Menampilkan dan memberikan jumlah pada penumpang di semua kursi 
Line 61      : Method boolean naikPenumpang, untuk kursi biasa dibatasi 4 dan kursi prioritas dibatasi 2. Pada :
		Line 65-67 : Apabila kursi prioritas tersedia dan umur < 10th atau umur > 60th atau Hamil, maka akan ditampilkan "Penumpang Prioritas Bernama [] <Berhasil> Ditambahkan!"
		Line 68-70 : Apabila kursi biasa tersedia umur < 10th atau umur > 60th atau Hamil, maka akan ditampilkan "Penumpang Prioritas Bernama [] <Berhasil> Ditambahkan!"
		Line 72-74 : Apabila kursi biasa tersedia, maka akan ditampilkan "Penumpang Biasa bernama [] <Berhasil> Ditambahkan!"
		Line 75-78 : Apabila kursi tidak tersedia, maka akan ditampilkan "Mohon Maaf, Tidak Ada Kursi yang Kosong!!"
Line 82  : Method boolean turunkanPenumpang. Bila :
		Line 84-93  : untuk setiap penumpang Biasa, apabila memiliki nama yang sesuai input, maka akan dihapus dan apabila memiliki nama tidak sesuai maka
			     akan ditampilkan "Mohon Maaf, Penumpang yang dimaksud TIDAK ADA!!"
		Line 95-105 : untuk setiap penumpang Prioritas, apabila memiliki nama yang sesuai input, maka akan dihapus dan apabila memiliki nama tidak sesuai maka
			     akan ditampilkan "Mohon Maaf, Penumpang yang dimaksud TIDAK ADA!!"
Line 107  : Deklarasi variable Method toString, dan 
		Line 111-113 : Memindahkan array penumpang biasa ke result1
		Line 115-117 : Memindahkan array penumpang prioritas ke result2
		Line 119-123 : Bila Array Penumpang Biasa kosong, maka akan ditampilkan "Daftar Nama Penumpang Biasa = <kosong>" dan jika nama penumpang biasa ada, 
			       akan ditampilkan "Daftar Nama Penumpang Biasa =  ...."
		Line 125-129 : Bila Array Penumpang Prioritas kosong, maka akan ditampilkan "daftar nama penumpang Prioritas = <kosong>" dan jika nama penumpang Prio-
			       ritas ada, akan ditampilkan "Daftar Nama Penumpang Biasa =  ...."
		Line 130     : Memberikan nilai ke method toString.


*** CODE Main.java ***

Line 9-11 : Deklarasi variable class PenumpangBus
Line 13   : Method public PenumpangBus
Line 18   : deklarasi variable baru Method PenumpangBus
Line 23   : deklarasi variable baru Method Jalankan
Line 20   : Selama main = True, maka
		Line 30-39 : Menampilkan menu Bus dan Perintah Input
		Line 41-56 : Jika Input adalah 1 (Naikkan Penumpang), akan muncul perintah memasukkan Nama, Umur, dan cek Hamil. Lalu disimpan kedalam array Penumpang.
			     Kemudian dijalankan method naikPenumpang, toString, method jumlahPenumpangBiasa, method jumlahPenumpangPrioritas dan method jumlahSemuaPenumpang.
		Line 58-68 : Jika Input adalah 2 (Turunkan Penumpang), akan muncul perintah memasukkan Nama Penumpang yang ada. Kemudian dijalankan method turunkanPenumpang 
			     toString, method jumlahPenumpangBiasa, method jumlahPenumpangPrioritas dan method jumlahSemuaPenumpang..
		Line 69-76 : Jika Input adalah 3 (Lihat Penumpang), akan dijalankan method toString, method jumlahPenumpangBiasa, method jumlahPenumpangPrioritas dan method jumlahSemuaPenumpang..
		Line 77-78 : Jika Input adalah 4 (exit), Program akan keluar.
		Line 80    : Jika Input tidak sesuai, akan menampilkan "Pilihan Salah!"


