public class EvalRadithyaXiRPL2 {
    public static void main(String[] args) {
        System.out.println("AUTHOR : RADITHYA MAHESA SYABIL");

        // 1. (10 poin)

        // a. for
        System.out.println("ini for :");
            for (var dit = 1; dit <= 10; dit++){
                System.out.print(dit + " ");}
        System.out.println();

        // b.
        int aku = 1;
        System.out.println("ini while");
        while (aku <= 10) {
            System.out.print(aku + " ");
            aku++; }
System.out.println();

        // c.
        int gue = 1;
        System.out.println("ini do while");
        do {
            System.out.print(gue + " ");
            gue++;
        } while (gue >= 1&& gue <= 10);
        System.out.println();

        //2.
        System.out.println();
        int nilai1 = 80;
        if (nilai1 >= 75 && nilai1 < 101) {
            System.out.println("LULUS");
        } else if (nilai1 >= 70 && nilai1 <74) {
            System.out.println("REMED");
        } else {
            System.out.println("GAK BOLEH LULUS");

            System.out.println();
        }

        //3.
        System.out.println("");
        System.out.println("Contoh output");
        int[] nilai2 = {
                80, 90, 70, 75, 77};
        for (var counter = 0; counter < nilai2.length; counter++) {
            System.out.print(nilai2[counter] + " ");
        }

        //4
        System.out.println();
        System.out.println("");
        int a = 5;
        int hh = a + a;
        int hhh = a - a;
        int hhhh = a * a;
        System.out.println("5+5=" + hh);
        System.out.println("5-5=" + hhh);
        System.out.println("5*5=" + hhhh);


        
    }

}


