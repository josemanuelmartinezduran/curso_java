/**
 * @Nombre: ConceptosBasicosJava.java
 * @Descripción: Muestra los conceptos fundamentales del lenguaje Java.
 * Incluye variables, operadores, estructuras de decisión,
 * ciclos y métodos (funciones).
 * @Autor: Gemini (asistente de IA)
 * @Fecha: Noviembre 2025
 */

// La estructura básica de todo programa en Java es una 'clase'.
public class Fundamentos {

    // El método 'main' es el punto de entrada de la aplicación.
    public static void main(String[] args) {
        // -------------------------------------------------------------------
        // 1. VARIABLES 📚
        // -------------------------------------------------------------------
        System.out.println("=== 1. VARIABLES ===");
        
        // Declaración e inicialización de variables de tipos primitivos
        int numeroEntero = 10;
        double numeroDecimal = 5.5;
        boolean esVerdadero = true;
        char letra = 'A';
        
        // Un tipo de dato no primitivo (objeto)
        String texto = "Hola Mundo en Java";
        
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Carácter: " + letra);
        System.out.println("String: " + texto);

        // -------------------------------------------------------------------
        // 2. OPERADORES ➕➖
        // -------------------------------------------------------------------
        System.out.println("\n=== 2. OPERADORES ===");
        
        // Operadores Aritméticos
        int a = 20; //Operador de asignación no confundir con igual matemático
        int b = 7;
	//String a = "Hola mundo";
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) a / b; // Se realiza un 'cast' para obtener decimales
        int modulo = a % b; // Resto de la división
        
        System.out.println("Suma (a + b): " + suma);
        System.out.println("División (a / b): " + division);
        
        // Operadores de Asignación y Unarios
        int contador = 1;
        contador += 5; // Equivalente a contador = contador + 5;
        contador++;    // Equivalente a contador = contador + 1;
        
        System.out.println("Contador después de operaciones: " + contador);
        
        // Operadores de Comparación (devuelven un 'boolean')
        boolean esMayor = a > b; // 20 > 7
        boolean esIgual = (a == 10); // 20 == 10

        System.out.println("¿a es mayor que b? " + esMayor);
        System.out.println("¿a es igual a 10? " + esIgual);
        
        // Operadores Lógicos (combinan booleanos)
        boolean resultadoLogico = esMayor && !esIgual; // true Y (NO false) -> true Y true
        System.out.println("Resultado Lógico (AND y NOT): " + resultadoLogico);
        
        // -------------------------------------------------------------------
        // 3. ESTRUCTURAS DE DECISIÓN (IF/ELSE) 🚦
        // -------------------------------------------------------------------
        System.out.println("\n=== 3. ESTRUCTURAS DE DECISIÓN ===");
        
        int edad = 18;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else if (edad >= 15) {
            System.out.println("Eres adolescente.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        // Estructura de decisión 'switch' (útil para múltiples valores fijos)
        int dia = 3;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia = "Lunes"; break;
            case 2: nombreDia = "Martes"; break;
            case 3: nombreDia = "Miércoles"; break;
            default: nombreDia = "Otro día"; break;
        }
        System.out.println("Día seleccionado: " + nombreDia);

        // -------------------------------------------------------------------
        // 4. CICLOS (LOOPS) 🔄
        // -------------------------------------------------------------------
        System.out.println("\n=== 4. CICLOS ===");
        
        // Ciclo 'for': se usa cuando se conoce el número de iteraciones.
        System.out.print("Conteo con for: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // Ciclo 'while': se usa cuando no se conoce el número de iteraciones.
        int j = 0;
        System.out.print("Conteo con while: ");
        while (j < 3) {
            System.out.print(j + " ");
            j++; // Es vital actualizar la condición para evitar un bucle infinito
        }
        System.out.println();
        
        // -------------------------------------------------------------------
        // 5. LLAMADA A FUNCIONES (MÉTODOS) ⚙️
        // -------------------------------------------------------------------
        System.out.println("\n=== 5. LLAMADA A FUNCIONES ===");
        
        // Llamada a un método que no devuelve valor (void)
        saludar("Usuario");
        
        // Llamada a un método que devuelve un valor (return)
        int resultadoSuma = sumar(15, 7);
        System.out.println("El resultado de sumar 15 y 7 es: " + resultadoSuma);
        
    } // Fin del método main

    // -------------------------------------------------------------------
    // 6. DEFINICIÓN DE FUNCIONES (MÉTODOS) 🛠️
    // -------------------------------------------------------------------
    
    /**
     * @Descripción: Método que imprime un saludo personalizado. 
     * Es un método 'void' (no devuelve valor).
     * @Parámetro: nombre - El nombre de la persona a saludar (String).
     */
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
    }
    
    /**
     * @Descripción: Método que calcula la suma de dos números enteros.
     * Devuelve un valor de tipo 'int'.
     * @Parámetros: num1, num2 - Los números a sumar (int).
     * @Retorno: La suma de num1 y num2 (int).
     */
    public static int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

} // Fin de la clase ConceptosBasicosJava
