public class latih1 {
    public static void main (String[] args) {
        System.out.println("\nTest 123");
        System.out.println("Belajar JAVA");
        System.out.println("================================\n");

        int a = 10;
        int b = 30;
        int c = a + b;

        System.out.println("Hasil dari 10 + 30 : " + c);

        float f = (float) a / b;

        System.out.println("Hasil dari 10 / 30 : " + f);

        boolean oke = true;
        int i = 0;
        while (oke == true) {
            i++;
            System.out.println(i + ". UDINUS");
            if (i == 10) {
                oke = false;
            }
        }

        String nim = "A11.2022.14422";
        String nama = "Salim Abdurrahman";

        System.out.println("NIM / Nama : " + nim + " / " + nama);

        char ya = 'y';
        if (ya == 'y') {
            System.out.println("SUKSES");
        }

        for (int j = 0;j<10;j++) {
            System.out.println("Loop for sukses");
        }

        int s = 0;
        do {
            s++;
            System.out.println("Loop do while sukses");
        }
        while (s < 10);
    }
}
