import desconto.CalculadoraDeDesconto;
import model.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        System.out.println(calculadoraDeDesconto.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDesconto.calcular(segundoOrcamento));
    }
}