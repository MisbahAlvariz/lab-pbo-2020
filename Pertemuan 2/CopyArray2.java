public class CopyArray2 {

public static void main(String args[]) { 
	String str1 = "Pemrograman";
	String str2 = "Java";
	String str3 = "PemrogramanJava";

	System.out.println("String 1:"+str1);
	System.out.println("String 2:"+str2);
	System.out.println("String 3:"+str3);
	System.out.println("String 1 = String 3 ==> "+str1.equals(str3));
	System.out.println("String 2 = String 3 ==> "+str2.equals(str3));
	System.out.println("String 1 + String 2 = String 3 ==> "+(str1+str2).equals(str3));
	
	String str4 = "Universitas Syiah Kuala";
	String str5 = "universitas syiah kuala";
	System.out.println("String 4:"+str4);
	System.out.println("String 5:"+str5);

	System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
	System.out.println("String 4 = String 5 ==> " +str4.equalsIgnoreCase(str5));
	System.out.println("String 4 + String 5 = String 5 + String 4==>" +(str4+str5).equalsIgnoreCase(str5+str4));
	}
}

/*
	Program daiatas merupakan program untuk menguji kesamaan string

	baris ke 4-6 untuk menginput data string str1-3
	baris ke 8 untuk Menampilkan "String 1 : " dari nilai str1 ke layar
	baris ke 9 untuk Menampilkan "String 2 : " dari nilai str2 ke layar
	baris ke 10 untuk Menampilkan "String 3 : " dari nilai str3 ke layar
	baris ke 11 untuk Menampilkan "String 1 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 (jika iya = true, jika tidak = false) karena berbeda maka FALSE
	baris ke 12 untuk Menampilkan "String 2 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 (jika iya = true, jika tidak = false) karena berbeda maka FALSE
	baris ke 13 untuk Menampilkan "String 1 + String 2 = String 3 ==>" dan membandingkan apakah data dari str1 + str2 sama dengan str3 ((jika iya = true, jika tidak = false)) karena sama maka TRUE
	baris ke 15-16 untuk menginput data string str4-5
	baris ke 17 untuk Menampilkan "String 4 : " dari nilai str4 ke layar
	baris ke 18 untuk Menampilkan "String 5 : " dari nilai str5 ke layar
	baris ke 20 untuk Menampilkan "Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil" ke layar
	baris ke 21 untuk Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 sama dengan str5 dengan mengabaikan ada huruf kapital atau tidak (jika iya = true, jika tidak = false) karena sama maka TRUE
	baris ke 22 untuk Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 + str5 sama dengan str5 + str4 dengan mengabaikan ada huruf kapital atau tidak (jika iya = true, jika tidak = false) karena sama maka TRUE
*/