public class CariPanjangElemen{

public static void main(String args[]) {
	int x[][][][]=new int[2][][][];
	x[0]=new int[1][][];
	x[0][0]=new int[2][];
	x[0][0][0]=new int[3];
	x[0][0][1]=new int[2];
	x[1]=new int[2][][];
	x[1][0]=new int[1][];
	x[1][0][0]=new int[2];
	x[1][1]=new int[2][];
	x[1][1][0]=new int[1];
	x[1][1][1]=new int[3];
	
	System.out.println(x.length);
	System.out.println(x[0].length);
	System.out.println(x[0][0].length);
	System.out.println(x[0][0][0].length);
	System.out.println(x[0][0][1].length);
	System.out.println();
	System.out.println(x[1].length);
	System.out.println(x[1][0].length);
	System.out.println(x[1][0][0].length);
	System.out.println(x[1][1].length);
	System.out.println(x[1][1][0].length);
	System.out.println(x[1][1][1].length);
	}

}

/*
 	Program diatas merupakan program untuk melihat panjang array

	baris ke 4-14 adalah nilai array
	baris ke 16 untuk menampilkan panjang array x
	baris ke 17 untuk menampilkan panjang array x[0]
	baris ke 18 untuk menampilkan panjang array x[0][0]
	baris ke 19 untuk menampilkan panjang array x[0][0][0]
	baris ke 20 untuk menampilkan panjang array x[0][0][1]
	baris ke 21 untuk menampilkan (void) untuk untuk memindahkan output selanjutnya ke baris baru
	baris ke 22 untuk menampilkan panjang array x[1]
	baris ke 23 untuk menampilkan panjang array x[1][0]
	baris ke 24 untuk menampilkan panjang array x[1][0][0]
	baris ke 25 untuk menampilkan panjang array x[1][1]
	baris ke 26 untuk menampilkan panjang array x[1][1][0]
	baris ke 27 untuk menampilkan panjang array x[1][1][1]
*/
