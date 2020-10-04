import java.util.Scanner;

public class IfExample 
{	
	public static void main(String[] args) 
	{ 
		int age=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda:"); 
		age = sc.nextInt();
		
		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}

/*
	Program di atas adalah contoh seleksi IF dimana Keadaan akan mengembalikan nilai boolean. Pernyataan if hanya akan dilakukan jika keadaan mengembalikan nilai boolean true.
	pada program diatas apabila kita memasukan umur diatas atau sama dengan 17 tahun maka program akan menghasilkan Output "Anda sudah Boleh Buat KTP"
*/