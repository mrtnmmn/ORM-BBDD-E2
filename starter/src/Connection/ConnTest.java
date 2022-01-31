package Connection;

public class ConnTest {

	public static void main(String[] args) {
		Conn conexion = new Conn();
		
		if(conexion != null)
			System.out.println("Conexion ok");
		else
			System.out.println("Error al conectar");
	}
	
}
