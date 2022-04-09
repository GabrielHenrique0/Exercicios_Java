public class Exercicio6 {
    public static void main(String[] args) {

        int a = 0, b = 1, c, d = 0;
        System.out.print("0");
        for (d = 0; d <= 100; d++) {
            c = a + b;
            a = b;
            b = c;
            d = a;
            
            System.out.print(", " + d);
            
        }
    }
}
