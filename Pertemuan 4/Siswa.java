public class Siswa {
	private int nrp;
		public Siswa(int nrpx) {
		nrp = nrpx;
	}
	public void setNrp(int nrpx) {
		nrp = nrpx;
	}
	public int getNrp() {
		return nrp;
	}
}

/*Keterangan code:
	Enkapsulasi (encapsulation) merupakan proses untuk menyembunyikan hal-hal yang harus
	disembunyikan dan menampakkan hal-hal yang boleh ditampakkan. Hal-hal yang perlu disembunyikan
	adalah atribut/ instance variable dan implementasi yang ada dalam method. Sedangkan yang boleh
	ditampakkan adalah nama method. 

	Dapat kita lihat pada class TesSiswa, atribut nrp dapat dengan mudahnya diubah di luar dari class Siswa.
	Berarti nilai nrp bisa sangat bebas diubah dimanapun. Hal ini sangat berbahaya. Oleh karena itu atribut
	di-enkapsulasi dengan hak akses private. Ubah hak akses atribut nrp menjadi private. Kemudian coba
	kompilasi class TesSiswa maka akan muncul error.

	Hal yang sama juga berlaku pada method. Jika method dibuat private maka akan muncul error pada
	class Tesiswa. 

	karena jika hak akses nrp dalam bentuk private akan menghasilkan compilasi error 
	maka saya menggantikan hak akses nya menjadi public. 

	pada code diatas berhubungan dengan Class TesSiswa.java
*/