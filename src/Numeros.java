public class Numeros {
    public static void main(String[] args) {
        String fs = "140";
        String cd = "140 5634 3452 2f34rf";
        String[] pal = cd.split("\\s+");
        boolean esnum = true;
        int cont=0;
        for (int i = 0; i < fs.length(); i++) {
            System.out.println(pal[i]);
            String palact=pal[i];
            for (int j = 0; j < palact.length(); j++) {
                if (!Character.isDigit(palact.charAt(j))) {
                    esnum = false;
                    break;
                }

            }
            if (esnum) {
                cont++;
            }
        }
        System.out.println(cont);
    }
    // película maxíma
    public static boolean contarNumeros(String cd, int cont){
        String[] pal = cd.split(" ");
        for (int i = 0; i < pal.length; i++){
            if (pal[i].equals(cont)){
                return true;

            }
        }
        return false;


    }

}