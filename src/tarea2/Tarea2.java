/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import java.util.Scanner;

/**
 * @author Joseph Quevedo
 * @author jhonatan Pedraza
 */
public class Tarea2 {
    //Bienvenidos a la tarea 2
    
    //Jhonatan//
    // Conversión de datos primitivos a objetos 
    
    //Inicio De La Encuesta 
    //1)Nombre
    //2)Edad
    //3)
    
    
    // Ejemplo de conversión de tipos primitivos a objetos en Java usando una encuesta.
    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);
         
        // Solicitar datos al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edadPrimitivo = scanner.nextInt();
        Integer edadObjeto = Integer.valueOf(edadPrimitivo); // Conversión de primitivo a objeto
    //Jhonatan//
    
    
    
    //Joseph//
    
    //Conversion de un dato Int a String basado en tu edad//
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: "); //SOLICITA TU EDAD Y LA ESCANEA
        
        int edad = s.nextInt();  //Se almacena el primitivo como Int
        
        String EDADentexto = String.valueOf(edad); //Hacemos la conversion del objeto a String
        
        System.out.println("Your age written in text is: " + EDADentexto + "."); //Retornamos los datos
        
    //Joseph//
    
    
    
    
    //Compas pongan otras clases aqui abajo otros datos
    
    }
    
}

