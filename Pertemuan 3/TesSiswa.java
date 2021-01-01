public class TesSiswa
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa(12345);

 		System.out.println(s.getNrp());

 		s.setNrp(8030001);
 		System.out.println(s.getNrp());
 	}
}

/* penjelasan code:
didalam class TesSiswa terdapat class main dimana akan menghasilkan output pada code diatas,
yaitu:
12345 
8030001

dimana nilai 12345 yang terdapat pada new siswa dimasukan kedalam method accessor pada class siswa
begitupun nilai 8030001 akan dimasukkan kedalam method mutator pada class Siswa.

*/