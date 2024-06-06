package Calculos;

import java.util.Scanner;

public class MonedaValor{
    private double convertirMoneda;
    private double cantidadConvertir;

    public double getConvertirMoneda(){
        return convertirMoneda;
    }
    Scanner in = new Scanner(System.in);
    public void calculoDolarMonedas(double valorMoneda, String abr){
        cantidadConvertir = cantidadaConvertir();
        convertirMoneda = valorMoneda * cantidadConvertir;
        System.out.println("El valor de " + cantidadConvertir + " [USD], es igual a " + convertirMoneda + "[" + abr + "]");
    }
    public void  calculoMonedasDolares(double valorMoneda, String abr){
        double cantidadConvertir = cantidadaConvertir();
        convertirMoneda = cantidadConvertir/valorMoneda;
        System.out.println("El valor de " + cantidadConvertir + "[" + abr + "], es igual a" + convertirMoneda + "[USD] \n");
    }

    public double cantidadaConvertir(){
        try{
            System.out.println("Ingrese el valor de moneda a convertir");
            cantidadConvertir = Double.parseDouble(in.next());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return cantidadConvertir;
    }
}
