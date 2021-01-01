
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		super(nama, gaji);
		this.departemen = departemen;
	}

	public void setDepartemen(String departemen) {
		this.departemen = departemen;
	}

	public String getDepartemen() {
		return this.departemen;
	}
}