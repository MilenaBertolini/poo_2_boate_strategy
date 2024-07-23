public class DescontoClienteRegular implements DescontoStrategy{
    
    public Double calcularDesconto(Double consumo){

        if (consumo > 1000) {

            return consumo * 0.05;

        } else {

            return consumo * 0.02;
        }

    }
}
