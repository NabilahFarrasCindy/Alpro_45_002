package ch09;

import java.util.Arrays;
public class sieveofsundaram {
    static int sieveofsundaram(int z) {
       
        int New = (z - 2) / 2;
        boolean marked[] = new boolean[New + 1];
        Arrays.fill(marked, false);
        for (int x = 1; x <= New; x++)
            for (int y = x; (x + y + 2 * x * y) <= New; y++)
                marked[x + y + 2 * x * y] = true;
    
        if (z > 2)
            System.out.print(2 + " ");
        for (int x = 1; x <= New; x++)
            if (marked[x] == false)
                System.out.print(2 * x + 1 + " ");
        return -1;
    }
 
    public static void main(String[] args) {
        int z = 50;
        sieveofsundaram(z);
    }
}