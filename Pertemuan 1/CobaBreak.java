public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
			if(j==5)
			break;
			System.out.print('*');
			}

			System.out.println();
		}
	}
}

/*
	Program diatas merupakan contoh Break dimana Break menyebabkan suatu kondisi untuk keluar dari perulangan.

	pada program diatas terdapat int i dan int j
		int i akan melakukan perulangan sebanyak 10 kali (0-9) kebawah karena i<10 dimana pada setiap barisnya akan terdapat 1 "*"
		kemudian int j akan melakukan perulangan kesamping sebanyak j<i+1 dimana "*" pada setiap baris akan bertambah 1 lebih banyak dari baris sebelumnya 
		namun terdapat terdapat seleksi If dan break yaitu apabila j telah sama dengan 5 maka perulangan j akan dihentikan sehingga menghasilkan Output yaitu:
		*
		**
		***
		****
		*****
		*****
		*****
		*****
		*****
		*****
*/
