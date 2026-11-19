public class LongitudII {
    public static void main(String[] args) {
        String fs = "Tengo una buena migraña";
        int k = 6;
        String[] pal = fs.split(" \\s+");
        boolean expal = false;
        for (int i = 0; i < pal.length; i++) {
            if (pal[i].length() > k) {
                expal = true;
            }
        }
        if (expal) {
            System.out.println("expal con" + k + " carac");
        } else {
            System.out.println(" noexpal con" + k + " carac");
        }
    }
    public static boolean comprueba(String fr, int k) {
        String[] pal = fr.split("\\s+");
        boolean expal = false;
        for (int i = 0; i < pal.length; i++) {
            if (pal[i].length() == k) {
                return true;
            }
        }
        return false;
    }
}