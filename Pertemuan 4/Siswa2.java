//Kelas Siswa Menggunakan Keyword This

public class Siswa2 {
	public int nrp;

	public Siswa2(int nrp){
		nrp = nrp;
	}
	public void setNrp(int nrp) {
		this.nrp = nrp;
	}
	public int getNrp() {
		return nrp;
	}
}


/*Keterangan : 
	Pada class Siswa di atas, nama variabel
	dari parameter dibuat sama dengan nama atribut. Hal tersebut
	tidak menimbulkan error karena memang Java compiler tahu maknanya.
	namun bagi sebagian oranga akan bingung terhadap code diatas, maka adanya keyword this yang-
	berguna untuk merujuk kepada data atribut, constructor dan method yang ada di class ini (yang
	aktif sekarang). This juga dapat menghilangkan ambigu.

	pada code diatas juga terdapat 3 method :
	- constractor
	-mutator
	- accessor
*/