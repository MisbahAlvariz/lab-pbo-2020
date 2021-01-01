import java.util.Random;

public class CoinFlip {
 	public static void main(String[] args) {
 	// 50% chance heads, 50% chance tails
 		Random rand = new Random();
 		double chance = rand.nextDouble();
 		if (chance < 0.5) {
 				System.out.println("heads!");
 			} 
 		else {
 			System.out.println("tails!");
 		}
 	}
}

/*
Keterangan code:
	code diatas tentang lempar koin.
	terdapat import java.util.Random menghasilkan compilasi Random.
	objek random diatas membuat nilai acak untuk double.

	penggenerate angka acak tersebut mengacu pada system time, yang tentu saja waktu akan terus berbeda setiap harinya.
	seperti hasil compile diatas, ketika pertama saya run menghasilakn compile"tails" namun ketiga kedua kali menghasilkan 
	compile "heads!".

	Random rand = new Random(); ==>kelas Random juga harus diinstantiasi untuk membuat suatu object Random.
	double chance = rand.nextDouble(); ===> Kode di atas kamu pasti juga tahu gunanya, kita memilih sebuah double random dan memasukkannya ke dalam variabel rand

*/