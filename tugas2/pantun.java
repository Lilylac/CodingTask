package oop2;

import java.util.Scanner;

public class pantun{
    private String lele;
    private String lee;
    private String tugas; 
    int rightAnswer = 0;

    Scanner scan = new Scanner(System.in);
    
    public String getlele(){
        return lele;
    }
    public String getLee(){
        return lee;
    }
    public String getTugas(){
        return tugas;
    }
    public void setLele(String newLele){
        this.lele = newLele;
    }
    
    public void setLee(String newLee){
        this.lee = newLee;
    }
    
    public void setTugas(String newTugas){
        this.tugas = newTugas;
    }
    
    
    public void printPantun(){
        System.out.println("""
                           1. Ubur-ubur ikan ....,
                           2. ..... baru kelar, malah ada tugas baru 3. ...
                           
                           Lengkapi Pantun diatas!!!
                           """);
    }
    
    public void checkAnswer(){
        if (lele.equalsIgnoreCase("lele")){
            rightAnswer += 1;
        } if (tugas.equalsIgnoreCase("tugas")){
            rightAnswer += 1;
        } if (lee.equalsIgnoreCase("lee")){
            rightAnswer += 1;
        }
        
    }
    
    public void showAnswer(){
       if (rightAnswer > 0) {
           System.out.println(rightAnswer + " Jawaban yang benar");
       } else {
           System.out.println("Jawaban yang benar tidak ada");
       }
   }

    public void startQuizzPantun(){
        printPantun();
        System.out.print("1. ");
        setLele(scan.next());
        System.out.print("2. ");
        setTugas(scan.next());        
        System.out.print("3. ");
        setLee(scan.next());

        checkAnswer();
        showAnswer();

    }
    
}
