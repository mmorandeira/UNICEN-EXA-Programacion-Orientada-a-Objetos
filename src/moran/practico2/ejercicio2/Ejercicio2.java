package moran.practico2.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Appliance ap1=new Appliance("Heladera","Roja",500f,25f);
        printAppliance(ap1);

    }

    public static void printAppliance(Appliance apliance){
        System.out.println(apliance.getName() + ", " + apliance.getColor() + ", " + apliance.getBasePrice() + ", "
                + apliance.getConsumption() + ", " + apliance.getBalance() + ", " + apliance.isHighEnd() + ", " +
                apliance.isLowConsumption());
    }
}
