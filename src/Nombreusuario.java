import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class Nombreusuario {
    public static void main(String[] args) {
        String sc="Anlox Caicoya Tirado";
        String[] par = sc.split(" ");
        String nomform="";
        for (int i = 0; i < par.length; i++) {
            nomform+=par[i].substring(0,1).toUpperCase();
            nomform+=par[i].substring(1)+par[i].substring(0,1).toLowerCase() + " ";

        }
        System.out.println(nomform);
    }
}
