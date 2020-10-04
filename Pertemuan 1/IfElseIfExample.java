public class IfElseIfExample 
{
	public static void main(String[] args) 
	{ 
		int marks=65;
		
		if(marks<50){ //Keadaan 1
			System.out.println("fail");
		}
			else if(marks>=50 && marks<60){ //Keadaan 2
				System.out.println("D grade");
			}
			
			else if(marks>=60 && marks<70){ //Keadaan 3
				System.out.println("C grade");
			}

			else if(marks>=70 && marks<80){ //Keadaan 4
				System.out.println("B grade");
			}

			else if(marks>=80 && marks<90){ //Keadaan 5
				System.out.println("A grade");
			}
	
			else if(marks>=90 && marks<100){ //Keadaan 6
				System.out.println("A+ grade");
			}

			else{
				System.out.println("Invalid!");
			}
	}
}

/*
	program diatas adalah contoh dari seleksi If-ElseIf yang dimana Pernyataan if akan dilakukan jika keadaan 1 mengembalikan nilai boolean true. Jika tidak maka else if berikutnya akan dicek, jika true akan dilakukan pernyataan. Namun jika masih salah, akan dilanjutkan ke else if berikutnya. Hingga jika semua pilihan else if tidak ada yang true, maka pernyataan yang ada dalam else akan dilakukan. 
		
	Pada program diatas terdapat variabel marks dengan nilai 65 bertipa data integer
		Jika nilai variabel marks <50 maka Output yang dihasilkan adalah "Fail"
		jika keadaan 1 masih False yang artinya nilai marks >=50 dan <60 maka output yang dihasilkan adalah "D grade"
		jika keadaan 2 masih False yang artinya nilai marks >=60 dan <70 maka output yang dihasilkan adalah "C grade"
		jika keadaan 3 masih False yang artinya nilai marks >=70 dan <80 maka output yang dihasilkan adalah "B grade"
		jika keadaan 4 masih False yang artinya nilai marks >=80 dan <90 maka output yang dihasilkan adalah "A grade"
		jika keadaan 5 masih False yang artinya nilai marks >=90 dan <100 maka output yang dihasilkan adalah "A+ grade"	
		Jika Semua keadaan masih False maka output yang dihasilkan adalah "Invalid!" 
	Maka Pada Program di atas nilai marks = 65 yang artinya nilai marks terletak di >=60 dan <70 maka output yang dihasilkan adalah "C grade"
*/