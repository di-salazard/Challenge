package challende;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class opciones 
{
    public static void main(String[] args) throws IOException
    {    
        Scanner scan = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        generador generar = new generador();
        FileWriter archivo1 = new FileWriter("C:/Users/Public/Documents/archivoD.txt");
        FileWriter archivo2 = new FileWriter("C:/Users/Public/Documents/archivoO.txt");
        
        while(!salir)
        {
            try
            {
                System.out.println("""
                                   seleccione una opcion:
                                   -----------------------
                                   0 Menu
                                   1 Generar nuevo archivo
                                   2 Leer archivo generado
                                   3 Ordena Archivo
                                   4 Leer archivo ordenado
                                   5 Buscar numero en archivo
                                   6 Salir
                                    
                                   Seleccione una opcion""");
                opcion = scan.nextInt();
                System.out.println("");
                
                switch(opcion)
                {
                    case 0 -> System.out.println("");
                    case 1 -> 
                    {
                        generar.generarNumero();
                        System.out.println("\n");
                        int largo = generar.numeros.size();
                        for (int i=0;i<largo;i++) {
                            String str = generar.numeros.get(i).toString();
                            archivo1.write(str);
                            if(i < largo-1)
                            {
                                archivo1.write("\n");
                            }
                        }
                        archivo1.close();
                    }
                    case 2 -> 
                    {
                        generar.mostrarNumeros();
                        System.out.println("\n");
                    }
                    case 3 -> 
                    {
                        generar.ordenador();
                        System.out.println("\n");
                        int largo = generar.registro.size();
                        for (int i=0;i<largo;i++) 
                        {
                            String str = generar.registro.get(i).toString();
                            archivo2.write(str);
                            if(i < largo-1)
                            {
                                archivo2.write("\n");
                            }
                        }
                        archivo2.close();
                    }
                    case 4 -> 
                    {
                        generar.mostrarNumerosO();
                        System.out.println("\n");
                    }
                    case 5 -> 
                    {
                        generar.buscarNumeros();
                        System.out.println("\n");
                    }
                    case 6 -> 
                    {
                        System.out.println("Saliendo del menu");
                        salir = true;
                    }
                    default -> 
                        System.out.println("\nLa opcion debe ser entre 1 y 6\n");

                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("\nDebe ser un numero\n");
                scan.next();
            }
        }
    }    
}
