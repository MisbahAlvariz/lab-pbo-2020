public class TesSiswa3
{
 public static void main(String[] ar)
 {
 Siswa2 s = new Siswa2();
 Siswa2 ss = new Siswa2(8030001, "Upin");

 //ini akan menimbulkan error
 //Siswa sss = new Siswa(8030002);
 System.out.println(s);
 System.out.println(ss);
 }
}

/*Keterangan code:
	hasil compile code diatas error:
	TesSiswa3.java:5: error: constructor Siswa2 in class Siswa2 cannot be applied to given types;
	 Siswa2 s = new Siswa2();
	            ^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	TesSiswa3.java:6: error: constructor Siswa2 in class Siswa2 cannot be applied to given types;
	 Siswa2 ss = new Siswa2(8030001, "Upin");
	             ^
	  required: int
	  found: int,String
	  reason: actual and formal argument lists differ in length
	2 errors


	disebabkan tidak ada padanan method constructor yang memiliki satu
	parameter berupa int.


*/