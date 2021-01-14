/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuman;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Minuman {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
	int scan ;
        int i = 0; //indikator
        String jawaban = ("Ya");
	Scanner baca = new Scanner (System.in);
System.out.println ("selamat datang di vending machine");
System.out.println ("harap bayar dengan uang pas");
System.out.println ("1. Dafatar Harga");
System.out.println ("2. Info Diskon");
System.out.println ("3. Beli");
System.out.println ("Keluar");
System.out.println ("masukkan pilihan anda");
scan=baca.nextInt();
switch (scan ){
	case 1:
	Showmenu();
	break ;

	case 2:
	Showdiskon();
	break;

	case 3:
	Beli();
	break;

	case 4:
	System.exit(0);
	break;
}
}
static void Showmenu (){

 System.out.println("1. juice  harga 10000 ");
 System.out.println("2. coffee  harga 7000  ");
 System.out.println("3. Minuman soda harga 13000 ");
 System.out.println("4. air putih harga 5000  ");
}

static void Showdiskon (){
	System.out.println("diskon pada kali ini adalah :");
	System.out.println("1. jika membeli 3 jus maka mendapat potongan 3% pada pembelian kopi");
	System.out.println("2. jika membeli 3 kopi dan 3 soda maka akan mendapat potongan 9% pada pembelian air putih");
	System.out.println("3. jika membeli 1 air putih maka menapat potongan 1% untuk jus dan 0,3% pada kopi dan minuman soda");
}

static void Beli (){
Scanner belanja = new Scanner(System.in);
String [] menu = {"juice","coffee","minuman soda","air putih"};
Integer [] harga = {10000,7000,13000,5000};
 System.out.println("1. "+menu [0]+"  harga  "+harga [0]);
 System.out.println("2. "+menu [1]+"  harga  "+harga [1]);
 System.out.println("3. "+menu [2]+"  harga  "+harga [2]);
 System.out.println("4. "+menu [3]+"  harga  "+harga [3]);
System.out.println("masukkan barang yang ingin dibeli ");
int pilihan, jmlh1,jmlh2,jmlh3,jmlh4;
int total1, total2, total3, total4;
pilihan=belanja.nextInt();

    switch (pilihan) {
        case 1:
            System.out.println ("masukkan jumlah");
            jmlh1=belanja.nextInt();
            total1= jmlh1* harga[0];
            System.out.println("jumlah bayar "+total1);
            break;
        case 2:
            System.out.println ("masukkan jumlah");
            jmlh2=belanja.nextInt();
            total2= jmlh2* harga[1];
            System.out.println("jumlah bayar "+total2);
            break;
        case 3:
            System.out.println ("masukkan jumlah");
            jmlh3=belanja.nextInt();
            total3= jmlh3* harga[2];
            System.out.println("jumlah bayar "+total3);
            break;
        case 4:
            System.out.println ("masukkan jumlah");
            jmlh4=belanja.nextInt();
            total4= jmlh4* harga[3];
            System.out.println("jumlah bayar "+total4);
            break;
        default:
            break;
    }



}
}    

