package desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    //Caso essa regra não for executada, então vai chamar o próximo
    //que analisará se terá desconto ou não
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
