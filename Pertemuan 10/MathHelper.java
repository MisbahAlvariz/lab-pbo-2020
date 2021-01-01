public class MathHelper {
 
 	public static double penambahan(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 + d2;
 	}
 
 	public static double pengurangan(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 - d2;
 	}
 	
 	public static double perkalian(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 * d2;
 	}
 
 	public static double pembagian(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 / d2;
 	}
} 

/*Keterangan code:
	pada class MathHelper berisi tentang operasi kalkulatornya, dimana nilai untuk hasil pada class Kalkulator.
	yaitu:
	1. untuk pertambahan atau operasi tambah:
	public static double penambahan(String s1, String s2) {
	 		double d1 = Double.parseDouble(s1);
	 		double d2 = Double.parseDouble(s2);
	 		return d1 + d2;
	 	}
	>>> method untuk penambahan

	2. untuk pengurangan atau operasi kurang:
	public static double pengurangan(String s1, String s2) {
	 		double d1 = Double.parseDouble(s1);
	 		double d2 = Double.parseDouble(s2);
	 		return d1 - d2;
	 	}
	>>> method untuk pengurangan

	3. untuk perkalian atau operasi kali:

	 	public static double perkalian(String s1, String s2) {
	 		double d1 = Double.parseDouble(s1);
	 		double d2 = Double.parseDouble(s2);
	 		return d1 * d2;
	 	}
	>>>method untuk perkalian.

	4.untuk pembagian atau operasi bagi:
	public static double pembagian(String s1, String s2) {
	 		double d1 = Double.parseDouble(s1);
	 		double d2 = Double.parseDouble(s2);
	 		return d1 / d2;
	 	}
	>>>method untuk pembagian

*/


