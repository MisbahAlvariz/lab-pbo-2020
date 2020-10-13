public class CopyArray3{

	public static void main(String args[]) {
		String str1 = "Informatika Universitas Syiah Kuala";
		System.out.println(str1.startsWith("Inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf",1));
		System.out.println(str1.startsWith("Inf",2));
		System.out.println(str1.startsWith("Inf",3));
	}
}

/*
	Program diatas merupakan program untuk menguji awalan atau akhir suatu string berntebet

	baris ke 4 untuk menginput data str1
	baris ke 5 untuk membandingkan apakah data str1 diawali dengan "Inf" atau tidak, karena diawali dengan "Inf" maka akan menampilkan nilai TRUE
	baris ke 6 untuk membandingkan apakah data str1 diakhiri dengan "kuala" atau tidak, karena str1 diakhiri dengan "Kuala" (K di str1 adalah huruf kapital) maka akan menampilkan nilai FALSE
	baris ke 7 untuk membandingkan apakah data pada memori str[1] diawali dengan "Inf" atau tidak, karena str[1] diawali dengan "nfo" maka akan menampilkan nilai FALSE 
	baris ke 8 untuk membandingkan apakah data pada memori str[2] diawali dengan "Inf" atau tidak, karena str[2] diawali dengan "for" maka akan menampilkan nilai FALSE 
	baris ke 9 untuk membandingkan apakah data pada memori str[3] diawali dengan "Inf" atau tidak, karena str[3] diawali dengan "orm" maka akan menampilkan FALSE di layar
 
*/