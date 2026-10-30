public class LongitudIII {
    public static void main(String[] args) {
        String fs="Longitud de nilo";
        int k= 6;
        boolean hayalgmlar=false;
        String[] pal=fs.split(" \\s+");
        for (int i = 0; i < pal.length; i++) {
            if (pal[i].length()>=k){
                hayalgmlar=true;
            }

        }
        if (hayalgmlar){
            System.out.println("Hay alguna mas larga");
        }else {
            System.out.println(" No hay alguna mas larga");
        }
    }
    public static boolean comprueba(String fr, int k) {
        String[] pal = fr.split(" \\s+ ");
        boolean hayalgmlar = false;
        for (int i = 0; i < pal.length; i++) {
            if (pal[i].length() == k) {
                hayalgmlar = true;
            }
        }
        return false;
    }
}
