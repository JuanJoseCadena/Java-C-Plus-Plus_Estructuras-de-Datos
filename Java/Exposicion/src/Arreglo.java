
public class Arreglo {
	
	public static void Arreglo() 
	{
		int[] arreglo = new int[10];
		
		int x=2;
		
		for(int i=0; i<10; i++) 
		{
			arreglo[i] = x;
			x = x+2;
		}
		
		for (int i=0; i<10; i++) 
		{
			System.out.println(arreglo[i]);
		}
		
		System.out.println("\n" + "Tamaño: " + arreglo.length);
	}

}
