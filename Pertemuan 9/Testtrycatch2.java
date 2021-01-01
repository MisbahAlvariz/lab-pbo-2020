public class Testtrycatch2{
 
 	public static void main(String args[]){
 		
 		try{
 			int data=10/0;
 		}catch(ArithmeticException e){System.out.println(e);}

 		System.out.println("rest of the code...");
 	}
} 

/*
Keterangan code:
	output dari code diatas:
	java.lang.ArithmeticException: / by zero
	rest of the code...

	Catch dapat dibuat lebih dari satu jika kode program yang dibuat akan menghasilkan banyak exception.
	Blok catch yang banyak (lebih dari satu) haruslah disusun dari yang paling spesifik hingga yang paling
	umum. Jika muncul exception tertentu, maka catch yang paling sesuai yang akan digunakan.
	Try dapat dibuat nested/bersarang. Nested try bermakna try berada di dalam try yang lain. Nested try
	dibuat bila diperlukan.
	Blok finally akan selalu dieksekusi saat ada exception maupun tidak ada. Blok finally ditulis sesudah blok
	try-catch. Blok finally biasanya digunakan untuk eksekusi kode penting seperti tutup connection, tutup
	stream. 

*/