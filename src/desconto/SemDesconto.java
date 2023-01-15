package desconto;

import model.Orcamento;

import java.math.BigDecimal;

//ESSA CLASSE SERVE PARA O FIM DE DESCONTO,
//QUANDO NÃO TEM MAIS NADA PARA VERIFICAR
public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
