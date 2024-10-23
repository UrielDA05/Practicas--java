/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author uriel
 */
public class Calificaciones {
    public static void main(String[] args) { 
        byte n;
        n=Byte.parseByte(JOptionPane.showInputDialog("Ingrese tu nota del 1 al 20"));
        if (n==19 | n==20){
            System.out.println("Tu calificacion es una A");
            JOptionPane.showMessageDialog(null,"Tu calificacion es una A");
        }else{
            if (n>=16 & n<=18){
                System.out.println("Tu calificacion es una B");
                JOptionPane.showMessageDialog(null,"Tu calificacion es una B");
            }else{
                if (n>=13 & n<=15){ 
                    System.out.println("Tu calificacion es una C");
                    JOptionPane.showMessageDialog(null,"Tu calificacion es una C");
                }else{
                    if (n>=10 & n<=12){ 
                        System.out.println("Tu calificacion es una D");
                        JOptionPane.showMessageDialog(null,"Tu calificacion es una D");
                    }else{
                        if (n>=1 & n<=9){
                            System.out.println("Tu calificacion es una E");
                            JOptionPane.showMessageDialog(null,"Tu calificacion es una E");
                               
                        }
                    }  
                }                          
            }
        }
    }
}