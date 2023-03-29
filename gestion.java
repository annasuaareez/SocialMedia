import java.util.Scanner;

public class gestion {

	public static void main(String[] args) {
		
		int opcion;
		Scanner lecScanner = new Scanner(System.in);

		do {
			System.out.println("1. Crear");
			System.out.println("2. Leer");
			System.out.println("3. Actualizar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("introduce una opcion:");
			opcion = lecScanner.nextInt();
			lecScanner.nextLine();
			switch (opcion) {
			case 1: 
				System.out.println("Crear");
				System.out.println("");
				System.out.println("Usuario");
				System.out.println("Publicacion");
				System.out.println("Usuario-Publicacion");
				break;
			case 2: 
				System.out.println("Leer");
				System.out.println("");
				System.out.println("Usuario");
				System.out.println("Publicacion");
				System.out.println("Usuario-Publicacion");
				break;
			case 3: 
				System.out.println("Actualizar");
				System.out.println("");
				System.out.println("Usuario");
				System.out.println("Publicacion");
				System.out.println("Usuario-Publicacion");
				break;
			case 4: 
				System.out.println("Borrar");
				System.out.println("");
				System.out.println("Usuario");
				System.out.println("Publicacion");
				System.out.println("Usuario-Publicacion");
				break;
			case 5: 
				System.out.println("Salir");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 5);

		lecScanner.close();
	}

}
