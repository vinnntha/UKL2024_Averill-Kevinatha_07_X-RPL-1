import java.util.Scanner;

public class sulit {

    public static void main(String[] args) {
        Scanner ukl = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = ukl.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = ukl.nextInt();
        }
 
        hitungFrekuensi(array);    
    }
    public static void hitungFrekuensi(int[] array) {
        boolean[] sudahDihitung = new boolean[array.length];
        int elemenTerbanyak = array[0];
        int jumlahMunculTerbanyak = 1;

        for (int i = 0; i < array.length; i++) {
            if (!sudahDihitung[i]) { 
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        sudahDihitung[j] = true;
                    }
                }

                System.out.println(array[i] + " muncul " + count + " kali");

                if (count > jumlahMunculTerbanyak) {
                    elemenTerbanyak = array[i];
                    jumlahMunculTerbanyak = count;
                }
            }
        }

        System.out.println("Elemen yang paling sering muncul adalah " + elemenTerbanyak + 
                           " sebanyak " + jumlahMunculTerbanyak + " kali");

                           
    }
}
