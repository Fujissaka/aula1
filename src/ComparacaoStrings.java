public class ComparacaoStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");//ineficiente pq fura o interning

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
