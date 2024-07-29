import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        Double valorConsumo = 0.0;

        System.out.println("Digite o tipo do cliente:");
        String tipoCliente = s.nextLine();

        System.out.println("Digite o valor do consumo:");
        Double consumo = s.nextDouble();

        CalculadoraDescontos valorConta = new CalculadoraDescontos(consumo, tipoCliente);

        if (tipoCliente.equalsIgnoreCase("regular")){

            valorConta.setCalculoDesconto(new DescontoClienteRegular());

        } else  if (tipoCliente.equalsIgnoreCase("vip")){

            valorConta.setCalculoDesconto(new DescontoClienteVip());

        } else  if (tipoCliente.equalsIgnoreCase("funcionario")){
            
           valorConta.setCalculoDesconto(new DescontoFuncionario());

        } 

        valorConsumo = consumo - (valorConta.getCalculoDesconto().calcularDesconto(consumo));
        System.out.println("O valor final do consumo é: R$" + valorConsumo);

        
        s.close();
    }
}
