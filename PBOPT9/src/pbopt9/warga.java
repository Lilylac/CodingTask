package pbopt9;

public class warga {
    
    String nik;
    String nama;
    String alamat;

    public warga(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void tampilkanWarga(){
        System.out.println("===================================================");
        System.out.println("NIK : " + nik);
        System.out.println("Nama: "+ nama);
        System.out.println("Alamat : "+ alamat);
    }
    
}
