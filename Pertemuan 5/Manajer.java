public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		Pegawai p = new Pegawai(nama, gaji);
		this.departemen = departemen;
	}

	public void setDepartemen(String departemen) {
	this.departemen = departemen;
	}

	public String getDepartemen() {
	return this.departemen;
	}
}

/*
Keterangan code: 
	code manajer mengahasilkan error  yaitu
	Manajer.java:4: error: constructor Pegawai in class Pegawai cannot be applied to given types;
	        public Manajer(String nama, double gaji, String departemen) {
	                                                                    ^
	  required: String,double
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	1 error


	disebabkan tidak adanya penurunan Method constructor tidak diturunkan ke sub class, nah disini kita mneurunkan 
	parameter method constructor.
*/