package ch04;

public class a {
    public static void main (String[] args) {
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Panjang array = "+ nilai.length);
	System.out.println("Menampilkan semua nilai array = ");
        
	for (int n = 0; n < nilai.length; n++) {
    	System.out.print (nilai[n] + " ");
        }
    }
}
