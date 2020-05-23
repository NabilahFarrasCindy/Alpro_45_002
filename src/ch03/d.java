package ch03;

import java.util.Scanner;

public class d {
     
 public static void main (String args []){
  
  Scanner input = new Scanner(System.in);
  System.out.println("Silakan masukkan angka yang akan di cek: ");
  
  int angka = input.nextInt();
  
  int bil;
  boolean prima = true;
  for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
   
   bil = angka % pembagi;
   
   if(bil == 0){
    
    prima = false;
    break;
    
   }
  
  }
  if(prima && ((angka > 0)&&(angka != 1)))
   System.out.println(angka + " adalah bilangan prima");
  else
   System.out.println(angka + " bukanlah bilangan prima");
  
  }
}
