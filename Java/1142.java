import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int linhas = in.nextInt();
        int num = 1;
        
        for(int i = 0; i < linhas; i++){
            System.out.printf("%d %d %d PUM%n", num , (num+1) , (num+2));
            num = num + 4;
        }
        in.close();
    }
}