import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo: ");
        int b = scan.nextInt();
        int c = b - a;
        
        try {
            if (a<b){
                for (int i = 1; i<=c; i++ ){
                    System.out.println("imprimindo o número "+ i );
                }
            } else if (a==b){
                EqualException();
            } else {
                ParametrosInvalidosException(); 
            }
        } catch (Exception e ) {
            // TODO: handle exception
            System.out.println("Erro: "+e.getMessage());
        }

    }

    static void EqualException() throws Exception{
        throw new Exception("Os números são iguais,"+
        " o segundo parâmetro deve ser maior que o primeiro");
    }
    static void ParametrosInvalidosException() throws Exception{
        throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
    }
}
