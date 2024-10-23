/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
public class ValoresDistintos {
    public static void main (String args []){
        short a;
        a=0;
        short b;
        b=0;
        a= Short.parseShort(JOptionPane.showInputDialog(" Ingresa el primer valor"));
        b= Short.parseShort(JOptionPane.showInputDialog(" Ingresa el segundo valor"));
        if (a==b){
            System.out.println(" a y b son iguales");
            JOptionPane.showMessageDialog(null," a y b son iguales");
        } else {
            if (a>b){
                System.out.println(a+" Es el mayor");
                JOptionPane.showMessageDialog(null, a +" Es el mayor");
            }else{
                System.out.println(b+" Es el mayor" );
                JOptionPane.showMessageDialog(null, b +" Es el mayor");
            }
            
        }
            
        
        
        
        
                
                        
    }     
}
