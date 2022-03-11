import java.util.Scanner;

public class Cola {
	
	public static void Cola() 
	{
		int e = 0;
		int i = 0;
		String[] cola = new String[10];
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
				cola[i]=entrada.nextLine();
				System.out.println("Valor Introducido \n");
				i++;
				
			}
			else if(aux.equals("I")) 
			{
				System.out.println("Cola:");
				for(int a=0; a<i; a++) 
				{
					System.out.println(cola[a]);
				}
				System.out.println("");
			}
			else if(aux.equals("Q") && i>0) 
			{
				cola[0]=null;
				for(int x=0;x<i-1;x++) 
				{
					cola[x]=cola[x+1];
				}
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
