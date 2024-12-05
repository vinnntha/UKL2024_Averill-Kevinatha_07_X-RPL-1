import java.util.Random;
import java.util.Scanner;

public class sedang {
    public static void main(String[] args) {
        int angka1[] = {2, 4, 6, 7, 9};
        int angka2[] = {1, 3, 5, 8, 10};
        String[] operators = {"/", "*", "%"};
        boolean quiz = true;
        Scanner input = new Scanner(System.in);
        Random acak = new Random();

        System.out.println("Selamat datang di kuis mtk moklet!!");
        System.out.println("-----------------------------------");

        while (quiz) {
            int bilangan1 = acak.nextInt(angka1.length);
            int bilangan2 = acak.nextInt(angka2.length);
            int bilanganPertama = angka1[bilangan1];
            int bilanganKedua = angka2[bilangan2];
            String operator = operators[acak.nextInt(operators.length)];
            int jawabanBenar = 0;

            switch (operator) {
                case "*":
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case "/":
                    while (bilanganKedua == 0) {
                        bilangan2 = acak.nextInt(angka2.length);
                        bilanganKedua = angka2[bilangan2];
                    }
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case "%":
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
            }

            System.out.printf("%d %s %d = ", bilanganPertama, operator, bilanganKedua);
            int jawabanUser = input.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.println("Ingin melanjutkan kuis? (yes/no)");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                quiz = false;
            }
        }

        System.out.println("Kuis selesai. Terima kasih telah bermain!");
        input.close();
    }
}
