package tugas4;

public abstract class Pekerjaan implements Interfaces{
    String nama;
    int gaji;
    int id;
    Pekerjaan(String nama, int gaji, int id){
        this.nama = nama;
        this.id = id;  
        this.gaji = gaji;
        
    }
    @Override
    public String getNama(){
      return nama;  
    };
   
     @Override
    public int getId(){
      return id;  
    };
     @Override
    public int getGaji(){
      return gaji;  
    }; 
     @Override
    public void setNama(String nama){
      this.nama = nama;  
    };

    @Override
     public void setId(int id){
      this.id = id;  
    };
         @Override
    public void setGaji(int gaji){
      this.gaji = gaji;  
    };
    @Override
     public void tampil(){
        System.out.printf("# nama pekerjaan : %s \n # Gaji : %d \n #id : %d \n", nama, gaji, id);
    }
   
}
