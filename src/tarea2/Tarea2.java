/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import java.util.Scanner;

/**
 *
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
    
    //Compas pongan otras clases aqui abajo otros datos
    }
    
}

