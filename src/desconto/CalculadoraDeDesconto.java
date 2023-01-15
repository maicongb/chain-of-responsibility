package desconto;

import model.Orcamento;

import java.math.BigDecimal;

//verifica se DescontoParaOrcamentoComMaisCincoItens foi aplicada, caso não
//verifica se DescontoParaOrcamentoComValorMaiorQueQuinhetos, caso não
//retorna 0
public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
