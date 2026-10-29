public class Inicio {
    public static void main(String[] args) {
        String sc = "Esto es un String";
        System.out.println(sc.length());
        System.out.println(sc.charAt(sc.length()-1));
        sc="a";
        System.out.println("esta vacia?"+sc.isEmpty());
        System.out.println(sc.isBlank());
        if (sc.equalsIgnoreCase("a")) {
            System.out.println("Si");
        }else  {
            System.out.println("No");

        }
        sc="hola";
        System.out.println(sc.indexOf("a"));
        System.out.println(sc.lastIndexOf("hola"));
    }
}
