import java.util.Random;
	
public class RandomRange {
 	public static void main(String[] args) {
 		Random num = new Random();
 		int randomnum = num.nextInt(10)+4;
 		System.out.println("Random Number: " + randomnum);
 	}
}

/*
Keterangan code:
	hasil compilasi code diatas menghasilkan:
	Random Number: 4

	Nilai acak tersebut bisa didapatkan dengan menggunakan class Random.
	Class Random terletak di dalam package java.util. Class Random memiliki method untuk mengembalikan
	nilai acak yang bertipe integer, double, Boolean, float dan long.

*/