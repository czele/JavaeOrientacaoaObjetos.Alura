package Modulo1.JavaOO.ByteBank.bytebank.src;

import Modulo1.JavaOO.ByteBank.bytebank.src.Cliente;
import Modulo1.JavaOO.ByteBank.bytebank.src.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

		Cliente camila = new Cliente();
		camila.setNome("Camila Zelenovsky");
		camila.setCpf("111.111.111-11");
		camila.setProfissao("psicóloga");

		Conta contadaCamila = new Conta();
		contadaCamila.setTitular(camila);
		camila.setProfissao("programadora");
		System.out.println(contadaCamila.getTitular().getProfissao());

	}
}