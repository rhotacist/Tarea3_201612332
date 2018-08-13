/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201612332;

import java.util.Scanner;
/**
 *
 * @author mrcar
 */
public class menu {
    
        public static Scanner leer = new Scanner(System.in); //para capturar el teclado
        public static int opcion;//variable para la seleccion de opciones  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicio de menu...
        
        System.out.println("[IPC1]Tarea3_201612332");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de digitos repetidos");
        System.out.println("3. Tres número de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        System.out.println("→Ingrese numero de opcion: ");
         opcion = leer.nextInt(); //crea y almacena una variable de tipo entero para la opcion
        
        switch(opcion){
            
            case 1: metodo_usuarios();
                    break;
            
            case 2: metodo_contador();
                    break;
            
            case 3: metodo_organizar();
                    break;
                    
            case 4: metodo_promedio();
                    break;
                    
            case 5: System.exit(0);
                    System.out.println("••• SALIENDO DE PROGRAMA...");
                    break;
                    
            default: menu.main(args);
        }
        
    }

        static void metodo_usuarios() {
            int i; //variable que ayudara a imprimir datos del arreglo
            //creare arriba el arreglo vacio
            String[] nombres = new String[5];
            //creare un scanner de tipo string
            
            
        System.out.println("-PROGRAMA USUARIOS");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios ascendente");
        System.out.println("3. Mostrar Usuarios descendente");
        System.out.println("4. Menu principal");
        opcion = leer.nextInt(); //crea y almacena una variable de tipo entero para la opcion
        switch(opcion){
            case 1: 
                //para las verificaciones de usuarios usare ciclos while para que este se repita hasta que deje de cumplir
                //se puede optimizar la verificacion?
                    System.out.print("Ingresar Usuario #1: ");
                    nombres[0]= leer.next();

                    System.out.print("Ingresar Usuario #2: ");
                    nombres[1]= leer.next();
                    //verifica si el nombre 2 concuerda con el uno
                    while (nombres[1].equals(nombres[0])){
                        System.out.println("Usuario "+nombres[1]+" Existente, Ingrese nuevo usuario #2");
                        nombres[1]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #3: ");
                    nombres[2]= leer.next();
                    //verifica si el nombre 3 concuerda con el 1 o el 2
                    while (nombres[2].equals(nombres[1]) || nombres[2].equals(nombres[0])){
                        System.out.println("Usuario "+nombres[2]+" Existente, Ingrese nuevo usuario #3");
                        nombres[2]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #4: ");
                    nombres[3]= leer.next();
                    //verifica si el nombre 4 concuerda con el 1,2 o 3
                    while (nombres[3].equals(nombres[0]) || nombres[3].equals(nombres[1]) ||nombres[3].equals(nombres[2]) ){
                        System.out.println("Usuario "+nombres[3]+" Existente, Ingrese nuevo usuario #4");
                        nombres[3]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #5: ");
                    nombres[4]= leer.next();
                    //verifica si el nombre 5 concuerda con el 1,2,3 o 4
                    while (nombres[4].equals(nombres[0]) || nombres[4].equals(nombres[1]) ||nombres[4].equals(nombres[2]) || nombres[4].equals(nombres[3]) ){
                        System.out.println("Usuario "+nombres[4]+" Existente, Ingrese nuevo usuario #5");
                        nombres[4]= leer.next();
                    }
                    
                    System.out.print("Nombres Ingresados: ");
                    //usare un ciclo for para que me imprima los nombres ingresados anterior mente
                        for (i=0;i<nombres.length; i++){
                            System.out.print(nombres[i]+", ");
                            
                        }
                        
            case 2: metodo_contador();
                    break;
            
            case 3: metodo_organizar();
                    break;
                    
            case 4: metodo_promedio();
                    break;
                    
            
                    
            default: metodo_usuarios();
                    System.out.println("Ingrese opcion valida");
        }
    }

    static void metodo_contador() {
        
    }

    static void metodo_organizar() {
        
    }

    static void metodo_promedio() {
        
    }
    
}
