package Modulo1.JavaJREeJDK;
//Agora crie uma nova classe, escreva um for que inicie uma variável n (número atual) como 1 e fatorial (resultado total) como 1. Faça seu laço entre 1 a 10 e calcule o resultado!
public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        for (int i = 1; i < 11; i++)
        {fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial); }
    }
}
