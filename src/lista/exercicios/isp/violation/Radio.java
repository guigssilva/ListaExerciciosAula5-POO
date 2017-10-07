/**
 * 
 */
package lista.exercicios.isp.violation;

/**
 * @author guilh
 *
 */
public class Radio implements LigaDesliga {

	private boolean radioOn;

	public boolean isRadioOn() {
		return radioOn;
	}

	@Override
	public void ligar() {
		radioOn = true;
	}

	@Override
	public void desligar() {
		radioOn = false;
	}

}
