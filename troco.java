import java.util.Scanner;


public class troco {
    public static void main(String[] args) {
        Scanner tcl  = new Scanner(System.in);
        double recebido = 0;
        double troco = 0;
        
        System.out.println("Qual o valor do produto?");
        double valor  = tcl.nextDouble();
        
        System.out.println("Quanto o cliente deu?");
        double pago = tcl.nextDouble();
        
        if(pago> valor){
            troco = pago - valor;
            System.out.println("Seu troco é" + troco);
        }else{
            System.out.println("Obrigado péla compra ;)");
        }
   
    }
}