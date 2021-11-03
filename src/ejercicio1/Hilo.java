package ejercicio1;

public class Hilo implements Runnable
{
	
	public static boolean terminado= false;
	public static int progreso=0;
	public String nombreHilo;
	
	public Hilo (String nombre)
	{
		this.nombreHilo=nombre;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		terminado=false;
		
		for (int i=1; i<=10; i++)
		{
			System.out.println("Hilo Java. Procesando..." +i);
			progreso=i;
			try { Thread.sleep(80);	
			} catch (InterruptedException e)
			{
				System.out.println("Hilo Java. Interrumpido..." +i);
			}
			
		}
			
		terminado=true;
	}
     
}
