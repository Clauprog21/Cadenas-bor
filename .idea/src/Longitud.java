import java.nio.file.SimpleFileVisitor;

public class Longitud {
    public static void main(String[] args) {
        String fr = "hola que tal";
        int k = 0;
        System.out.println(comprueba(fr, k));
    }
    public static int comprueba(String fr, int k) {
        String[] pal = fr.split(" \\s");
        int cuantas=0;
        for (int i = 0; i <pal.length ; i++) {
            if (pal[i].length()==k) {
                cuantas++;
            }
        }
        return cuantas;
    }
}