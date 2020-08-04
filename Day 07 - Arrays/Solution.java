import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        /* Print elements in reverse order */
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
