import java.util.Locale;
public class Siglas {
    public static void main(String[] args) {
        String fs ="Republica democratica del congo";
        System.out.println(Siglas(fs));
    }
    public static String Siglas(String fs) {
        String[] pal = sPal(fs);
        String sig = "";
        for (int i = 0; i < pal.length; i++) {
            sig += inicial(pal[i]);
        }
        return sig;
    }
    public static String[] sPal(String fs) {
        return fs.trim().split("\\s+");
    }
    public static String inicial(String pal) {
        return pal.substring(0, 1).toUpperCase();
    }
}


