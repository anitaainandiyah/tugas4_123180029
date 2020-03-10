package tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Daftar pekerjaan");
        int x[] = new int[2];
        Scanner in = new Scanner ( System.in);
        Pekerjaan p[] = new Pekerjaan[2];
        p[0] = new Dokter ("Dokter", 11111, (int) 4000.000, "organ dalam" , "Jantung");
        p[0] = new Dosen ("Dosen", 22222, (int) 3000.000, "UPN" , "FTI", "IF");
        System.out.println("\nubahh id\n");
        for (int i = 0; i <2; i++) {
            System.out.println("# id ke-"+i+" :");
            x[i] = in.nextInt();
            p[i].setId(x[i]);
        }
        System.out.println("** id baruu : ");
        for (int i = 0; i < 2; i++) {
            System.out.println("id= " +p[i].getId());
        }
    }
}
