public class Parentesis {
    public static void main(String[] args) {
        String fs = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String[] cd=fs.split("\\s+");
        int cont = 0;
        boolean tb = false;
        for (int i = 0; i < fs.length(); i++) {
            if (fs.charAt(i) == '(') {
                cont++;
            }
            if (fs.charAt(i) == ')') {
                cont--;
            }
            if (cont == 0) {
                tb = true;
            }
        }
        if (tb) {
            System.out.println(fs.toUpperCase());
        } else {
            System.out.println(fs.toUpperCase());
        }
    }
    public static boolean esParentizada(String fs, int cont) {
        String[] cd=fs.split("\\s+");
        for (int i = 0; i < fs.length(); i++) {
            if (fs.charAt(i) == '(') {
                cont++;
            }
            if (fs.charAt(i) == ')') {
                cont--;
            }
            if (cont == 0) {
                return true;
            }

        }
        return false;

    }
}
