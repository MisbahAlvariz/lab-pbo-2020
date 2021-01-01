public class PrintMathResult {
 
 	public static void main(String args[]) {
 		Math.sqrt(121.0); //no output
 		System.out.println("Square root: " + Math.sqrt(121.0));
 		double result = Math.min(3, 7) + Math.abs(-50);
 		System.out.println("Result is " + result);
 	}
}

/*
Keterangan code:
	pada code diatas menghasilkan compilasi:
	Square root: 11.0
	Result is 53.0

	pada code diatas terdapat Math.sqrt
	Method Math.sqrt() digunakan untuk mencari hasil dari akar kuadrat sebuah angka.
	Fungsi ini membutuhkan 1 argumen, yaitu angka yang akan dihitung.

	pada code diatas terdapat Math.abs
	Method Math.abs berfungsi untuk menghasilkan nilai absolut (nilai negatif akan menjadi positif, sedangkan nilai positif akan tetap positif). 
	Fungsi ini membutuhkan 1 argumen angka. 
*/