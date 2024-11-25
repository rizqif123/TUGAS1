
package Matematika;

import java.util.Scanner;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        MatematikaCanggih mc = new MatematikaCanggih();
        
        System.out.println("=== PROGRAM OPERASI MATEMATIKA ===");
        
        System.out.println("Masukkan angka pertama = ");
        int angka1 = scanner.nextInt();
        
        System.out.println("Masukkan angka kedua = ");
        int angka2 = scanner.nextInt();
        
        System.out.println("\nPilih operasi = ");
        System.out.println("1. Pertambahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Modulus");
        
        System.out.println("Masukkan pilihan (1/2/3)" );
        
        int pilihan = scanner.nextInt();
        
        int hasil = 0;
        
        switch (pilihan){
            case 1:
                hasil = mc.pertambahan(angka1, angka2);
                System.out.println("Hasil pertambahan = " + hasil);
                break;
            case 2:
                hasil = mc.perkalian(angka1, angka2);
                System.out.println("Hasil perkalian " + hasil);
                break;
            case 3:
                if (angka2 !=0){
                    hasil = mc.modulus(angka1, angka2);
                    System.out.println("Hasil modulus = " + hasil);
                }else{
                    System.out.println("Error: Modulus dengan angka kedua nol tidak diperbolehkan. ");
                    break;
                }
                System.out.println("\n=== PROGRAM SELESAI === ");
                scanner.close();
        }
        
        
        
        
    }
    
}
