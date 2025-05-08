package oop2;

import java.util.Scanner;
        
public class Pohon {
    private String batang;
    private String daun;
    private String akar;
    int rightAnswer = 0;
    
    Scanner scan = new Scanner(System.in);
        
    public String getBatang(){
        return batang;
    }
   public String getDaun(){
        return daun;
     }
    public String getAkar(){
        return akar;
    }
    public void setBatang(String newBatang){
        this.batang = newBatang;
    }
    public void setDaun(String newDaun){
       this.daun = newDaun;
    }
    public void setAkar(String newAkar){
       this.akar= newAkar;
    }
    
    public void printPoet(){
        System.out.println("1. Saya melihat ....... pohon");
        System.out.println("2. dengan ...... yang berguguran");
        System.out.println("3. dan ....... yang membuat pohon berdiri dengan gagah");
        System.out.println("Lengkapi puisi diatas!!!!!");        
    }
    
   public void checkAnswer(){
       if(batang.equalsIgnoreCase("Batang")){
           rightAnswer += 1;
       } if(daun.equalsIgnoreCase("Daun")){
           rightAnswer += 1;
       } if(akar.equalsIgnoreCase("akar")){
           rightAnswer += 1;
       }       
   }
   public void showAnswer(){
       if (rightAnswer == 0) {
           System.out.println("Jawaban yang benar tidak ada");
       } else {
           System.out.println(rightAnswer + " Jawaban yang benar");
       }
   }
   
    public void startQuizzPohon(){
        printPoet();
        System.out.print("1. ");
        setBatang(scan.next());
        System.out.print("2. ");
        setDaun(scan.next());
        System.out.print("3. ");
        setAkar(scan.next());
        checkAnswer();
        showAnswer();
    }
    
    
}
