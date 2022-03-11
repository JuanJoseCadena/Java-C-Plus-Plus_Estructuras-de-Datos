import java.util.ArrayList;

public class Lista {

	public static void Lista() 
	{
		ArrayList<String> lista = new ArrayList<>();
		int x = 1;
		
		for(int i=0; i<10; i++) 
		{
			lista.add(Integer.toString(x));
			x=x+2;
		}
		
		System.out.println(lista);
		System.out.println("\n" + "Tamaño: " + lista.size());
		
	}
}
