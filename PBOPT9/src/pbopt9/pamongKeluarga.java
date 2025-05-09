package pbopt9;



public class pamongKeluarga extends warga{
    boolean statusPamongWarga;
    public pamongKeluarga(String nik, String nama, String alamat, boolean statusPamongWarga) {
        super(nik, nama, alamat);
    }

    @Override
    public void tampilkanWarga() {
        super.tampilkanWarga();
        if(statusPamongWarga == true){
            System.out.println(nama + " adalah pamong warga");
        }
    }
}
