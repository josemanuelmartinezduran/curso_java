public class Ejemplos {
	public static void main(String[] args) {
		/*
		 * int numeroEntero = 2147483647;
		 * numeroEntero = numeroEntero + 1;
		 * numeroEntero = numeroEntero - 1;
		 * System.out.println(numeroEntero);
		 */
		/*
		 * System.out.println("[+] Iniciando el programa");
		 * int suma = 8 + 10;
		 * int resta = 15 - 1;
		 * int mult = 3 * 2;
		 * double div = 5 / 2;
		 * System.out.println(div);
		 * System.out.println("[+] Terminando el programa");
		 */
		boolean a = true;
		// System.out.println(a);
		// a = false;
		// System.out.println(a);

		String t1 = "Hola";
		String t2 = "Hola";
		a = t1 != t2;
		// System.out.println("[+] El valor de a despuesd e 3 > 2 es "+ a);
		// System.out.println("[+] El valor de a después de 3 >= 3 es "+ a);
		// System.out.println("[+] El valor de a después de 3 == 3 es "+ a);
		System.out.println("[+] El valor de a después de 'Hola' == 'Hola' es " + a);
		/// Pausa voy a regresar aqui
		a = false || false; // Operador or
		a = 3 < 2 || 3 == 3;
		a = true && false; // Operador and
		a = !a;
		a = true;
		if (a)
			System.out.println("[*] Primer if ejecutado");
		else if (a)
			System.out.println("[+] else if");
		else
			System.out.println("[*] Segundo if ejecutado");

		int i = 0;// Inicialización de variable
		while (a) {
			// Código a ejecutar
			System.out.println("Ciclo" + i);
			// Incremento (se ejecuta al final del cada ciclo)
			i++; // i = i + 1 i += 1 i++
			// Cadena if para detener el ciclo
			if (i >= 10)
				a = false;
		}
		// 1 se ejecuta antes del inicio del cliclo
		// 2 booleano que detiene al ciclo
		// 3 se ejecuta en cada ciclo
		i = 0;
		for (i = 0; i<10; i++)
			System.out.println("Ciclo for " + i);
		//Ejericio hacer un programa que escriba en la terminal 
		//los primeros 100 números pares 
	}
}
