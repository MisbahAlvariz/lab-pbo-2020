public class CobaContinue{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++){
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}

/*
	Program diatas merupakan contoh Continue dimana Continue memyebabkan suatu kondisi untuk melanjutkan ke tahapan selanjutnya pada perulangan.

	pada program diatas terdapat int i dan int j
		int i akan melakukan perulangan sebanyak 10 kali (0-9) kebawah karena i<10 dimana pada setiap barisnya akan terdapat 1 "*"
		kemudian int j akan melakukan perulangan kesamping sebanyak j<i+1 dimana "*" pada setiap baris akan bertambah 1 lebih banyak dari baris sebelumnya 
		namun terdapat terdapat seleksi If dan Continue yaitu apabila j telah sama dengan 5 maka perulangan j akan dilanjutkan ke tahapan selanjutnya pada perulangan. sehingga menghasilkan Output yaitu:
		*
		**
		***
		****
		*****
		*****
		******
		*******
		********
		*********

*/