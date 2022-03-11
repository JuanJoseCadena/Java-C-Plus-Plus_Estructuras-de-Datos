import java.math.BigInteger;
import java.util.Scanner;

public class Ejemplo {
	
	public static class Estudiante
	{
		BigInteger id;
		String nombre;
		int edad;
		int semestre;
		String correo;
		BigInteger celular;
		boolean pago;
		
		public Estudiante(BigInteger id, String nombre, int edad, int semestre, String correo, BigInteger celular, boolean pago) 
		{
			this.id = id;
			this.nombre = nombre;
			this.edad = edad;
			this.semestre = semestre;
			this.correo = correo;
			this.celular = celular;
			this.pago = pago;
		}
		
	}
	
	public static void Ejemplo() 
	{
		System.out.println("Estudiantes Actuales:");
		
		BigInteger[] id = new BigInteger[10];
		
		id[0] = new BigInteger("1054897532");
		id[1] = new BigInteger("1489576582");
		id[2] = new BigInteger("4736905473");
		id[3] = new BigInteger("2048796354");
		id[4] = new BigInteger("3839531780");
		
		String[] nombre = new String[10];
		
		nombre[0] = "Raúl Perez";
		nombre[1] = "Luis Martínez";
		nombre[2] = "Alberto Moreno";
		nombre[3] = "Julián Parra";
		nombre[4] = "Andrés Hernández";
		
		int[] edad = new int[10];
		
		edad[0] = 17;
		edad[1] = 22;
		edad[2] = 20;
		edad[3] = 19;
		edad[4] = 25;
		
		int[] semestre = new int[10];
		
		semestre[0] = 1;
		semestre[1] = 4;
		semestre[2] = 3;
		semestre[3] = 2;
		semestre[4] = 9;
		
		String[] correo = new String[10];
		
		correo[0] = "raulperez@gmail.com";
		correo[1] = "lmartineza@gmail.com";
		correo[2] = "albmor322@gmail.com";
		correo[3] = "julian19@gmail.com";
		correo[4] = "hernandezandres12@gmail.com";
		
		BigInteger[] celular = new BigInteger[10];
		
		celular[0] = new BigInteger("3005497842");
		celular[1] = new BigInteger("3054894125");
		celular[2] = new BigInteger("3104121522");
		celular[3] = new BigInteger("3019897846");
		celular[4] = new BigInteger("3102225697");
		
		boolean[] pago = new boolean[10];
		
		pago[0] = true;
		pago[1] = true;
		pago[2] = false;
		pago[3] = true;
		pago[4] = false;
		
		Estudiante[] est = new Estudiante[10];
		
		for(int i=0; i<5; i++) 
		{
			est[i] = new Estudiante(id[i], nombre[i], edad[i], semestre[i], correo[i], celular[i], pago[i]);
			System.out.println("Cedula: " + est[i].id);
			System.out.println("Nombre: " + est[i].nombre);
			System.out.println("Edad: " + est[i].edad);
			System.out.println("Semestre: " + est[i].semestre);
			System.out.println("Correo: " + est[i].correo);
			System.out.println("Celular: " + est[i].celular);
			System.out.println("¿Ya pagó?: " + est[i].pago + "\n");
		}
		
		int i = 5;
		int z = 0;

		
		while(z!=1) 
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("¿Qué acción quieres ejecutar?");
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
			
			String aux = in.nextLine();
			
			if(aux.equals("A") && i<10) 
			{
				try {
					System.out.println("Introduce el valor correspondiente:");
					String a, b, c, d, e, f, g;
					System.out.println("Cedula:");
					a = in.nextLine();
					if(a.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(!a.matches("[0-9].*"))
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}					
					BigInteger a1 = new BigInteger(a);
					System.out.println("Nombre:");
					b = in.nextLine();
					if(b.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(b.matches(".*[^a-z A-Z].*")) 
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
					System.out.println("Edad:");
					c = in.nextLine();
					if(c.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(!c.matches("[0-9].*") || Integer.parseInt(c)<0)
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
					System.out.println("Semestre:");
					d = in.nextLine();
					if(d.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(!d.matches("[0-9].*") || Integer.parseInt(d)>10)
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
					System.out.println("Correo:");
					e = in.nextLine();
					if(e.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(!e.matches(".*@.*")) 
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
					System.out.println("Celular:");
					f = in.nextLine();
					if(f.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					else if(!f.matches("[0-9].*"))
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
					BigInteger f1 = new BigInteger(f);
					System.out.println("¿Ya realizó el pago?");
					System.out.println("Introduzca '1' para Sí");
					System.out.println("Introduzca '0' para No");
					g = in.nextLine();
					if(g.trim().matches("")) 
					{
						System.out.println("No se introdujo ningún valor \n");
						System.exit(0);
					}
					boolean g1=false;
					if(Integer.parseInt(g)==0) 
					{
						g1=false;
					}
					else if(Integer.parseInt(g)==1) 
					{
						g1=true;
					}
					else 
					{
						System.out.println("Valor no válido \n");
						System.exit(0);
					}
				
					est[i]= new Estudiante(a1, b, Integer.parseInt(c), Integer.parseInt(d), e, f1, g1);
					System.out.println("Estudiante Introducido \n");
					i++;
				}
				catch(Exception m) 
				{
					System.out.println("Valor no válido \n");
					System.exit(0);
				}
				
			}
			else if(aux.equals("I")) 
			{
				System.out.println("Estudiantes:");
				for(int a=0; a<i; a++) 
				{
					System.out.println("Cedula: " + est[a].id);
					System.out.println("Nombre: " + est[a].nombre);
					System.out.println("Edad: " + est[a].edad);
					System.out.println("Semestre: " + est[a].semestre);
					System.out.println("Correo: " + est[a].correo);
					System.out.println("Celular: " + est[a].celular);
					System.out.println("¿Ya pagó?: " + est[a].pago + "\n");
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
				est[x]=null;
				System.out.println("Valor Borrado \n");
				i--;
			}
			else if(aux.equals("C")) 
			{
				z=1;
			}
			else 
			{
				System.out.println("Valor no válido \n");
			}
		}
	}

}
