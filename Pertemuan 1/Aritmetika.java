class Aritmetika 
{
	public static void main(String args[]) 
	{	
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		
		System.out.println("a + b = " + (a + b) ); 
		System.out.println("a - b = " + (a - b) ); 
		System.out.println("a * b = " + (a * b) );
		System.out.println("b / a = " + (b / a) ); 
		System.out.println("b % a = " + (b % a) ); 
		System.out.println("c % a = " + (c % a) );
		System.out.println("a++ = " + (a++) );
		System.out.println("b-- = " + (a--) );
		System.out.println("d++ = " + (d++) ); 
		System.out.println("++d = " + (++d) );
	}
}
/*
Program diatas merupakan program operator aritmatika dimana terdapat=
	a+b = 30 (artinya a ditambahkan dengan b)
	a-b = -10 (artinya a dikurangkaan dengan b)
	a*b = 200 (artinya a dikalikan dengan b)
	b/a = 2 (artinya b dibagi dengan a)
	b%a = 0 (artinya ketika b dibagi dengan a tidak memiliki sisa)
	c%a = 5 (artinya ketika c dibagi dengan a memiliki sisa 5)
	a++ = 10 (artinya a di increment atau di tambahkan nilai operan 1, namun karena a++ variabel akan menampilkan nilainya terlebih dahulu yaitu 10 baru selanjutnya variabel a akan ditambah 1 nilai dan cara ini biasa disebut dengan postincrement )
	b-- = 11 (artinya b di decrement namun disimpan pada variabel a, yang dimana variabel a telah di increment sebelumnya makanya bernilai 11. proses ini juga merupakan postdecrement yang mana variabel a akan menampilkan nilainya terlebih dahulu baru akan ditambahkan 1 nilai)
	d++ = 25 (artinya d di postincrement atau d akan menampilkan nilainya terlebih dahulu baru akan ditambahkan 1 nilai sehingga nilainya adal 25)
	++d = 27 (sebelumnya variabel d telah mendapat postincrement yang membuat nilai d menjadi 26, dan pada proses ini d kembali mendapat preincrement yaitu variabel d akan langsung mendapat penambahan  1 sehinnga hasil akhirnya adalah 27 )
*/