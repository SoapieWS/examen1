/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----Menu-----");
        System.out.println("1. Piramide");
        System.out.println("2. El mayor");
        System.out.println("3. Clientes");
        System.out.println("4. Caracteres vocales");
        System.out.println("5. Salir");
        
        System.out.println("Seleccione una opcion");
        int opcion = entrada.nextInt();
        
        switch (opcion){
            
            case 1:
                
            case 2:
                
                Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        String continueInput;
                
                
                do {
            System.out.print("Ingrese un número entero: ");
            int number = scanner.nextInt();

            
            if (number > maxNumber) {
                maxNumber = number;
            }

            
            sum += number;
            count++;

            
            System.out.print("¿Desea ingresar otro número? (Si/No): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("Si"));

        
        double average = (count > 0) ? (double) sum / count : 0;

        System.out.println("El número mayor ingresado fue: " + maxNumber);
        System.out.println("El promedio de los números ingresados es: " + average);
                
            case 3:
                Scanner cliente = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = cliente.nextLine();

        
        int canalesHD = 0;
        int canalesNormales = 0;
        int costoCanales = 0;

        
        String continuar = null;
        do {
            System.out.print("Ingrese el tipo de canal (HD/NORMAL): ");
            String tipoCanal = cliente.next();

            
            switch (tipoCanal.toUpperCase()) {
                case "HD":
                    canalesHD++;
                    costoCanales += 30;  
                    break;
                case "NORMAL":
                    canalesNormales++;
                    costoCanales += 20;
                    break;
                default:
                    System.out.println("Tipo de canal no válido. Intente de nuevo.");
                    continue;  
            }

            System.out.print("¿Desea ingresar otro canal? (Si/No): ");
            continuar = cliente.next();
        } while (continuar.equalsIgnoreCase("Si"));

        
        int costoCaja = 0;
        System.out.print("Ingrese el tipo de Caja Digital deseada (LIGHTBOX, HDBOX, DVRBOX): ");
        String tipoCaja = cliente.next();

        switch (tipoCaja.toUpperCase()) {
            case "LIGHTBOX":
                costoCaja = 50;
                break;
            case "HDBOX":
                costoCaja = 100;
                break;
            case "DVRBOX":
                costoCaja = 150;
                break;
            default:
                System.out.println("Tipo de caja no válido. Se asumirá costo de 0.");
        }

        
        int subtotal = costoCanales + costoCaja;
        double impuesto = subtotal * 0.15;
        double total = subtotal + impuesto;

        
        System.out.println("\nDETALLE DE FACTURACIÓN");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Canales Normales: " + canalesNormales);
        System.out.println("Canales HD: " + canalesHD);
        System.out.println("Subtotal a Pagar: " + subtotal + " lps");
        System.out.println("Impuesto (15%): " + impuesto + " lps");
        System.out.println("Total a Pagar: " + total + " lps");

                
            case 4:
                 Scanner vocales = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = vocales.nextLine();

        int contadorVocales = 0;

        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadorVocales++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("La cantidad de vocales minúsculas es: " + contadorVocales);
                
            case 5:
                System.out.println("HASTA LUEGO");
                break;
        }
        
        
    }
    
}
