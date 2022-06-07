package controlando_flujo_con_loops;

public class EjemploCiclos {

	public static void main(String[] args) {
		int contador = 0;
		
		while(contador <= 10) { // mientras que (condicion)
			//Ejecuta esto
			System.out.println(contador);
			// contador = contador + 1;
			// contador += 3;
			contador++;
		}
	}
}