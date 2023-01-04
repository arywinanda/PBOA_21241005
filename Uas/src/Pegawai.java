public class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajiBersih;

public Pegawai(String nama,String jabatan,double Pajak){
    this.nama=nama;
    this.jabatan=jabatan;
    this.pajak=pajak;
}

public void setgajiPokok(double gajiPokok){
    this.gajiPokok=gajiPokok;
}

public double getgajiBersih(){
    return gajiBersih = gajiPokok - (gajiPokok * pajak);
}

void display(){
    System.out.println("Nama pegawai:"+nama);
    System.out.println("jabatan:"+jabatan);
    System.out.println("gajiBersih:"+getgajiBersih());
}

 public static void main(String[] args) throws Exception {
    Pegawai pgw = new Pegawai("Adam","Direktur",0.03);
    pgw.setgajiPokok(1500000);
    pgw.display();
    
    

    

       
    }
}