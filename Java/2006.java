import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        
        int cha_certo = in.nextInt();
        int acertos = 0;
        for(int i = 0; i < 5; i++){
            int opcao_cha = in.nextInt();
            if(opcao_cha == cha_certo){
                acertos++;
            }
        }
        System.out.println(acertos);
    }
 
}