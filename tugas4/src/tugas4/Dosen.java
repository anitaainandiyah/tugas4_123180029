package tugas4;

public class Dosen extends Pekerjaan {
    String universitas;
    String fakultas;
    String jurusan;
    Dosen(String Dosen, int id, int gaji, String universitas, String fakultas, String jurusan){
        super(Dosen,gaji,id);
     this.universitas = universitas;
     this.fakultas = fakultas;
     this.jurusan = jurusan;
     tampil();
     System.out.printf("#Universitas : %s \n #Fakultas : %s \n jurusan : %s \n", universitas, fakultas, jurusan);
    }
}
