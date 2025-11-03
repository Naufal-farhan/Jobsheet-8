import java.util.Scanner;

public class Tugas2j8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print(n + " ");
                }
            } else {
                System.out.print(n + " ");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print(n +" ");
            }
            System.out.println();
        }

    }
}