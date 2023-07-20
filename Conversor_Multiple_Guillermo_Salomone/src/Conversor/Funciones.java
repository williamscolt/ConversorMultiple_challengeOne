package Conversor;
import javax.swing.*;

public class Funciones {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
    ConvertirLongitudes longitudes = new ConvertirLongitudes();
    public void ConvertirMonedas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras",
                		"De Pesos a Wones", "De Pesos a Yenes", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos" , 
                		"De Wones a Pesos", "De Yenes a Pesos" },
                "Seleccion")).toString();

        switch (opcion){
            case "De Pesos a Dolar":
                monedas.ConvertirPesosArgentinosADolar(valorRecibido);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosArgentinosAEuro(valorRecibido);
                break;
            case "De Pesos a Libras":
                monedas.ConvertirPesosArgentinosALibra(valorRecibido);
                break;
            case "De Pesos a Wones":
                monedas.ConvertirPesosArgentinosAWon(valorRecibido);
                break;
            case "De Pesos a Yenes":
                monedas.ConvertirPesosArgentinosAYen(valorRecibido);
                break; 
            case "De Dolar a Pesos":
                monedas.ConvertirDolarAPesosArgentinos(valorRecibido);
                break;    
            case "De Euro a Pesos":
                monedas.ConvertirEuroAPesosArgentinos(valorRecibido);
                break;   
            case "De Libras a Pesos":
                monedas.ConvertirLibrasAPesosArgentinos(valorRecibido);
                break; 
            case "De Wones a Pesos":
                monedas.ConvertirWonAPesosArgentinos(valorRecibido);
                break;
            case "De Yenes a Pesos":
                monedas.ConvertirYenAPesosArgentinos(valorRecibido);
                break;    

            }
        }

    public void ConvertirTemperaturas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Celsius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheith(valorRecibido);
                break;
            case "De Fahrenheit a Celsius":
                temperaturas.ConvertirFahrenheithACelsius(valorRecibido);
                break;

        }


    }
    
    public void ConvertirLongitudes( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una longitud a convertir",
                "Longitudes", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Centimetro a Metro", "De Centimetro a Kilometro",
                		"De Metro a Centimetro", "De Metro a Kilometro", "De Kilometro a Metro", "De Kilometro a Centimetro"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Centimetro a Metro":
                longitudes.ConvertirCentimetroAMetro(valorRecibido);
                break;
            case "De Centimetro a Kilometro":
                longitudes.ConvertirCentimetroAKilometro(valorRecibido);
                break;    
            case "De Metro a Centimetro":
            	longitudes.ConvertirMetroACentimetro(valorRecibido);
                break;
            case "De Metro a Kilometro":
                longitudes.ConvertirMetroAKilometro(valorRecibido);
                break; 
            case "De Kilometro a Metro":
                longitudes.ConvertirKilometroAMetro(valorRecibido);
                break;
            case "De Kilometro a Centimetro":
                longitudes.ConvertirKilometroACentimetro(valorRecibido);
                break;    
        }
        
     }
}
