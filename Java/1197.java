import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextInt()){
            int t = 2* in.nextInt();
            int v = in.nextInt();
            
            System.out.println(t*v);
        }
        in.close();
    }
}