package Conversor;


import javax.swing.JOptionPane;



public class maestro {
  public static void main(String[] args) {
	  
	  Funciones monedas = new Funciones();
      Funciones temperaturas = new Funciones();
      Funciones longitudes = new Funciones();

        String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion", "Menu",
                  JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitudes"},
                  "Seleccion")).toString();
        
  
        
       switch (opciones){
        case "Conversor de Moneda":{        	
            String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
            
            boolean esNumerico = input.matches("-?\\d+");
            if(esNumerico) {
            	double valorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(valorRecibido);
            }else {
            	JOptionPane.showMessageDialog(null, "Campo vacio o Valor no permitido!, vuelva a intentar");
                maestro.main(args);
            }
                                    
            int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");

            if (JOptionPane.OK_OPTION == seleccion){
            	maestro.main(args);             
            }
           
             else {
               JOptionPane.showMessageDialog(null, "El programa ha finalizado!");
               System.exit(0);
               break;
             }
            }
        
                       
              
           
       
        case "Conversor de Temperatura":{
            String input = JOptionPane.showInputDialog("Ingrese un valor de la temperatura a convertir");
            boolean esNumerico = input.matches("-?\\d+");
            if(esNumerico) {
            	double valorRecibido = Double.parseDouble(input);
                temperaturas.ConvertirTemperaturas(valorRecibido);
            }else {
            	JOptionPane.showMessageDialog(null, "Campo vacio o Valor no permitido!, vuelva a intentar");
                maestro.main(args);
            }

           int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
           if (JOptionPane.OK_OPTION == seleccion){
               maestro.main(args); 
                
           } else {
              JOptionPane.showMessageDialog(null, "El programa ha terminado!");
              System.exit(0);
              break;
           }
        }
        
        case "Conversor de Longitudes":{        	
            String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
            
            boolean esNumerico = input.matches("-?\\d+");
            if(esNumerico) {
            	double valorRecibido = Double.parseDouble(input);
                longitudes.ConvertirLongitudes(valorRecibido);
            }else {
            	JOptionPane.showMessageDialog(null, "Campo vacio o Valor no permitido!, vuelva a intentar");
                maestro.main(args);
            }
                                    
            int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");

            if (JOptionPane.OK_OPTION == seleccion){
            	maestro.main(args);             
            }
           
             else {
               JOptionPane.showMessageDialog(null, "El programa ha finalizado!");
               System.exit(0);
               break;
             }
            }
     }

  }
  }


   
  
  
   
  

