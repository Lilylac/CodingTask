//Warga
//Kepala Keluarga, 
//Anggota Keluarga, 
//Pamong warga,
//Kegiatan, 
//Iuran
package tugas.pt.pkg9;

import java.util.Scanner;

public class RukunWarga {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Warga w = new Warga();
        kepalaKeluarga kk =new kepalaKeluarga();
         
        w.showMenu();
        kk.addWarga();
    }


}
