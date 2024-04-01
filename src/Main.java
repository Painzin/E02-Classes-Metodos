//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Conta objA = new Conta();
        Conta objB = objA;

        objA.dono.Nome = "João";
        objA.dono.Idade = 23;
        objA.dono.Endereco = "Rua x";
        objA.dono.CPF = "939.324.652.15";
        objA.dono.Sexo = 'm';
        objA.saldo = 2000;
        objA.agencia = "1111-1";
        objA.numero = 124;

        objB.dono.Nome = "Maria";
        objB.dono.Idade = 21;
        objB.dono.Endereco = "Rua y";
        objB.dono.CPF = "919.364.632.15";
        objB.dono.Sexo = 'f';
        objB.saldo = 5000;
        objB.agencia = "2222-2";
        objB.numero = 3456;

        objB.imprimir();
    }
}