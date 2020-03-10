package tugas4;

public class Dokter extends Pekerjaan {
    String poli;
    String spesialis;
   
    Dokter(String Dokter, int id, int gaji, String poli, String spesialis){
        super(Dokter,gaji,id);
     this.poli = poli;
     this.spesialis = spesialis;
     tampil();
     System.out.printf("#poli : %s \n #spesialis : %s \n ", poli, spesialis);
    }
}
