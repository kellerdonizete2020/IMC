
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;
import java.util.Scanner;
//import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class IMC {
    
   private double peso, imc;
   private double altura;
   Scanner ler = new Scanner(System.in);
   //DecimalFormat df = new DecimalFormat("0.00");

    public double getPeso(double peso) {
        
        return peso;
    }

    public void setPeso() {
       System.out.println("Entre com o peso em kg:");
       peso=ler.nextDouble();
       this.peso = peso;
        
        
    }

    public double getAltura(double altura) {
        return altura;
    }

    public void setAltura() {
        System.out.println("Entre com a altura em cm:");
        altura=ler.nextDouble();
        this.altura = altura;
    }
    
    public double CalculaImc(double peso, double altura){
        imc = (this.peso/(this.altura*this.altura))*10000;
       /*String format = df.format(imc);
       Double valorDouble = Double.parseDouble(format);*/
       
       
      if(imc<17){
          System.out.println("Muito abaixo do peso.");

      }else if(imc>17 && imc<18.49){
          System.out.println("Abaixo do peso.");
          
         }else if(imc>=18.50 && imc<=24.99){
      System.out.println("Peso normal.");
         
    }else if(imc>=25.0 && imc<=29.99){
      System.out.println("Acima do peso.");
         
    }else if(imc>=30.0 && imc<=34.99){
      System.out.println("Obesidade I.");
         
    }else if(imc>=35.0 && imc<=39.99){
      System.out.println("Obesidade II-Severa.");
         
    }else if(imc>=40.0){
      System.out.println("Obesidade III - Mórbida.");
          }
      return imc;
        
    
}
}

   
    
   
    
    

