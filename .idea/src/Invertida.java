import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        String frase = leerFrase();
        String[] palabras = separarPalabras(frase);
        System.out.println(invertir(palabras));
    }

    // Pide la frase por teclado
    public static String leerFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        return sc.nextLine();
    }

    // Separa la frase en palabras (ignora espacios de más)
    public static String[] separarPalabras(String frase) {
        return frase.trim().split("\\s+");
    }

    // Devuelve las palabras en orden inverso, separadas por un espacio
    public static String invertir(String[] palabras) {
        String resultado = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado += palabras[i];
            if (i > 0) {
                resultado += " ";
            }
        }
        return resultado;
    }
}