public class kamiReview {
    public static void main(String[] args) {
        System.out.println("AUTHOR : Radithya Mahesa Syabil");
        System.out.println("KELAS : XI RPl2");

        int[] nilaiKami = {
                25, 47, 70, 89, 10, 93, 85, 100
        };

        System.out.println("");
        System.out.println("-----> Lat. 1 <----");

        System.out.println("di bawah ini for each");
        // for (tipeData variable : namaVariableArray)
        for (Integer nilai : nilaiKami) {
            System.out.println(nilai);
        }

        System.out.println("");

        System.out.println("di bawah ini for biasa");
        for (int dit = 0; dit < nilaiKami.length; dit++) {
            System.out.println(nilaiKami[dit]);
        }
        System.out.println("");
        System.out.println("Panjang Array Kami = " + nilaiKami.length);

        System.out.println("");
        System.out.println("ini Kelipatan ganjil");
        for (Integer nilai : nilaiKami) {
            if (nilai % 2 != 0) {
                System.out.println(nilai);
            }
        }

        System.out.println("");
        System.out.println("ini Kelipatan genap");
        for (Integer nilai : nilaiKami) {
            if (nilai % 2 == 0) {
                System.out.println(nilai);
            }
        }

        int jumlah = 0;
        for (int nilai : nilaiKami) {
            jumlah += nilai;
        }

        double rataRata = (double) jumlah / nilaiKami.length;

        System.out.println("");
        System.out.println("Nilai rata-rata kami = " + rataRata);

        System.out.println("-----> Lat. 2 <-----");
        
        System.out.println("baris ke-1");
        for (var i = 2; i <= 20; i += 2) {
            System.out.println(i + "");
        }

        System.out.println("");
        System.out.println("baris ke-2");
        for (var i = 11; i <= 25; i += 2) {
            System.out.println(i + "");
        }

        System.out.println("-----> Lat. 3 <-----");

        int counter = 1;
        while (counter <= 5) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter == 5) {
                System.out.println("Force Close");
                break;
            }
        }

        System.out.println("");
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {

                System.out.println("yang ganjil-ganjil aja = " + i);
            }
        }

        System.out.println("");
        System.out.println("-----> Lat. 4 <-----");

        int[] nilai = {25};
        dataKami("Dimas Pertamax Turbo", "XI RPL 2", nilai);
    }

    static void dataKami(String nama, String kelas, int[] nilai){
        var total = 0;
        for (var value : nilai){
            total += value;
        }

        var nilai1 = total / nilai.length;

        if (nilai1 >= 75) {
            System.out.println("NAMA = " + nama );
            System.out.println("KELAS = " + kelas);
            System.out.println("NILAI = " + nilai1);
            System.out.println("KETERANGAN = LULUS");
        } else {
            System.out.println("NAMA = " + nama );
            System.out.println("KELAS = " + kelas);
            System.out.println("NILAI = " + nilai1);
            System.out.println("KETERANGAN = TIDAK LULUS");
        }
    }
}
