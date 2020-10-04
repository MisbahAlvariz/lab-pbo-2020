public class IfElseExample 
{	
	public static void main(String[] args) 
	{
		int number=13;

		if(number%2==0){ //Keadaan 1
			System.out.println("Angka genap"); 
		}
			else{ //Keadaan 2
				System.out.println("Angka ganjil");

			}
	}
}

/*
	program diatas merupakan contoh dari seleksi If-Else dimana Pernyataan if hanya akan dilakukan jika keadaan mengembalikan nilai boolean true. Jika if mengembalikan nilai false maka pernyataan yang ada dalam else akan dilakukan.

	pada program diatas terdapat variabel number dengan nilai 13 bertipe data integer
		jika nilai varibel number dibagi dengan 2 dan sisanya = 0 maka output yang dihasilkan adalah  "Angka Genap"
		apabila nilai boolean dari keadaan pertama bukan True yang artinya nilai variabel mumber dibagi dengan 2 dan sisanya bukan/selain 0 maka output yang dihasilkan adalah "Angka Ganjil" 
	maka disini Output yang dihasilkan adalah "Angka Ganjil" karena 13 dibagi dengan 2 sisanya 1 bukan 0.
*/
