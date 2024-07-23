public class DescontoFuncionario implements DescontoStrategy{

    public Double calcularDesconto(Double consumo){

        return consumo * 0.30;
    }

}
