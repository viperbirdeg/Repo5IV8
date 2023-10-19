/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion.a.binario;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ConversionABinario {

    public static void main(String[] args) {

        //que sea entre 0/255 
        // que sea num
        //rellenar
        String ipBinario = "";
        boolean pan = true;
        while (pan) {
            try {
                String ip = JOptionPane.showInputDialog("Ingresa tu ip");
                String[] ipArray = ip.split("\\.",4);                
                for(int i = 0; i<4;i++){
                    int s = Integer.parseInt(ipArray[i]);
                    ipBinario += binario(s);
                    if(i<3){
                        ipBinario += ".";
                    } 
                }
                
                pan = false;
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ipBinario = "";
                pan = true;
            } finally {
            }
        }
        JOptionPane.showMessageDialog(null, "ip binareada: "+ipBinario);

        


// TODO code application logic here
    }
    
    public static String binario(int a){
        int num = a;
        String res = "";
        while (num != 0 && num != 1) {
            res = Integer.toString(num % 2) + res;
            num = num / 2;
        }
        res = num + res;

        //rellenar octeto de ip
        while (res.length() != 8) {
            res = 0 + res;
        }
        return res;
    }
}

//pedir numero entre 0-255 #si es mayor o menor regresar
//
