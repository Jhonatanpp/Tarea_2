/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author user
 */


public class Alumno {
    String name;
    String major;
    int age;
    String phone;

    public Alumno(String name, String major, int age, String phone) {
        this.name = name;
        this.major = major;
        this.age = age;
        this.phone = phone;
    }

    public void mostrarDatos() {
        System.out.println("El nombre del estudiante es: " + name);
        System.out.println("La carrera del estudiante es: " + major);
        System.out.println("La edad del estudiante es: " + age);
        System.out.println("El teléfono del estudiante es: " + phone);
    }
    
        
    public Long convertirALong() {
        return Long.valueOf(age);
    }

    public Float convertirAFloat() {
        return Float.valueOf(age);
    }

    public Double convertirADouble() {
        return Double.valueOf(age);
    }
}
