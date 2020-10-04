public class SwitchExample2 
{
	public static void main(String[] args) 
	{ 
		int number=20;

		switch(number){
		case 10: System.out.println("10");
		case 20: System.out.println("20");
		case 30: System.out.println("30"); 
		default: System.out.println("Not in 10, 20 or 30"); 
		}
	}
}

/*
	program diatas merupakan program yang sama dengan program SwitchExample bedanya adalah pada setiap case tidak ditambahkan brake yang mengakibatkan pilihan pada setiap case akan ditampilkan pada Output program.
*/