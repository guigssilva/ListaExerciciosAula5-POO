package lista.exercicios.dip.violation;

public class Piloto {

	private CarroDeCorrida veiculo;

	public Piloto() {
		this.veiculo = new CarroDeCorrida(100);
	}

	public void acelerar() {
		veiculo.aumentaVelocidade();
	}
}
