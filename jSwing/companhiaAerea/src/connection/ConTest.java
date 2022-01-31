package connection;

public class ConTest {

    public static void main(String[] args) {
        Conn connection = new Conn();

        if(connection != null)
            System.out.println("Conexion ok");
        else
            System.out.println("Error al conectar");
    }
}