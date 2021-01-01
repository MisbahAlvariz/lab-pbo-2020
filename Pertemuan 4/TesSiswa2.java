public class TesSiswa2
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa();
 		Siswa ss = new Siswa(8030001, "Upin");

 		//ini akan menimbulkan error
 		//Siswa sss = new Siswa(8030002);
 		System.out.println(s.getNrp() + " " + s.getNama());
 		System.out.println(ss.getNrp() + " " + ss.getNama());
 	}
}

/*Keterangan code:
  class TesSiswa2 error, seperti berikut:
  TesSiswa3.java:5: error: constructor Siswa in class Siswa cannot be applied to given types;
                  Siswa s = new Siswa();
                            ^
    required: int
    found: no arguments
    reason: actual and formal argument lists differ in length
  TesSiswa3.java:6: error: constructor Siswa in class Siswa cannot be applied to given types;
                  Siswa ss = new Siswa(8030001, "Upin");
                             ^
    required: int
    found: int,String
    reason: actual and formal argument lists differ in length
  TesSiswa3.java:10: error: cannot find symbol
                  System.out.println(s.getNrp() + " " + s.getNama());
                                                         ^
    symbol:   method getNama()
    location: variable s of type Siswa
  TesSiswa3.java:11: error: cannot find symbol
                  System.out.println(ss.getNrp() + " " + ss.getNama());
                                                           ^
    symbol:   method getNama()
    location: variable ss of type Siswa
  4 errors

  hal tersebut dikarenakan objek s menggunakan method constructor tanpa parameter sedangkan objek ss menggunakan method
  constructor dengan dua parameter (int dan String).

*/