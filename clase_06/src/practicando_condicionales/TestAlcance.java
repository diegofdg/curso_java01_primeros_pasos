package practicando_condicionales;

public class TestAlcance {

	public static void main(String[] args) {
		System.out.println ("pruebas condicionales");

        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompa�ado;

        if (cantidadPersonas >= 2) {
            acompa�ado = true;
        } else {
            acompa�ado = false;
        }

        if (edad >= 18 || acompa�ado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
	}
}