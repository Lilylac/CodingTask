package oop2;
import java.util.Scanner;

public class OOP2 {
    public static void main(String[] args) {
        Pohon pohon = new Pohon();
        Scanner scan = new Scanner(System.in);
        pantun Pantun = new pantun();
        int quizz;
        
        System.out.println("""
                           Pilih Quizz
                           1. Puisi
                           2. Pantun
                           """);
        
        quizz = scan.nextInt();
        
        if (quizz == 1){
            pohon.startQuizzPohon();        
        }
        if (quizz == 2){
            Pantun.startQuizzPantun();
        }
    }
    
}
