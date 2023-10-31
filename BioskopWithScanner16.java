package Jobsheet10;

import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama, next;

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = input16.nextLine();
            System.out.print("Masukkan baris : ");
            baris = input16.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input16.nextInt();
            input16.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = input16.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            } 
        }
    }
}