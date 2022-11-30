import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Petterson");
        v.setSalario(100.0f);
        v.setCpf("043404034");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario() );

    }
}