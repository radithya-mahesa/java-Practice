public class JavaWak {
    public static void main(String[] args) {
        
        int[] no = {
            2, 4, 6, 8, 10, 13, 15, 17, 19
        };

        System.out.println("=> Menampilkan semua nilai array <==");
        System.out.println("Array baru: "
        + no[0] + ", "
        + no[1] + ", "
        + no[2] + ", "
        + no[3] + ", "
        + no[4] + ", "
        + no[5] + ", "
        + no[6] + ", "
        + no[7] + ", "
        + no[8] + ", ");
        
        System.out.println("==> menampilkan array index ke 6 <==");
        System.out.println("Array index ke 6 : " + no[6]);

        no[3] = 22;
        no[5] = 9;
        
        System.out.println("==> Menampilkan array baru <==");
        System.out.println("Array baru: "
        + no[0] + ", "
        + no[1] + ", "
        + no[2] + ", "
        + no[3] + ", "
        + no[4] + ", "
        + no[5] + ", "
        + no[6] + ", "
        + no[7] + ", "
        + no[8] + ", ");

        System.out.println("==> Menampilkan indek array ke 7 <==");
        System.out.println("index ke 7 : " + no[7]);

        System.out.println("==> Operasi Aritmatika <==");

        int hasil;
        hasil = no[3] + no[4];
        System.out.println(no[3] + " + " + no[4] + " = " + hasil);

        hasil = no[6] - no[7];
        System.out.println(no[6] + " - " + no[7] + " = " + hasil);

        hasil = no[5] * no[8];
        System.out.println(no[3] + " * " + no[4] + " = " + hasil);

        hasil = no[8] / no[0];
        System.out.println(no[8] + " / " + no[0] + " = " + hasil);

        hasil = no[2] % no[1];
        System.out.println(no[2] + " % " + no[1] + " = " + hasil);
    }
}
