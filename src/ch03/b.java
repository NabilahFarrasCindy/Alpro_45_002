package ch03;

public class b {
    public static void main(String[] args) {
     int x = 15;
     int y = 5;
     int z = 9;

     System.out.println("nilai x = " + x);
     System.out.println("nilai y = " + y);
     System.out.println("nilai y = " + z);

     if (x > y && x > z)  {
         System.out.println("nilai tertinggi = " + x);

      } else if (y > x && y > z) {
         System.out.println("nilai tertinggi = " + y);

      }else{
          System.out.println("nilai tertinggi = " + z);

      }
    }
}
