package tugas.pt.pkg9;

import java.util.*;

public class Warga {

    ArrayList<Warga> Netizen = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String nik;
    String nama;
    String alamat;
    boolean status;

    public Warga() {
        super();
    }

    Warga(String nik, String nama, String alamat, boolean status) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void infoWarga() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        
    }

    public void addWarga() {
        System.out.println("NIK : ");
        String nik = String.valueOf(sc.nextLine());
        System.out.println("Nama : ");
        String nama = String.valueOf(sc.nextLine());
        System.out.println("Alamat : ");
        String alamat = String.valueOf(sc.nextLine());
        Netizen.add(new Warga(nik, nama, alamat, false));
        showMenu();
    }

    public void printAllWarga() {
        for (int i = 0; i < Netizen.size(); i++) {
            System.out.println("==========" + i + "==========");
            Netizen.get(i).infoWarga();
        }
        showMenu();

    }

    public void deleteWarga() {
        System.out.println("Masukan Nomor Warga: ");
        int index = Integer.valueOf(sc.nextLine());
        Netizen.remove(index);
        showMenu();
    }

    public void editWarga() {
        System.out.println("Masukan Index Warga : ");
        int index = Integer.valueOf(sc.nextLine());
        System.out.println("Masukan Data Yang akan Di edit");
        String choose = String.valueOf(sc.nextLine());
        if (choose.equalsIgnoreCase("nik")) {
            System.out.println("Data Baru: ");
            String newNik = String.valueOf(sc.nextLine());
            Netizen.get(index).nik = newNik;
        } else if (choose.equalsIgnoreCase("nama")) {
            System.out.println("Data Baru: ");
            String newNama = String.valueOf(sc.nextLine());
            Netizen.get(index).nama = newNama;
        } else if (choose.equalsIgnoreCase("alamat")) {
            System.out.println("Data Baru: ");
            String newAlamat = String.valueOf(sc.nextLine());
            Netizen.get(index).alamat = newAlamat;
        } else {
            System.out.println("Tidak Bisa ada yang diubah");
        }
        showMenu();

    }

    public void showMenu() {
        System.out.println("========== Menu Warga ==========");
        System.out.println("1. Tambah Warga");
        System.out.println("2. Hapus Warga");
        System.out.println("3. Informasi Warga");
        System.out.println("4. Edit Data Warga");

        int choose = Integer.valueOf(sc.nextLine());

        if (choose == 1) {
            addWarga();
        } else if (choose == 2) {
            System.out.println("I am Here");
            System.out.println("I am Here");
            deleteWarga();
        } else if (choose == 3) {
            printAllWarga();
        } else if (choose == 4) {
            editWarga();
        }
    }

}
