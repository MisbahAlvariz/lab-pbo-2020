public class TesSiswa {
 	public static void main(String[] ar) {
 		Siswa s = new Siswa(12345);
 		s.nrp = 8030001;
 		System.out.println(s.nrp);
		
		s.nrp = 8030002;
 		System.out.println(s.nrp);
 	}
}

/*Keterangan code:
    code diatas menghasilkan error seperti:

    TesSiswa.java:4: error: nrp has private access in Siswa
                    s.nrp = 8030001;
                     ^
    TesSiswa.java:5: error: nrp has private access in Siswa
                    System.out.println(s.nrp);
                                        ^
    TesSiswa.java:7: error: nrp has private access in Siswa
                    s.nrp = 8030002;
                     ^
    TesSiswa.java:8: error: nrp has private access in Siswa
                    System.out.println(s.nrp);
                                        ^
    4 errors

    hal ini disebabkan karena Hak ases pada class Siswa bersifat private solusinya pada class Siswa harus diberi
    hak ases public
 */