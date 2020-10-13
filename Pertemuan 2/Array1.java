public class Array1{

public static void main(String args[]) { 
	int nilai[]= new int[3];
	nilai[0]=70;
	nilai[1]=80;
	nilai[2]=65;
	double ratarata=0.0;

	for(int i=0; i<nilai.length; i++)
		ratarata += nilai[i];

	ratarata /= nilai.length;
		System.out.println("Nilai rata-rata = " + ratarata);
	}

}

/*
	
	Baris ke 10 = Looping hingga batas array nilai
 	Baris ke 11 = menjumlahkan semua nilai yang ada di array satu persatu dan disimpan di ratarata
	Baris ke 13 = menghitung jumlah rata-rata dari jumlah nilai array yang telah disimpan di ratarata dengan cara dibagi panjang array nilai
	Baris ke 14 = menampilkan nilai rata-rata yang ditelah dibagi sebelumnya

*/
