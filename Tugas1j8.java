import java.util.Scanner;

public class Tugas1j8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah n : ");
        int n =  sc.nextInt();

        for(int i = 1;i <= n; i++){
            int total = 0;
            System.out.print("Jika n == "+ i+" >>>>> ");

            for(int j = 1; j<= i;j++){
                int kuadrat =  j*j;
                total += kuadrat;
                System.out.print(kuadrat);

                if(j<i){
                    System.out.print(" + ");
                } else{
                    System.out.print(" = ");
                    System.out.print(total);
                }
            }
            System.out.println();
        }
    }
}