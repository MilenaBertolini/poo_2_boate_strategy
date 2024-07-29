public class CalculadoraDescontos {

    private Double consumo;
    
    private String tipoCliente;

    private DescontoStrategy calculoDesconto;

    public void setCalculoDesconto(DescontoStrategy calculoDesconto) {

        this.calculoDesconto = calculoDesconto;
    }

    public DescontoStrategy getCalculoDesconto() {

        return this.calculoDesconto;
    }

    public CalculadoraDescontos(Double consumo, String tipoCliente){

        this.consumo = consumo;
        this.tipoCliente = tipoCliente;

    }

    public Double calcularValorComDesconto() {

        Double desconto = calculoDesconto.calcularDesconto(consumo);

        return consumo - desconto;

    }

    

}
