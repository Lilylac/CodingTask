package pbopt9;

public class kepalaKeluarga extends warga {

    boolean statusKepalaKelurga;

    public kepalaKeluarga(String nik, String nama, String alamat, boolean statusKepalaKelurga) {
        super(nik, nama, alamat);
    }

    @Override
    public void tampilkanWarga() {
        super.tampilkanWarga();
        if (statusKepalaKelurga == true) {
            System.out.println(nama + " adalah kepala keluarga");
        } else {
            System.out.println(nama + " adalah anggota keluarga");
        }
    }
}
