import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int tentativas = in.nextInt();
        int resto = 0;

        

        for(int i = 0; i < tentativas; i++){

            int n1 = in.nextInt();
            int n2 = in.nextInt();
        
            do{
                resto = n1 % n2;
                if(resto == 0){
                    System.out.println(n2);
                }else{
                    n1 = n2;
                    n2 = resto;
                }
            }while(resto != 0);
        }

        in.close();
    }
}