import java.util.Scanner;
class InputHelper{
 
 	public String getInput(String prompt) {
 		System.out.print(prompt);
 		Scanner sc = new Scanner(System.in);
 		return sc.nextLine();
 	}
}

/*Keterangan code:
	class ini berisi untuk input user
*/ 