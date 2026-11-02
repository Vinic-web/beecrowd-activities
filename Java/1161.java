import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextInt()){
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            
            System.out.println(fatorial(n1) + fatorial(n2));
        }
        
        in.close();
    }
    
    public static long fatorial(int f){
            if(f == 0)
                return 1;
            return f * fatorial(f-1);
    }
}