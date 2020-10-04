public class Logika
{
	public static void main(String args[]) 
	{ 
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a&&b)); 
		System.out.println("a || b = " + (a||b) );
		System.out.println("!(a && b) = " + !(a && b));
	}	
}

/*
	program diatas merupakan program operator logika yang digunakan untuk membandingkan 2 operan yang bertipe boolean

	a && b (bernilai true apabila kedua operan bernilai true, maka disini output yang dihasilkan adalah FALSE karena b bernilai FALSE)
	a || b (bernilai false apabila kedua operan bernilai false, maka disini output yang dihasilkan adalah TRUE karena keduanya tidak FALSE)
	!(a && b) (merupakan operator yang membalikan nilai boolean yang artinya jika sebelumnya nilai (a && b) adalah FALSE maka sekarang bernilai TRUE)
*/
