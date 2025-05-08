package tugas.pt.pkg9;

import java.util.*;

public class kepalaKeluarga extends Warga{
    Scanner sc = new Scanner(System.in);

    public void addLeaderStatus(String statusLeader) {
        System.out.println("Masukan Nomor Warga: ");
        int index = Integer.valueOf(sc.nextLine());
        Netizen.get(index).status = true;
    }
    
}
