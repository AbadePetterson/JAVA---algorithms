import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;


        Scanner leitor = new Scanner(System.in);
        int i = 0;
        for (; i < 2; i++) {


            System.out.println("digite o nome do produto");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto == precoVenda) {
                System.out.println("houve um emparte entre preço custo e preço de venda");
            } else {
                if(precoCusto > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("lucro");
                }
            }
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = "+ precoVenda);
        }

        System.out.println("A média do preço de custo é de "+ (totalCusto));
        System.out.println("A média do preço de  vendda é de: " + (totalVenda));
    }
}