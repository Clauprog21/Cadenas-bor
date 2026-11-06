import java.util.Locale;
public class Siglas {
    public static void main(String[] args) {
        String fs ="Republica democratica del congo";
        System.out.println(obtenerSiglas(fs));
    }
    public static String obtenerSiglas(String frase) {
        String[] palabras = separarPalabras(frase);
        String siglas = "";
        for (int i = 0; i < palabras.length; i++) {
            siglas += inicial(palabras[i]);
        }
        return siglas;
    }
    public static String[] separarPalabras(String frase) {
        return frase.trim().split("\\s+");
    }
    public static String inicial(String palabra) {
        return palabra.substring(0, 1).toUpperCase();
    }
}


