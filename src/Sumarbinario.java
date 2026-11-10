public class Sumarbinario {
    public static void main(String[] args) {
        String n1= "1011";
        String n2= "1010";
        int b1,b2,ac=0, sum;
        System.out.println(sumarBinario(n1,n2));
        String res="";
        for (int i = n1.length()-1; i >=0 ; i++) {
            b1=Character.getNumericValue(n1.charAt(i));
            b2=Integer.parseInt(" " + n1.charAt(i));
            sum=b1+b2+ac;
            if (sum==0){
                res="0"+res;
                ac=0;
            } else if (sum==1) {
                res = "1" + res;
                ac = 0;
            } else if (sum==2) {
                res = "0" + res;
                ac = 1;
            } else  {
                res="1"+res;
                ac = 1;
            }
        }
        if (ac==1){
            res="1"+res;
        }
        System.out.println(res);
        }
        public static String sumarBinario (String n1,String n2) {
        int b1, b2, ac = 0, sum;
        String res="";
        for (int i = n1.length() - 1; i >= 0; i++) {
            b1 = Character.getNumericValue(n1.charAt(i));
            b2 = Integer.parseInt(" " + n1.charAt(i));
            sum = b1 + b2 + ac;
            if (sum == 0) {
                res = "0" + res;
                ac = 0;
            } else if (sum == 1) {
                res = "1" + res;
                ac = 0;
            } else if (sum == 2) {
                res = "0" + res;
                ac = 1;
            } else {
                res = "1" + res;
                ac = 1;
            }
        }
        if (ac == 1) {
            res = "1" + res;
        }
        return res;
    }
}
