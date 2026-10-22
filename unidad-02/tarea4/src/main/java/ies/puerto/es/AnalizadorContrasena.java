package ies.puerto.es;

import java.util.Scanner;

public class AnalizadorContrasena {

    static int contarMayusculas(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isUpperCase(sContra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    static int contarMinusculas(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isLowerCase(sContra.charAt(i))) {
                contador++;
            }

        }
        return contador;
    }

    static int contarDigitos(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if(Character.isDigit(sContra.charAt(i))) {
                contador ++;
            }
            
        }
        return contador;
    }

    static int contarSimbolos(String sContra){
if (sContra == null || sContra.isEmpty()) {
    return 0;
}
int contador = 0;
for (int i = 0; i < sContra.length(); i++) {
    if (!Character.isLetterOrDigit(sContra.charAt(i))) {
      contador++;  
    }
}
        return contador;
    }

    static boolean tieneLongitudMinima(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return false;
        }
        
            if (sContra.length() > 8) {
            return true;
            }
            return false;
        
    }

    static boolean esContrasenaValida(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return false;
        }

        if (!tieneLongitudMinima(sContra) && contarMayusculas(sContra) == 0 && contarMinusculas(sContra) == 0 && contarDigitos(sContra) == 0) {
            return false;
        }

        return true;
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.println("Ingresa: ");
         * String contra = scanner.nextLine();
         * 
         * 
         * int sContraR = contarMayusculas(contra);
         * 
         * System.out.println("resultado: " + sContraR);
         * 
         * System.out.println("Ingresa: ");
         * String contra = scanner.nextLine();
         * 
         * 
         * int sContraR = contarMinusculas(contra);
         * 
         * System.out.println("resultado: " + sContraR);
         

          System.out.println("Ingresa: ");
          String contra = scanner.nextLine();
          
          
          int sContraR = contarDigitos(contra);
          
          System.out.println("resultado: " + sContraR);
          

          System.out.println("Ingresa: ");
          String contra = scanner.nextLine();
          
          
          boolean sContraR = tieneLongitudMinima(contra);
          
          System.out.println("resultado: " + sContraR);
*/
           System.out.println("Ingresa: ");
          String contra = scanner.nextLine();
          
          
          boolean sContraR = esContrasenaValida(contra, false, 0, 0, 0);
          
          System.out.println("resultado: " + sContraR);
        scanner.close();
    }

}
