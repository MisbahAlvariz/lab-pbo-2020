public class Smallest
{
	public static void main(String arg[])
	{
		int a, b;
		Mulai:
		
		for(a=0; a<2; a++) //loop for ke-1
		{
			for(b=0; b<3; b++) //loop for ke-2
			{
				if(b==2)
				break Mulai;
		
				System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}
/*
	Program diatas merupakan contoh dari Break yang diberikan label yaitu cara untuk menghentikan operasi sesuai dengan looping yang kita inginkan

	Pada Program diatas break akan menghentikan operasi pada statemen Mulai, bermakna keluar dari loop for ke-1.
	sehingga Outputnya adalah 
	a=0 ; b=0
	a=0 ; b=1
*/