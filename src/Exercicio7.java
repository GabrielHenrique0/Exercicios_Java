public class Exercicio7 {
    public static void main(String[] args) {
        int x = 13;
        int y = 2;
        while(y > 1){
            if (x % 2 == 0){
                y = x/2;
                x = y;
            }
            else{
                y = 3 * x + 1;
                x = y;
            }
            if(y == 1){
                System.out.print(y + " ");
            }
            else{
                System.out.print(y + " -> ");
            }
            
        }
    }
}
