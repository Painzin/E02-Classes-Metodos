public class Conta
{
    String agencia;
    Cliente dono = new Cliente();
    int numero;
    float saldo;


    public void imprimir()
    {
        System.out.println("Nome: " + this.dono.Nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Idade: " + this.dono.Idade);
        System.out.println("Sexo: " + this.dono.Sexo);
        System.out.println("CPF: " + this.dono.CPF);
        System.out.println("Endereço: " + this.dono.Endereco);
        System.out.println("Numero: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
    }

}