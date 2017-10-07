package lista.exercicios.isp.violation;

public class Drone extends Veiculo {

	private Camera camera;

	public void ligarCamera() {
		camera.ligar();
	}

	public void desligarCamera() {
		camera.desligar();
	}
}