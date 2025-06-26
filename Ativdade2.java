import java.util.Scanner;
public class Ativdade2 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a temperatuta em celsius");
        double celsius=scanner.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        double kelvin=(celsius*273+15);
        System.out.println("temperatura em celsius:" +celsius);
        System.out.println("temperatuta em fahrenheit:" +fahrenheit);
        System.out.println("temperatura em kelvin:" +kelvin);

    }
}



