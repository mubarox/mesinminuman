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
double total, bayar;    
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
double hitungKembalian (double pay){
    double bayar = pay;
    double kembalian = bayar - total;
    
            
    return kembalian;
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
int pilihan;
pilihan=belanja.nextInt();

    switch (pilihan) {
        case 1:
            juice();
            break;
        case 2:
            coffee();
            break;
        case 3:
            soda();
            break;
        case 4:
            mineral();
            break;
        default:
            break;
    }



}
static void juice () {
    System.out.println ("masukkan jumlah");
    Scanner belanja = new Scanner (System.in);
    int jmlh=belanja.nextInt();
    int total= jmlh* 10000 ;
    System.out.println("jumlah bayar "+total);
}
static void coffee(){
    System.out.println ("masukkan jumlah");
    Scanner belanja = new Scanner (System.in);
    int jmlh=belanja.nextInt();
    int total= jmlh* 7000;
    System.out.println("jumlah bayar "+total);
}
static void soda (){
   System.out.println ("masukkan jumlah");
   Scanner belanja = new Scanner (System.in);
   int jmlh=belanja.nextInt();
   int total= jmlh* 13000;
   System.out.println("jumlah bayar "+total);
}
static void mineral (){
   System.out.println ("masukkan jumlah");
   Scanner belanja = new Scanner (System.in);
   int jmlh4=belanja.nextInt();
   int total4= jmlh4* 5000;
   System.out.println("jumlah bayar "+total4);
}
    
}
    

