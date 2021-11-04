import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 3G
 * NIM      : 1941720057
 */
public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah1=0, jumlah2=0, jumlah3, n, teori = 0, praktikum =0, gabungan; 
        int uas[][];
        double rataT,rataP,rataG;
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Nama \t: M. Syifa'ul Ikrom Almasyriqi");
        System.out.println("Kelas \t: TI 3G");
        System.out.println("NIM \t: 1941720057");
        System.out.println("-------------------------------------------------------");
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        n = sc.nextInt();
        uas = new int[n][2];
        
        System.out.println("---Masukkan nilai UAS Teori dan Praktikum---");
        System.out.println();
        
        for (int i=0; i<n; i++) {
            System.out.println("**Mahasiswa ke-" + (i+1) + " **");
            for (int j=0; j<uas[0].length; j++) {
                if (j%2 == 0) {
                    System.out.print("Nilai UAS Teori = ");
                    uas[i][j] = sc.nextInt();
                    teori++;
                    if (uas[i][j] >= 70) {
                        System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                    }
                    else {
                        System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus!");
                    }
                }
                else {
                    System.out.print("Nilai UAS Praktikum = ");
                    uas[i][j] = sc.nextInt();
                    praktikum++;
                    if (uas[i][j] >= 70) {
                        System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                    }
                    else {
                        System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus!");
                    }
                }
            }
            System.out.println();
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<uas[0].length; j++) {
                if (j%2 == 0) {
                    jumlah1 += uas[i][j];
                }
                else {
                    jumlah2 += uas[i][j];
                }
            }
        }
        jumlah3 = jumlah1 + jumlah2;
        rataT = (double) jumlah1 / teori;
        rataP = (double) jumlah2 / praktikum;
        gabungan = teori + praktikum;
        rataG = (double) jumlah3 / gabungan;
        
        System.out.println("Rata-rata Total Nilai UAS Teori = " + rataT);
        System.out.println("Rata-rata Total Nilai UAS Praktikum = " + rataP);
        System.out.println("Nilai Rata-rata UAS Teori dan Praktikum = " + rataG);
    }
}
