package pbopt9;

public class iuran {

    String namaIuran;
    int biayaIuran;

    public iuran(String namaIuran, int biayaIuran) {
        this.namaIuran = namaIuran;
        this.biayaIuran = biayaIuran;
    }
    public void tampilkanIuran(){
        System.out.println("===================================================");
        System.out.println("Nama Iuran: " + namaIuran);
        System.out.println("Biaya Iuran: " + biayaIuran);

    }

}
