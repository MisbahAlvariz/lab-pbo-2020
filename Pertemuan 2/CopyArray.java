public class CopyArray{

public static void main(String args[]) {
	int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
	int[] array2 = new int[3];

	System.arraycopy(array1,0,array2,0,3);
	System.out.print("Array1 : ");

	for (int i=0; i<array1.length; i++) 
		System.out.print(array1[i] + " ");
	System.out.println();

	System.out.print("Array2 : ");
	for (int i=0; i<array2.length; i++)
		System.out.print(array2[i] + " ");
	}
}

/*
	Program diatas merupakan program untuk menyalin array ke array lain

	baris ke 7 untuk mengcopy nilai array1 mulai dari array1[0] ke nilai array2[0] sebanyak 3 kali atau dapat ditulis:
 		array[0] ke array2[0]
		array[1] ke array2[2]
		array[2] ke array2[2]
	baris ke 8 untuk menampilkan nilai dari Array1 
	baris ke 10 untuk melakukan looping sampai batas array1
	baris ke 11 untuk menampilkan nilai dari array1 sesuai i kemudian sesudahnya ditambahkan spasi 
	baris ke 12 untuk memindahkan output selanjutnya ke baris baru 
	baris ke 14 untuk menampilkan nilai dari Array2 
	baris ke 13 untuk melakukan looping sampai batas array2
	baris ke 14 untuk menampilkan nilai dari array2 sesuai i kemudian sesudahnya ditambahkan spasi 
*/
