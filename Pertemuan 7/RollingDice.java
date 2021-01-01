import java.util.Random;

public class RollingDice {
 	public static void main(String[] args) {
 
 		Random rand = new Random();
 		int tries = 0;
 		int sum = 0;
 		while (sum != 7) {
 			// roll the dice once
 			int roll1 = rand.nextInt(6) + 1;
 			int roll2 = rand.nextInt(6) + 1;
 			sum = roll1 + roll2;
 			System.out.println(roll1 + " + " + roll2 + " = " + sum);
 			tries++;
 		}
 		System.out.println("You won after " + tries + " tries!");
 	}
}

/*
Keterangan code:
	code diatas merupakan permainan lempar dua dadu.

	int roll1 = rand.nextInt(6) + 1;
	int roll2 = rand.nextInt(6) + 1;
	==> dimana range untuk dadu diatas adalah 1-6

	sum = roll1 + roll2;
	System.out.println(roll1 + " + " + roll2 + " = " + sum);
	==>lalu nilai acak dua dadu diatas dijumlahkan.

	tries++;
	==> nilai akan terus diincrementkan selama jumlah tdiak sama dengan 7.

	lalu jika looping sudah berhenti ketika mencapai sum=7, maka keluar output:
	You won after

*/