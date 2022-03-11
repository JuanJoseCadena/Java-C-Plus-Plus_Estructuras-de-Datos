import java.util.Scanner;

public class Pila {
	
	public static void Pila() 
	{
		int e = 0;
		int i = 0;
		String[] pila = new String[10];
		Scanner entrada = new Scanner(System.in);
		
		while(e!=1) 
		{
			System.out.println("¿Que acción quieres ejecutar?");
			
			if(i<10)
			{
				System.out.println("A = Añadir");
			}
			
			System.out.println("I = Imprimir");
			
			if(i>0) 
			{
				System.out.println("Q = Quitar");
			}
			
			System.out.println("C = Cerrar");
			
			String aux = entrada.nextLine();
			
			if(aux.equals("A") && i<10) 
			{
				System.out.println("Introduce el valor");
				pila[i]=entrada.nextLine();
				System.out.println("Valor Introducido \n");
				i++;
				
			}
			else if(aux.equals("I")) 
			{
				System.out.println("Pila:");
				for(int a=0; a<i; a++) 
				{
					System.out.println(pila[a]);
				}
				System.out.println("");
			}
			else if(aux.equals("Q") && i>0) 
			{
				int x = i;
				if(x>9) 
				{
					x--;
				}
				pila[x]=null;
				System.out.println("Valor Borrado \n");
				i--;
			}
			else if(aux.equals("C")) 
			{
				e=1;
			}
			else 
			{
				System.out.println("Valor no válido \n");
			}
		}
	}

}
