package lista.exercicios.isp.violation;

public class Carro extends Veiculo {

	private Radio radio;

	public Carro(Radio radio) {
		this.radio = radio;
	}

	public void ligarRadio() {
		radio.ligar();
	}

	public void desligarRadio() {
		radio.desligar();
	}
}