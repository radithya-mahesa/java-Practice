class LatihanLagi {
    public static void main(String[] args) {
        String author = "Radithya";
        System.out.println("Author: " + author);
     
        int a = 5;
        int b = 6;
        int totalTambah = tambah(a, b);

        int c = 10;
        int d = 3;
        int totalKurang = kurang(c, d);

        int e = 8;
        int f = 4;
        kali(e, f);

        int g = 15;
        int h = 7;
        bagi(g, h);

        int i = 20;
        int j = 9;
        sisaBagi(i, j);

        cek(5, 4);
        cek(3, 4);
    }
  
    public static int tambah(int a, int b) {
    System.out.println("");
        int total = a + b;
        System.out.println("Tambah" + "(" + a + ", " + b + ")");
        System.out.println(a + " + " + b + " = " + total);
        return total;
    }

    public static int kurang(int c, int d) {
     System.out.println("");
        int totalKurang = c - d;
        System.out.println("Kurang" + "(" + c + ", " + d + ")");
        System.out.println(c + " - " + d + " = " + totalKurang);
        return totalKurang;
    }

    public static void kali(int e, int f) {
        System.out.println("");
        int totalKali = e * f;
        System.out.println("Kali" + "(" + e + ", " + f + ")");
        System.out.println(e + " x " + f + " = " + totalKali);
    }

    public static void bagi(int g, int h) {
        System.out.println("");
        if (h != 0) {
            int totalBagi = g / h;
            System.out.println("Bagi" + "(" + g + ", " + h + ")");
            System.out.println(g + " / " + h + " = " + totalBagi);
        } else {
            System.out.println("Tidak bisa melakukan pembagian oleh nol.");
        }
    }

    public static void sisaBagi(int i, int j) {
        System.out.println("");
        if (j != 0) {
            int totalSisaBagi = i % j;
            System.out.println("Sisa Bagi" + "(" + i + ", " + j + ")");
            System.out.println(i + " % " + j + " = " + totalSisaBagi);
        } else {
            System.out.println("Tidak bisa melakukan sisa bagi oleh nol.");
        }
    }

    public static void cek(int angka1, int angka2) {
        System.out.println("");
        System.out.println("Cek(" + angka1 + ", " + angka2 + ")");
        if (angka1 > angka2) {
            System.out.println(angka1 + " lebih besar dari " + angka2);
            System.out.println("");
        } else if (angka1 < angka2) {
            System.out.println(angka1 + " lebih kecil dari " + angka2);
            System.out.println("");
        } else {
            System.out.println(angka1 + " sama dengan " + angka2);
        }
    }
}
