package practicando_condicionales;

public class TestCondicional {

	public static void main(String[] args) {
		System.out.println("probando condicionales");
		int edad = 20;
		int cantidadPersonas = 3;
		
		if (edad >= 18) {
            System.out.println("Tienes m�s de 18 a�os");
            System.out.println("Bienvenido ");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("No tienes 18 a�os, pero puedes ingresar, porque est�s acompa�ado");
            } else {
                System.out.println("Lamentablemente no puedes ingresar");
            }
        }
	}
}