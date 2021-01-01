public class TestFinallyBlock2{
 
 	public static void main(String args[]){
 
 		try{
 			int data=25/5;
 			System.out.println(data);
 		}
 		catch(ArithmeticException e){
 			System.out.println(e);
 		}
 		finally{
 			System.out.println("finally block is always executed");
 		}
 		System.out.println("rest of the code...");
 	}
} 

/*Keterangan code:
	ketika variabel data= 25/0 , pada saat di run menghaasilkan hasil:
	java.lang.ArithmeticException: / by zero
	finally block is always executed
	rest of the code...

	ketika variabel data =25/5 , pada saat di run menghasilkam hasil:
	5
	finally block is always executed
	rest of the code...

	- Blok try akan berisi bagian yang akan menghasilkan exception.
	- Blok catch akan menangkap exception lalu menanganinya.
	- Blok finally merupakan blok yang akan selalu dilakukan, saat ada atau tiada exception. 

	Blok finally akan selalu dieksekusi saat ada exception maupun tidak ada. Blok finally ditulis sesudah blok
	try-catch. Blok finally biasanya digunakan untuk eksekusi kode penting seperti tutup connection, tutup
	stream. Ilustrasi blok finally dapat dilihat pada gambar berikut ini

*/