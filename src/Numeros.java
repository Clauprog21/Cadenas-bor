public class Numeros {
    public static void main(String[] args) {
        String pal = "140";
        int con = 0;
        boolean esnum = true;
        for (int j = 0; j < pal.length(); j++) {
            if (!Character.isDigit(pal.charAt(j))) {
                esnum = false;
                break;
            }
            if (esnum) {
                con++;
            }
        }
        System.out.println(con);
    }
    //PELÍCULA MAXIMA.
    public static boolean ContarNumeros(int con,String pal) {
        String[] num = pal.split(" \\s+");
        int cot = 0;
        boolean esnum = true;
        for (int i = 0; i < num.length; i++) {
            if (!Character.isDigit(num[i].charAt(0))) {
                esnum = false;
                break;
            }
        }
        if (esnum) {
            con++;
        }
        return con == cot;
    }
}