import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int linhas = in.nextInt();
        
        for(int i = 1; i <= linhas; i++){
            System.out.printf("%d %d %d%n", i, (i*i), (i*i*i));
            System.out.printf("%d %d %d%n", i, ((i*i)+1), ((i*i*i)+1));
        }
        in.close();
    }
}