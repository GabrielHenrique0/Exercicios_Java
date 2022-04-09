public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("O fatorial de 0 é 1");
        for (int n = 1, fatorial = 1; n <= 10; n++) {
            int aux = n;
            fatorial = n;
            while(aux != 1){
                aux = aux - 1;
                fatorial = fatorial * aux;
                
            }
            System.out.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial);        
        }
    }
}
