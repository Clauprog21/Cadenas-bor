public class Digitos {
    public static void main(String[] args) {
        String fs="234 qd 656";
        int dig=0;
        for (int i = 0; i < fs.length()-1; i++) {
            if (Character.isDigit(fs.charAt(i))) {
                dig++;

            }

        }
        System.out.println("hay dig: " + dig);
    }
    public static int  cuantosSonDigitos(  String fs,int dig) {
        for (int i = 0; i < fs.length(); i++) {
            if (Character.isDigit(fs.charAt(i))) {
                dig++;
            }
        }
        return dig;
    }
}
