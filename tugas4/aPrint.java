package ideforestation;

public class aPrint extends deforestation{
    public void askQuestion(){
        System.out.print("Masukan luas hutan yang hilang (per hektar): ");
        deforestationPerHa = in.nextInt();
    }
    public void printSum (){
        System.out.println("Emisi deforestasi = Luas hutan hilang x Emisi per hektar");
        System.out.println("Emisi deforestasi = " + deforestationPerHa + " hektar x "+ emisiDeforestation +" ton CO2/hektar");
        System.out.println("Emisi deforestasi = "+ calculate() + " ton CO2");
    }

    
}
