package Conversor;
import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public void ConvertirPesosArgentinosADolar( double valorRecibido){
        double monedaDolar = valorRecibido / 263.98;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }

    public void ConvertirPesosArgentinosAEuro( double valorRecibido){
        double monedaEuro = valorRecibido / 294.12;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    
    public void ConvertirPesosArgentinosALibra( double valorRecibido){
        double monedaLibra = valorRecibido / 342.95;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
    }
    
    public void ConvertirPesosArgentinosAWon( double valorRecibido){
        double monedaWon = valorRecibido / 342.95;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones");
    }
    
   
    public void ConvertirPesosArgentinosAYen( double valorRecibido){
        double monedaYen = valorRecibido / 1.91;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
    }
    
    
    //Conversion de otra moneda a pesos // 
    
    public void ConvertirDolarAPesosArgentinos( double valorRecibido){
        double monedaPesos = valorRecibido * 263.98;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }
    
    public void ConvertirEuroAPesosArgentinos( double valorRecibido){
        double monedaPesos = valorRecibido * 294.12;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }
    
    public void ConvertirLibrasAPesosArgentinos( double valorRecibido){
        double monedaPesos = valorRecibido * 342.95;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }
    
    public void ConvertirWonAPesosArgentinos( double valorRecibido){
        double monedaPesos = valorRecibido * 0.21;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }
    
    public void ConvertirYenAPesosArgentinos( double valorRecibido){
        double monedaPesos = valorRecibido * 1.91;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

}
