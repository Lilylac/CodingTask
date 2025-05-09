package pbopt9;



public class kegiatan {
   
    String namaKegiatan;
    String tanggalKegiatan;
    public kegiatan(String namaKegiatan, String tanggalKegiatan) {
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
    }
    public void tampilkanKegiatan(){
        System.out.println("===================================================");
        System.out.println("Tanggal Kegiatan: " + tanggalKegiatan);
        System.out.println("Nama Kegiatan : " + namaKegiatan);
    }
    
}
