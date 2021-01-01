public class Siswa {
	private int nrp;
	
	public Siswa(int nrpx)
	{
	nrp = nrpx;
	}

	public void setNrp(int nrpx)
	{
	nrp = nrpx;
	}

	public int getNrp()
	{
	return nrp;
	}
}

/*Keterangan code:
1. pada code diatas terdapat method constractor, yaitu:
public Siswa(int nrpx)
	{
	nrp = nrpx;
}
method contractor merupakan method untuk memberi nilai awal pada semua atribut/ instance
variable. Pada pemrograman Java, method constructor secara default sudah ada, nilai awal yang
digunakan sesuai dengan tipe data.

2. terdapat method mutator , yaitu:
public void setNrp(int nrpx)
	{
	nrp = nrpx;
	}

Method mutator merupakan method yang digunakan untuk mengubah nilai dari atribut/ instance
variable. Method mutator biasanya bertipe data kembalian sebagai void, namun memiliki parameter.
Contoh method mutator pada class Siswa di atas adalah void setNRP(int nrpx).

3. terdapat method accessor , yaitu:
	public int getNrp()
	{
	return nrp;
	}

Method accessor merupakan method yang digunakan untuk mengakses/mengembalikan nilai dari
atribut tertentu. Method accessor memiliki tipe data kembalian sehingga memiliki keyword return di dalam methodnya. Namun method ini biasanya tidak memiliki parameter. Contoh method accessor
pada class Siswa di atas adalah int getNrp();
*/
