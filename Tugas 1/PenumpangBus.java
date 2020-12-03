/*
    Nama : M. MISBAH ALVARIZ
    NIM  : 1908107010006
*/

import java.util.*;

public class PenumpangBus {   
    private static Scanner input;
    private boolean main;
    private int menu;

public PenumpangBus() {
        this.main = true;
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        new PenumpangBus().Jalankan();
    }

    public void Jalankan(){     
        Bus tkr = new Bus();
      
    System.out.println("\t\t\t==================================");
    System.out.println("\t\t\t||\tBUS TRANSKOETARADJA\t||");
    System.out.println("\t\t\t=================================="); 

    while(main){
        System.out.println("\n=========================");
        System.out.println("\t  MENU ");
        System.out.println("=========================");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.println("4. exit");
        System.out.println("=========================");
        System.out.print("\nPilihan = ");
        menu = input.nextInt();
  
           if (menu == 1) {         
                 System.out.print("\nNama\t\t: ");
                 String nama = input.next(); 
                 System.out.print("Umur\t\t: ");
                 int umur = input.nextInt();
                 System.out.print("Hamil [y/n]\t: "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
                 System.out.println("\n=======================================================\n"); 
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);                
                 tkr.naikPenumpang(penumpang);
                 tkr.toString();
                 tkr.getJumlahPenumpangBiasa();
                 tkr.getJumlahPenumpangPrioritas();
                 tkr.getJumlahSemuaPenumpang();
                 System.out.println("\n======================================================="); 

            }else if (menu == 2){ 
                System.out.print("\nMasukan nama yang akan dihapus: ");
                String nama = input.next();
                System.out.println("\n=======================================================\n"); 
                tkr.turunkanPenumpang(nama);
                tkr.toString();
                tkr.getJumlahPenumpangBiasa();
                tkr.getJumlahPenumpangPrioritas();
                tkr.getJumlahSemuaPenumpang();
                System.out.println("\n======================================================="); 
                main = true;
            }else if (menu == 3){ 
                System.out.println("\n======================================================="); 
                tkr.toString();
                tkr.getJumlahPenumpangBiasa();
                tkr.getJumlahPenumpangPrioritas();
                tkr.getJumlahSemuaPenumpang(); 
                System.out.println("\n======================================================="); 
                main = true;
            }else if (menu == 4){ 
                System.exit(0);
            }else{
                System.out.println("Mohon Maaf, Pilihan Anda salah!!!");
            }
        }  
    }
}
