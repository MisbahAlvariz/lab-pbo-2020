public class GetArguments{

public static void main(String args[]) { 
	System.out.println("Tanggal : " + args[0]);
	System.out.println("Bulan : " + args[1]);
	System.out.println("Tahun : " + args[2]);
	}
}

/*
	Program diatas merupakan program untuk mendapatkan nilai argumen pada method main

	Pada saat menjalankan program sesudah (java GetArgumen) barulah menginput tanggal yang diperlukan misalnya (23 maret 2017) hal ini karena Method main memiliki parameter berupa array bertipe String. Berapapun argumen yang diketik saat running, akan disimpan dalam array tersebut dan diakses dengan menggunakan indeks.
	baris ke 4 untuk  Menampilkan data array string yang disimpan pada args[0]
	baris ke 5 untuk Menampilkan data array string yang disimpan pada args[1]
	baris ke 6  Menampilkan data array string yang disimpan pada args[2]
*/