
package main;

/*
 @author goret
 */
public class Arbol {

    
    public static void main(String[] args) {
        
       System.out.println("         *         ");
       String salida = "";
       
       char [] espacios = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
       
       for(int i=9, j=9; j>0; i++, j--){
           char ceros = '0';
          
           
           espacios[i] = ceros;
           espacios[j] = ceros;
           
           salida = new String(espacios);
           
           System.out.println(salida);
       }
    }
}
