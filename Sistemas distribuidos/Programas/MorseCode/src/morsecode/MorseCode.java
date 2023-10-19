/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morsecode;

/**
 *
 * @author victo
 */
public class MorseCode {
    
    private String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String[] letrasM = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public MorseCode() {
    }

    /**
     * @param args the command line arguments
     */
    public void patron(String ltr){
        String[] ltrArray = ltr.split("");
        
        String c = "";  
        
        
        
        for(int i = 0, j = 1, k=2,l=3;i < ltrArray.length; i++,j++,k++){
            String a = "";
            comp(a); 
        }
            
    } 
    
    public String comp(String a){
        
         for(int w=0; w<letrasM.length;w++){
                if(a.contains(letrasM[w])){
                    return letras[w];
                }
            }
         return null;
    }
    
    
    
}
