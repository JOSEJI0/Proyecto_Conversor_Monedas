package Calculos;

import ClasePadre.Moneda;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaConversor {
    public Moneda conexion(String abr){
        Moneda moneda = null;
        try{
            String urlDireccion = "https://v6.exchangerate-api.com/v6/9200b1e987bc366b25063544/latest/USD";

            URL url = new URL(urlDireccion);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObject = root.getAsJsonObject();

            JsonObject jsondentro = jsonObject.getAsJsonObject("conversion_rates");

            for (String clave : jsondentro.keySet()){
                if(clave.equals(abr)){
                    JsonElement valor = jsondentro.get(clave);
                    double doubleValor = valor.getAsDouble();
                    moneda = new Moneda(clave, doubleValor);
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("Tiene un error: " + e.getMessage());
        }
        return moneda;
    }
    }
