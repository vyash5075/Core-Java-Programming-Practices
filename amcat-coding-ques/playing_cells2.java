/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcells;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class java {
        static int[] colony(int cells[], int days) {
        for (int j = 0; j < days; j++) 
        {
            int copy_cells[] = new int[10];
            for (int i = 1; i < 9; i++)
            {
                copy_cells[i] = cells[i - 1];
            }
            copy_cells[0] = 0;
            copy_cells[9] = 0;
            for (int i = 0; i < 8; i++)
            {
                cells[i] = copy_cells[i] == copy_cells[i + 2] ? 0 : 1;
            }
        }
        return cells;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("days");
        int d = sc.nextInt();
        a = colony(a, d);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
