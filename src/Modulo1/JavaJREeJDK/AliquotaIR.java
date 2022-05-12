package Modulo1.JavaJREeJDK;

public class AliquotaIR {
    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario <= 1900)
            System.out.println("Você é pobre, não iremos deduzir IR do seu salário");
        else if (salario > 1990 && salario <= 2800){
            double porcentagem = salario * 0.075;
            double deducao = porcentagem - 142;
            System.out.println("Seu salário será de " + (salario - deducao) + " reais");
        } else if (salario > 2800 && salario <=3751){
            double porcentagem = salario * 0.15;
            double deducao = porcentagem - 350;
            System.out.println("Seu salário será de " + (salario - deducao) + " reais");
        } else if (salario > 3751 && salario <=4664){
            double porcentagem = salario * 0.225;
            double deducao = porcentagem - 636;
            System.out.println("Seu salário será de " + (salario - deducao) + " reais");
        } else {
            System.out.println("Impossível calcular o imposto solicitado!");
        }
    }
}
