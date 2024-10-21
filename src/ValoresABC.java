
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uriel
 */
public class ValoresABC {
    public static void main (String args[]){
        short A;
        short B;
        short C;
        A=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el primer valor"));
        B=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el segundo valor"));
        C=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el tercer valor"));
        if (A>B & A>C){
            System.out.println(A+" Es el mayor");
            JOptionPane.showMessageDialog(null, A+" Es el mayor");
        }else{ 
            if (B>A & B>C){
                System.out.println(B+" Es el mayor");
                JOptionPane.showMessageDialog(null, B+" Es el mayor");
            }else{
                System.out.println(C+" Es el mayor");
                JOptionPane.showMessageDialog(null, C+" Es el mayor");
                
                
            }
        }
          
    }
    
}
