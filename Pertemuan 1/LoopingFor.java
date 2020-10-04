public class LoopingFor
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
		System.out.print('*');
		System.out.println();
		}
	}
}

/*
	Program diatas adalah contoh looping for yang dipakai pada saat kita melakukan perulangan dengan jumlah yang sudah diketahui pasti.

	pada program diatas terdapat int i dan int j
		int i akan melakukan perulangan sebanyak 10 kali (0-9) kebawah karena i<10 dimana pada setiap barisnya akan terdapat 1 "*"
		kemudian int j akan melakukan perulangan kesamping sebanyak j<i+1 dimana "*" pada setiap baris akan bertambah 1 lebih banyak dari baris sebelumnya 
	maka outputnya adalah
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	**********  
*/