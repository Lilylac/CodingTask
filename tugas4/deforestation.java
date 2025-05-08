package ideforestation;

import java.util.Scanner;

public abstract class deforestation implements icalculate{  
    Scanner in = new Scanner(System.in);
    int emisiDeforestation = 50;
    int deforestationPerHa;
        
    @Override
    public int calculate(){
        int sum = emisiDeforestation * deforestationPerHa;
        return sum;
     }    
}
