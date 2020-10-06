public class LoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}

/*
	Program diatas merupakan contoh program Perulangan do-while yang dipakai pada saat kita melakukan perulangan dengan jumlah yang belum diketahui pasti. Pernyataan pada do akan dikerjakan terlebih dahulu, baru setelah itu dilakukan pengecekan kondisi pada while.

	Output Pada Program diatas sama Dengan program LoopingFor dan looping While yaitu
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

	caranya pun sama yaitu:
	int i akan melakukan perulangan sebanyak 10 kali (0-9) kebawah karena i<10 dimana pada setiap barisnya akan terdapat 1 "*"
	kemudian int j akan melakukan perulangan kesamping sebanyak j<i+1 dimana "*" pada setiap baris akan bertambah 1 lebih banyak dari baris sebelumnya
*/