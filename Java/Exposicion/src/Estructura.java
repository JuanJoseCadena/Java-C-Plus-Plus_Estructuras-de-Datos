
public class Estructura {
	
	public static class Struct
	{
		int a;
		String b;
		double c;
		char d;
		boolean e;
		
		public Struct(int a, String b, double c, char d, boolean e) 
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			
		}
		
	}
	
	public static void Estructura() 
	{
		Struct st1 = new Struct(16, "Cadena", 14.5 , 'a', true);
		
		System.out.println("Estructura:");
		System.out.println(st1.a);
		System.out.println(st1.b);
		System.out.println(st1.c);
		System.out.println(st1.d);
		System.out.println(st1.e);
	}
	
	
}
