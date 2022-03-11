import java.util.Scanner;

public class Union {
	
	public static void Union()
	{
		int e = 0;
		int[] union = new int[1];
		int aux;
		int total = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(e!=1) 
		{
			System.out.println("Introduce 'C' para cerrar el programa");
			System.out.println("Introduce un valor:");
			
			String cadena = entrada.nextLine();
			
			if(cadena.trim().matches("")) 
			{
				System.out.println("No se ha introducido ningún valor, por favor vuelva a intentarlo introduciendo solo números enteros \n");
			}
			
			else if(cadena.equals("C")) 
			{
				e=1;
			}
			
			else if(!cadena.matches("-?[0-9].*")) 
			{
				System.out.println("Se ha introducido un valor no válido, por favor vuelva a intentarlo introduciendo solo números enteros \n");
			}
			
			else 
			{
				try 
				{
					aux = Integer.parseInt(cadena);
					union[0] = union[0] + aux;
					total++;
					
					System.out.println("Valor Actual:");
					System.out.println(union[0]);
					System.out.println("\n" + "Número de valores introducidos: " + total + "\n");
				}
				catch(Exception f)
				{
					System.out.println("Se ha introducido un valor no válido, por favor vuelva a intentarlo introduciendo solo números enteros \n");
				}
				
			}
		}
	}

}
