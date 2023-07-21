package Conversor;

import javax.swing.JOptionPane;

public class ConvertirLongitudes {
	public void ConvertirCentimetroAMetro(double valorRecibido){
        // formula  cm / 100
        double longitudMetro = (valorRecibido / 100);
        longitudMetro = (double) Math.round(longitudMetro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudMetro + " Metros");
    }
	
	public void ConvertirCentimetroAKilometro(double valorRecibido){
        // formula cm / 100000
        double longitudKilometro = (valorRecibido / 100000);
        longitudKilometro = (double) Math.round(longitudKilometro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudKilometro + " Kilometros");
    }
	
	public void ConvertirMetroACentimetro(double valorRecibido){
        // formula cm * 100
        double longitudCentimetro = (valorRecibido * 100);
        longitudCentimetro = (double) Math.round(longitudCentimetro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudCentimetro + " Centimetros");
    }
	
	public void ConvertirMetroAKilometro(double valorRecibido){
        // formula m / 1000
        double longitudKilometro = (valorRecibido / 1000);
        longitudKilometro = (double) Math.round(longitudKilometro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudKilometro + " Kilometros");
    }
	
	public void ConvertirKilometroAMetro(double valorRecibido){
        // formula cm * 1000
        double longitudMetro = (valorRecibido * 1000);
        longitudMetro = (double) Math.round(longitudMetro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudMetro + " Metros");
    }
	
	public void ConvertirKilometroACentimetro(double valorRecibido){
        // formula cm * 100000
        double longitudCenimetro = (valorRecibido * 100000);
        longitudCenimetro = (double) Math.round(longitudCenimetro * 100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es " + longitudCenimetro + " Centimetros");
    }
	

}
