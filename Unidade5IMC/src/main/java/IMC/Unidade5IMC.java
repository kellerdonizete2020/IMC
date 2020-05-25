/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

/**
 *
 * @author Administrator
 */
public class Unidade5IMC {
    
    public static void main (String args[]){
        IMC objimc = new IMC();
        double peso=0, alt=0;
        
       objimc.setPeso();
       objimc.setAltura();
       System.out.println("O IMC é: "+objimc.CalculaImc(objimc.getPeso(peso),objimc.getAltura(alt)));
       
    }

 
    
}
