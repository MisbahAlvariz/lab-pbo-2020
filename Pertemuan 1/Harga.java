import java.util.Scanner;

class Harga{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int jumlahBarang;
		float diskon = 15.0f;
		float hargaAwal, hargaAkhir, hargaPerunit;

		System.out.print("Jumlah Barang= ");
		jumlahBarang = in.nextInt();

		System.out.print("Harga Perunit= ");
		hargaPerunit = in.nextFloat();

		hargaAwal = jumlahBarang * hargaPerunit;

		hargaAkhir = hargaAwal - (hargaAwal * diskon * 0.01f);

		System.out.println("Harga Akhir= " +hargaAkhir);

	}
}