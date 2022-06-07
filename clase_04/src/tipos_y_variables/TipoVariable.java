package tipos_y_variables;

public class TipoVariable {

	public static void main(String[] args) {
		/* TIPO ENTERO */
		System.out.println("Tipo Entero");
		
		// edad = 28 No compila porque falta definir el valor de la variable
		int edad; // Declaracion de la variable
		edad = 28; // Inicializacion de la variable
		
		// System.out.println("edad"); No compila porque el parameteo no es la variable, es un String
		System.out.println(edad); // Variable como parametro
		
		edad = 47; // Sobreescribimos el valor de la variable
		System.out.println(edad);
		
		edad = 46 + 88; // Asignamos el valor del resultado de una operacion aritmetica
		System.out.println("Mi edad es: " + edad); // Concatenamos un String con la variable edad usando +
		System.out.println("");
		
		
		/* TIPO DOUBLE */
		System.out.println("Tipo Double");
		// int salario = 1250.56 No compila porque un valor decimal no cabe en una variable tipo int
		double salario = 1250.56;
		System.out.println(salario);
		
		double edad2 = 28; // Numeros enteros si pueden ser asignados a variables tipo double
		System.out.println(edad2);
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad); // Podemos usar variables directamente en operaciones matematicas
		
		int division = 1250 / 3; // Compila, a pesar de resultar en un valor decimal
		System.out.println(division); // Ignora por completo la parte decimal, NO redondea, solo toma la parte entera
		System.out.println("");
		
		
		/* CONVERSIONES */
		System.out.println("Conversiones");
		double variable1 = 230.89;
		System.out.println(variable1);
		
		int variable1Entero = (int) variable1; // Cast
		System.out.println(variable1Entero);
		
		// int prueba = 122222222222222222; No compila porque el numero esta fuera del rango aceptado por int
		long prueba = 122222222222222222L; // Se especifica con L para asiganr valor a una variable tipo long
		System.out.println(prueba);
		
		int resultado = (int) variable1 + variable1Entero; // Forzamos el resultado en int
		System.out.println(resultado);
	}
}