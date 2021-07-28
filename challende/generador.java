package challende;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class generador
{
        int numero;
        ArrayList numeros = new ArrayList();
        ArrayList registro = new ArrayList();
        int buscar;
        int valor;
        Scanner scan = new Scanner(System.in);
        
    public void generarNumero() 
    {    
        // Genera 5 numeros entre 1 y 50
        for (int i = 1; i <= 5; i++) 
        {
            numero = (int) (Math.random() * 50 + 1);
            if (numeros.contains(numero)) 
            {
                i--;
            }
            else 
            {
                numeros.add(numero);
                registro.add(numero);
            }    
        }
        
        System.out.println("Numeros Generados\n"); 
    }
    
    public void mostrarNumeros()
    {
        //Imprime los numeros que se encuentra en la ArrayList
        for (Object n : numeros) 
        {
            System.out.println(n + "");  
        }
    }
    public void ordenador()
    {
        //Ordena los numeros
        Collections.sort(registro);
        System.out.println("numeros Ordenados\n");  
    }
    public void mostrarNumerosO()
    {
        //Imprime los numeros ordenados que se encuentra en la ArrayList
        for (Object n : registro) 
        {
            System.out.println(n + "");  
        }
    }
    
    public void buscarNumeros()
    {
        //Realiza una busqueda en la Arraylist
        System.out.println("Ingrese que numero desea buscar");
        valor = scan.nextInt();
        if(registro.contains(valor))
        {
            System.out.println("El numero se encuentra el arraylist");
        }
        else
        {
            System.out.println("El numero no se encuentra arraylist");
        }
    }   
}
