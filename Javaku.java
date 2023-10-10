/**
 * java dasar
 * @author Radithya Mahesa syabil XI RPL 2
 */

public class Javaku {
    public static void main(String[] args) {
        
        /*
         Buat enam variable yang mengimplementasikan 
         ke enam tipe data dengan nilai 127 untuk Byte dan 
         untuk setiap perpindahan tipe data, nilainya bertambah 1, 
         kecuali float dan double. Untuk float dan double 
         tambahkan koma (.) setelah angka pertama
        */
        byte nilai1 = 127;
        short nilai2 = 128;
        long nilai3 = 129;          
        int nilai4 = 1_30;
        float nilai5 = 1_31.0f;
        double nilai6 = 1_32.00_00;
        // Implementasikan kode underscore pada ke enam nilai yang sudah dibuat pada poin ke tiga

        // Buat dua variable yang mengimplementasikan kode literals
        int hex= 0xFFFF;
        int bin= 0b010101;
        
        
        // Konversikan ke enam tipe data yang sudah memiliki nilai
        float nilai5a = (float) nilai4; // int to float
        int nilai3a = (int) nilai5;  // float to int
        long nilai4a = (long) nilai1; // byte to long
        double nilai6a = (double) nilai5; // float to double
        int nilai4b = (int) nilai2; // short to int

        System.out.println("=====>Buaat enam variable dan tipe data <=====");

        System.out.println("Byte : " + nilai1);
        System.out.println("Short : " + nilai2);
        System.out.println("Long : " + nilai3);
        System.out.println("Int : " + nilai4);
        System.out.println("Float : " + nilai5);
        System.out.println("Double : " + nilai6);

        System.out.println("==========>Konversi<=========="); 

        System.out.println("Convert Int ke Float : " + nilai5a);
        System.out.println("Convert Float ke Int : " +  nilai3a);
        System.out.println("Convert Byte ke Long : " + nilai4a);
        System.out.println("Convert Float ke Double : " + nilai6a);
        System.out.println("Convert Short ke Int : " + nilai4b);
        
        System.out.println("=====>Tampilkan literals<=====");
        System.out.println("hex : " + hex);
        System.out.println("biner : " + bin);
    }
            
}