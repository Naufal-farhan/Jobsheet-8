import java.util.Scanner;
public class Tugas3j8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang : ");
        int cabang = sc.nextInt();
        System.out.println();
        int totalItem = 0;
        int totalPelanggan = 0;
        for(int i=1; i <= cabang;i++){
            int jmlItem = 0;
            int pelanggan = 0;
            System.out.println("---Cabang-"+i+"---");
            System.out.print("Jumlah pelanggan : ");
            pelanggan = sc.nextInt();
            
            for(int j=1;j<=pelanggan;j++){
                System.out.print("- Pelanggan-"+j+" Memesan berapa item : ");
                int item = sc.nextInt();
                jmlItem +=item;
            }
            System.out.println("Cabang"+i+" : ");
            System.out.println(" Total pelanggan    : "+ pelanggan);
            System.out.println(" Total item terjual : "+ jmlItem );
            totalItem += jmlItem;
            totalPelanggan += pelanggan;
            System.out.println();
        }
        System.out.println("Total Seluruh Cabang");
        System.out.println("Pelanggan : "+totalPelanggan);
        System.out.println("Total Item : "+ totalItem);
    }
}
