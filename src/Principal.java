import Calculos.ConsultaConversor;
import Calculos.MonedaValor;
import ClasePadre.Moneda;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            Mostrar();

            try {
                int opciones = Integer.parseInt(in.next());
                if (opciones == 9) {
                    break;
                }
                String abrMoneda;
                ConsultaConversor consultaConversor = new ConsultaConversor();
                MonedaValor monedaValor = new MonedaValor();
                Moneda monedaBusqueda;

                switch (opciones) {

                    case 1:
                        abrMoneda = "EUR";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoDolarMonedas(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 2:
                        abrMoneda = "EUR";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoMonedasDolares(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 3:
                        abrMoneda = "MXN";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoDolarMonedas(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 4:
                        abrMoneda = "MXN";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoMonedasDolares(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 5:
                        abrMoneda = "BRL";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoDolarMonedas(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 6:
                        abrMoneda = "BRL";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoMonedasDolares(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 7:
                        abrMoneda = "ARS";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoDolarMonedas(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    case 8:
                        abrMoneda = "ARS";
                        monedaBusqueda = consultaConversor.conexion(abrMoneda);
                        monedaValor.calculoMonedasDolares(monedaBusqueda.getValor(), abrMoneda);
                        break;
                    default:
                        System.out.println("Ingrese una opción valida entre 1 y 7");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("---------------------------------------------------------");
        }
    }

    public static void Mostrar(){
        System.out.println("Realiza tus conversiones: ");
        System.out.println("""
                1) Dólar a Euro
                2) Euro a Dólar
                3) Dólar a Peso Mexicano
                4) Peso Méxicano a Dólar
                5) Dólar a Real Brasileño
                6) Real Brasileño a Dólar
                7) Dólar a Peso Argentino
                8) Peso Argentino a Dólar
                9) Salida""");
        System.out.println("---------------------------------------------------------");
    }
}
