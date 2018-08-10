import java.util.Scanner;

public class Bar {
    public static void main(String[] args){
        int cervejas;
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Quantas cervejas deseja comprar: ");
        cervejas = leitor.nextInt();

        while(cervejas > 0) {
            System.out.println(cervejas + " cervejas na freezer.");
            cervejas--;
            System.out.println("Pega uma garrafa e passo a frente.");
            System.out.println("Agora são " + cervejas + " cervejas na freezer.");
            if(cervejas == 0){
                System.out.println("As cervejas acabaram, deseja comprar mais cervejas?");
                System.out.printf(" 1 - sim \n 2 - Não");
                opcao = leitor.nextInt();
                if(opcao == 1) {
                    System.out.printf("Quantas cervejas deseja comprar: ");
                    cervejas = leitor.nextInt();
                } else {
                    System.out.printf("Obrigado por visitar o Vila Bar!");
                }
            }
        }
    }
}
