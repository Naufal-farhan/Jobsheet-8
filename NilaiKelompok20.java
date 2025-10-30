import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;
        i = 1;
        float nTertinggi = 0;
        float nTerendah = 100;
        int kelompokTertinggi = 0;
        int kelompokTerendah = 0;

        while (i <= 5) {
            System.out.println("Kelompok "+i+"=====================================================================");
            totalNilai = 0;
            
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai-" + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("======= Rata-Rata nilai kelompok-"+i+" : "+rataNilai+"");
            if(rataNilai>nTertinggi){
                nTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            if(rataNilai<nTerendah){
                nTerendah = rataNilai;
                kelompokTerendah = i;
            }
            i++;
            
        }
        System.out.println();
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok-"+kelompokTertinggi);
        System.out.println("Rata-rata nilai kelompok tertinggi adalah : "+nTertinggi);
        System.out.println();
        System.out.println("Kelompok dengan rata-rata Terendah adalah : "+kelompokTerendah);
        System.out.println("Rata-rata nilai kelompok Terendah adalah : "+nTerendah);
    }
}
