public class Array3 {
    
    public static void main(String args[]) {
        int[][] arrx = new int[3][3];
        int sum =0;
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3;
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6;
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9;
       
        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);

        for (int[] arrx1: arrx){
            for (int arrx2: arrx1){
                sum+=arrx2;
            }
        }
        System.out.println("Jumlah data : "+sum);
    }
}

/*

    baris ke 6-14 adalah nilai array
    baris ke 16 untuk menampilkan nilai array 2D pada [0][0]
    baris ke 17 untuk menampilkan nilai array 2D pada [0][1]
    baris ke 18 untuk menampilkan nilai array 2D pada [0][2]
    baris ke 19 untuk menampilkan nilai array 2D pada [1][0]
    baris ke 20 untuk menampilkan nilai array 2D pada [1][1]
    baris ke 21 untuk menampilkan nilai array 2D pada [1][2]
    baris ke 22 untuk menampilkan nilai array 2D pada [2][0]
    baris ke 23 untuk menampilkan nilai array 2D pada [2][1]
    baris ke 24 untuk menampilkan nilai array 2D pada [2][2]
    baris ke 26 untuk melakukan Looping For each yaitu memindahkan semua data dari Array 2D arrx ke array 1D arrx1
    baris ke 27 untuk melakukan Looping For each yaitu memindahkan semua data dari Array arrx1 ke arrx2
    baris ke 28 untuk menjumlahkan semua data dari tiap array hingga batas arrx2 kemudian disimpan kedalam sum
    baris ke 31 untuk menampilkan jumlah data yang telah disimpan di sum

*/