public class LatihanIfStatement {
    public static void main(String[] args) {
        int nilaiRadit = 999;
        int nilaiKehadiran = 75;

        if (nilaiRadit >= 75 && nilaiRadit <= 100) {
            System.out.println("RADIT LULUS");
        } else if (nilaiRadit >= 71 && nilaiRadit <= 74 && nilaiKehadiran >= 90 && nilaiKehadiran <= 100) {
            System.out.println("RADIT REMEDIAL DENGAN CATATAN");
        } else if (nilaiRadit >= 71 && nilaiRadit <= 74 && nilaiKehadiran >= 75 && nilaiKehadiran <= 89) {
            System.out.println("RADIT REMEDIAL DAN MENGHADAP GURU");
        } else if (nilaiRadit >= 71 && nilaiRadit <= 74 && nilaiKehadiran < 75 ) {
            System.out.println("RADIT REMEDIAL, SERING ABSEN DAN WAJIB MENGHADAP GURU");
        } else if (nilaiRadit > 100) {
            System.out.println("NILAI TIDAK VALID, KETAHUAN BANGET CURANG NYA TUH");
        } else {
            System.out.println("RADIT TIDAK LULUS");
        }

    }

}
