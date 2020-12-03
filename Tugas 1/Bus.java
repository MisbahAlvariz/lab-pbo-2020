/*
    Nama : M. MISBAH ALVARIZ
    NIM  : 1908107010006
*/

import java.util.ArrayList;
import java.util.*;

public class Bus{
    ArrayList<Penumpang> penumpangBiasa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;
    
    Scanner input = new Scanner(System.in);
   
    public Bus(){

       penumpangBiasa =  new ArrayList<Penumpang>();
       penumpangPrioritas =  new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      

    public ArrayList<Penumpang> getPenumpangBiasa(){ 
        
        for(Penumpang penumpang:penumpangBiasa)
        {
            penumpang.getNama();
           }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {    
        
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        int jumlahBiasa = penumpangBiasa.size();
        System.out.println("\nJumlah Penumpang di Kursi Biasa : " +jumlahBiasa);
        return jumlahBiasa;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah Penumpang di Kursi Prioritas : " +jumlahPrioritas);
        return jumlahPrioritas;
    }
    
    public int getJumlahSemuaPenumpang(){
        int semua = penumpangBiasa.size() + penumpangPrioritas.size();
        System.out.println("Jumlah Semua Penumpang = " +semua);
        return semua;
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int biasa=4; 
        int prioritas=2;

        if((penumpangPrioritas.size() < prioritas ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Prioritas Bernama ["+penumpang.getNama()+"] <BERHASIL> ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        }else if((penumpangBiasa.size() < biasa ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Prioritas Bernama ["+penumpang.getNama()+"] <BERHASIL> ditambahkan!");
            return penumpangBiasa.add(penumpang);
        }
        else if(penumpangBiasa.size() < biasa ){
            System.out.println("Penumpang Biasa Bernama ["+penumpang.getNama()+"] <BERHASIL> ditambahkan!");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.println("< Mohon Maaf, Tidak Ada Kursi yang Kosong!!! >");
            System.out.println("Penumpang Bernama [" +penumpang.getNama()+ "] <GAGAL> ditambahkan!\n");
            return false;
        } 
    }
    
    public boolean turunkanPenumpang(String nama){
       
        for (int i = 0; i < penumpangBiasa.size(); i ++) {  
           if(nama.equals(penumpangBiasa.get(i).getNama())){
              penumpangBiasa.remove(i);
              System.out.println("Penumpang Bernama ["+nama+"] telah diturunkan!!");
             return penumpangBiasa.equals(nama);
           }else{
              System.out.println("Mohon Maaf, Penumpang yang dimaksud TIDAK ADA!!"); 
               return false;
           }
        }
           
        for (int i = 0; i < penumpangPrioritas.size(); i ++) { 
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("Penumpang Bernama ["+nama+"] telah diturunkan!!");
             return penumpangPrioritas.equals(nama);
            }else{
              System.out.println("Mohon Maaf, Penumpang yang dimaksud TIDAK ADA!!"); 
               return false;
            }
        }return true;
    }

    public String toString(){
           String result1 = " ";
           String result2 = " ";
           
           for(Penumpang penumpang : penumpangBiasa) {
               result1 += ("["+penumpang.getNama().toString()+ "] ");
            }
           
           for(Penumpang penumpang : penumpangPrioritas) {
               result2 += ("["+penumpang.getNama().toString()+ "] ");
            }
            
          if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("\nDaftar Nama Penumpang Biasa = <kosong>") ;
          }else{
              System.out.println("\nDaftar Nama Penumpang Biasa = " +result1 );
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("Daftar Nama Penumpang Prioritas = <kosong>") ;
          }else{
              System.out.println("Daftar Nama Penumpang Prioritas = " +result2);
          }
        return " Nama penumpang biasa = "+result1+"Nama penumpang prioritas = "+result2+"\n";
    }
}