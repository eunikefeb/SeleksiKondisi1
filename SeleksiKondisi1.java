/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi.kondisi.pkg1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SeleksiKondisi1 {
static int hitung(int nilai) {
        int bayar=20000;
        nilai=nilai-10;

        //pengitungan 10 kedua
        if (nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+3000*nilai;
            nilai=0;
        }

        //pengitungan 10 ketiga
        if (nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+4000*nilai;
            nilai=0;
        }

        //pengitungan selanjutnya
        if (nilai>10){
            bayar=bayar+3000*nilai;
        }
 
 return bayar;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String data[][]={
            {"a","Ali"},
            {"b","Budi"},
            {"c","Dani"},
            {"d","Edi"},
            {"e","Umar"}
        };
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan ID Pelanggan : ");
        String idpel = scan.nextLine();
        
        System.out.println("Masukkan Jumlah Tagihan : ");
        int jumtag = scan.nextInt();
        
        if (jumtag<10) {
            jumtag = 20000;
        }else{
            jumtag=hitung(jumtag);
        }
        jumtag=jumtag+10000;
        
        for (int i = 0; i < data.length; i++) {
            if (idpel.equals(data[i][0])) {
                System.out.println("Print out tagihan");
                System.out.println("ID Pelanggan : "+(String)data[i][0]);
                System.out.println("Nama Pelanggan : "+(String)data[i][1]);
                System.out.println("Tagihan : Rp. "+ jumtag+",-");
            }
        }
    }
}