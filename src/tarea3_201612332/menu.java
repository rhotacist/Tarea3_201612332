/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201612332;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mrcar
 */
public class menu {
    
        public static Scanner leer = new Scanner(System.in); //para capturar el teclado
        public static int opcion;//variable para la seleccion de opciones  
        public static int i; //variable que ayudara a imprimir datos del arreglo
        //creare arriba el arreglo vacio para que cuando regrese a los metodos no borre su contenido
        public static String[] nombres = new String[5];//para programa 1
        public static int contador=1;//me servira para mostrar numeracion
        
        public static String numero_contar;//numero para el programa 2
        public static char[] numero_separado;//arreglo que almacenara los digitos separados para el programa 2
        public static String buscador; //utilizado para buscar en el problema 2
        public static char[] numero_buscador;//se almacenara la variable buscador ↑ en un arreglo para compararlo
        
        public static int[] numeros = new int[3]; //arreglo utilizado para almacenar los 3 numeros a ordenar.
        
        public static int[][] id = new int[6][6];
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
                    System.err.println("••• SALIENDO DE PROGRAMA...");
                    break;
                    
            default: menu.main(args);
                System.err.print("Ingrese opcion valida... ");
        }
        
    }

    static void metodo_usuarios() {
            
            
            
            
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
                        System.err.println("Usuario "+nombres[1]+" Existente, Ingrese nuevo usuario #2");
                        nombres[1]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #3: ");
                    nombres[2]= leer.next();
                    //verifica si el nombre 3 concuerda con el 1 o el 2
                    while (nombres[2].equals(nombres[1]) || nombres[2].equals(nombres[0])){
                        System.err.println("Usuario "+nombres[2]+" Existente, Ingrese nuevo usuario #3");
                        nombres[2]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #4: ");
                    nombres[3]= leer.next();
                    //verifica si el nombre 4 concuerda con el 1,2 o 3
                    while (nombres[3].equals(nombres[0]) || nombres[3].equals(nombres[1]) ||nombres[3].equals(nombres[2]) ){
                        System.err.println("Usuario "+nombres[3]+" Existente, Ingrese nuevo usuario #4");
                        nombres[3]= leer.next();
                    }
                    
                    System.out.print("Ingresar Usuario #5: ");
                    nombres[4]= leer.next();
                    //verifica si el nombre 5 concuerda con el 1,2,3 o 4
                    while (nombres[4].equals(nombres[0]) || nombres[4].equals(nombres[1]) ||nombres[4].equals(nombres[2]) || nombres[4].equals(nombres[3]) ){
                        System.err.println("Usuario "+nombres[4]+" Existente, Ingrese nuevo usuario #5");
                        nombres[4]= leer.next();
                    }
                    
                    System.out.print("Usuarios Ingresados: ");
                    //usare un ciclo for para que me imprima los nombres ingresados anterior mente
                        for (i=0;i<nombres.length; i++){
                            System.out.print(nombres[i]+", ");
                            
                        }
                    System.out.println("Usuarios creados correctamente...");
                    System.err.println("Regresando...");  
                    menu.metodo_usuarios();
                        
                        
            case 2: //programa que muestra usuarios ascendente
                contador=1; //resetea el valor del contador
                    if("null".equals(nombres[0]) || "null".equals(nombres[1]) || "null".equals(nombres[2]) || "null".equals(nombres[3]) || "null".equals(nombres[4])){
                        System.err.println("El arreglo de usuarios no ha sido creado");
                        System.err.println("Ingrese usuarios primero...");
                        menu.metodo_usuarios();
                    }
                        System.out.println("Mostrando Usuarios Ascendente...");
                            for (i=4;i>-1; --i){//el arreglo sera recorrido desde su tamaño, hasta que llegue a 0
                                System.out.print(contador+ "→|");
                                contador++;
                            System.out.println(nombres[i]);
                            
                        
                        }
                    
                    
                      System.err.println("Regresando...");  
                      menu.metodo_usuarios();
                        break;
                    
            
            case 3: //programa que muestra usuarios descentente
                contador=1; //resetea el valor del contador
                if("null".equals(nombres[0]) || "null".equals(nombres[1]) || "null".equals(nombres[2]) || "null".equals(nombres[3]) || "null".equals(nombres[4])){
                        System.err.println("El arreglo de usuarios no ha sido creado");
                        System.err.println("Ingrese usuarios primero...");
                        menu.metodo_usuarios();
                    }
                
                        System.out.println("Mostrando Usuarios Ascendente...");
                            for (i=0;i<nombres.length; i++){//el arreglo sera recorrido desde 0 hasta 4
                                System.out.print(contador+ "→|");
                                contador++;
                            System.out.println(nombres[i]);
                            
                        
                        }
                    
                    
                      System.err.println("Regresando...");  
                      menu.metodo_usuarios();
                        break;
            
                    
                    
            case 4://regresa al menu principal
                System.out.println("••• Regresando a menu principal...");
                    menu.main(null);
                    break;
                    
            
                    
            default: //vuelve a cargar el menu si no se es seleccionada ninguna opcion valida
                metodo_usuarios();
                    System.err.println("Ingrese opcion valida");
                    
        }
    }

    static void metodo_contador() {
        
        System.out.println("-PROGRAMA CONTADOR DE DIGITOS REPETIDOS");
        System.out.println("1. Ingresar numero");
        System.out.println("2. Ingresar numero a buscar");
        System.out.println("3. Mostrar numero de digitos");
        System.out.println("4. Menu principal");
        opcion = leer.nextInt(); //crea y almacena una variable de tipo entero para la opcion
        
        switch(opcion){
            case 1: System.out.println("Ingresar un numero...");
            
                    numero_contar= leer.next();//asignara el numero a una variable para analizarla
                    numero_separado=numero_contar.toCharArray();//almacenara por caracteres en un arreglo
                    System.out.println("Numero Ingresado: "+numero_contar);
                    
                    System.err.println("•••Regresando...");
                    menu.metodo_contador();
                    break;
                
            case 2: System.out.println("Ingresar numero a buscar...");
                    buscador=leer.next();//asigara el numero ingresado a la variable para luego pasar a arreglo
                    numero_buscador=buscador.toCharArray();//guardara en el arreglo el numero a buscar
                    System.err.println("•••Regresando...");
                    menu.metodo_contador();
                    break;
                    
            case 3: 
            contador=0;
            
                    for(int j=0;j<numero_separado.length;j++){//recorrera el arreglo hasta su longitud
                       for(int k=0;k<numero_buscador.length;k++)     {
                        if(numero_separado[j]==numero_buscador[k])//comparara los dos arreglos dados
                            
                            contador++;//incrementara el valor del contador

                        
                        
                   }
                    }
            
                    System.out.println("Buscando digitos con: "+buscador+" en "+numero_contar);
                    System.out.println("Numero de digitos "+contador);
                    System.err.println("••• Regresando...");
                    metodo_contador();
                    break;
                    
            case 4: System.err.println("••• Regresando...");
                    menu.main(null);
                    
            default: //vuelve a cargar el menu si no se es seleccionada ninguna opcion valida
                    metodo_contador();
                    System.err.println("Ingrese opcion valida");
        }
        
    }

    static void metodo_organizar() {
        //usare arreglos...
        
        
        System.out.println("-PROGRAMA TRES NUMEROS DE MAYOR A MENOR");
        System.out.println("1. Ingresar numeros");
        System.out.println("2. Mostrar Ordenados");
        System.out.println("3. Menu principal");
        
        opcion = leer.nextInt(); //crea y almacena una variable de tipo entero para la opcion
        switch(opcion){
            case 1:
                    for(int i=0;i<numeros.length;i++){
                    System.out.println("Ingrese numero #"+(i+1)+": "); //usare un for para ingresar los numeros
                    numeros[i]=leer.nextInt();
                    
                    }
                    System.out.print("Numeros Ingresados: ");
                    for(int j=0;i<numeros.length;i++){//for para imprimir los numeros ingresados desordenados
                    
                        System.out.print("|"+numeros[i]+"| ");
                    }
                    
                    System.out.println("••• Regresando...");
                    metodo_organizar();
                    break;
                    
            case 2: System.out.println("Mostrando Numeros de mayor a menor");
                    Arrays.sort(numeros);//ordenara los numeros de menor a mayor
                    for(int i = numeros.length-1;i>=0;i--){ //imprimira los numeros anteriror mente ordenados de mayor a menor
                        System.out.println(""+numeros[i]);
                    }
                    System.out.println("••• Regresando...");
                    metodo_organizar();
                    break;
                    
            case 3: System.out.println("••• Regresando...");
                    menu.main(null);
                    break;
        }
        
    }

    static void metodo_promedio() {
        //se necesitara matriz de 6x6 // usando la logica de los usuarios... aplicandola a una matriz de 6x6
        
                    System.out.println("•Ingrese id de estudiante #1"); //usare un for para ingresar los numeros
                    id[0][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[0][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[0][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[0][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[0][4]=leer.nextInt();
                    
                    id[0][5]=((id[0][1]+id[0][2]+id[0][3]+id[0][4]))/4; //promedio
                    
                    System.out.println("");
                    
                    System.out.println("•Ingrese id de estudiante #2"); //usare un for para ingresar los numeros
                    id[1][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[1][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[1][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[1][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[1][4]=leer.nextInt();
                    
                    id[1][5]=((id[1][1]+id[1][2]+id[1][3]+id[1][4]))/4; //promedio
                    
                    System.out.println("");
                    
                    System.out.println("•Ingrese id de estudiante #3"); //usare un for para ingresar los numeros
                    id[2][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[2][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[2][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[2][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[2][4]=leer.nextInt();
                    
                    id[2][5]=((id[2][1]+id[2][2]+id[2][3]+id[2][4]))/4; //promedio
                    
                    System.out.println("");
                    
                    System.out.println("•Ingrese id de estudiante #4"); //usare un for para ingresar los numeros
                    id[3][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[3][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[3][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[3][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[3][4]=leer.nextInt();
                    
                    id[3][5]=((id[3][1]+id[3][2]+id[3][3]+id[3][4]))/4; //promedio
                    
                    System.out.println("");
                    
                    System.out.println("•Ingrese id de estudiante #5"); //usare un for para ingresar los numeros
                    id[4][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[4][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[4][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[4][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[4][4]=leer.nextInt();
                    
                    id[4][5]=((id[4][1]+id[4][2]+id[4][3]+id[4][4]))/4; //promedio
                    
                    System.out.println("");
                    
                    System.out.println("•Ingrese id de estudiante #6"); //usare un for para ingresar los numeros
                    id[5][0]=leer.nextInt();
                    System.out.println("Ingrese Nota #1");
                    id[5][1]=leer.nextInt();
                    System.out.println("Ingrese Nota #2");
                    id[5][2]=leer.nextInt();
                    System.out.println("Ingrese Nota #3");
                    id[5][3]=leer.nextInt();
                    System.out.println("Ingrese Nota #4");
                    id[5][4]=leer.nextInt();
                    
                    id[5][5]=((id[5][1]+id[5][2]+id[5][3]+id[5][4]))/4; //promedio
                    
                    
                    System.out.println("Mostrando tabla de resultados");
                    System.out.println("|      ID  | N1 | N2 | N3 | N4 | PROMEDIO |"); //la tabla se imprimira de forma primitiva... 
                    
                    System.out.println("►"+id[0][0]+" | "+id[0][1]+" | "+id[0][2]+" | "+id[0][3]+" | "+id[0][4]+" | "+id[0][5]+"◄");
                    System.out.println("►"+id[1][0]+" | "+id[1][1]+" | "+id[1][2]+" | "+id[1][3]+" | "+id[1][4]+" | "+id[1][5]+"◄");
                    System.out.println("►"+id[2][0]+" | "+id[2][1]+" | "+id[2][2]+" | "+id[2][3]+" | "+id[2][4]+" | "+id[2][5]+"◄");
                    System.out.println("►"+id[3][0]+" | "+id[3][1]+" | "+id[3][2]+" | "+id[3][3]+" | "+id[3][4]+" | "+id[3][5]+"◄");
                    System.out.println("►"+id[4][0]+" | "+id[4][1]+" | "+id[4][2]+" | "+id[4][3]+" | "+id[4][4]+" | "+id[4][5]+"◄");
                    System.out.println("►"+id[5][0]+" | "+id[5][1]+" | "+id[5][2]+" | "+id[5][3]+" | "+id[5][4]+" | "+id[5][5]+"◄");

                    
    }

    
    
}
