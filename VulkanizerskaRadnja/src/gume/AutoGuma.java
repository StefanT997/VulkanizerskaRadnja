package gume;

/**
 * 
 * @author Stefan Tosic
 *
 */
public class AutoGuma {
	private String markaModel = null;
	private int precnik = 0;
	private int sirina = 0;
	private int visina = 0;
	
	/**
	 * Vraca marku modela gume automobila
	 * @return marku modela kao string
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	
	/**
	 * Postavlja vrednost marke modela
	 * @param markaModel marka modela tipa string 
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * Vraca precnik gume automobila
	 * @return precnik gume automobila kao int
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Postavlja vrednost precnika gume ako precnik nije van opsega. Precnik je u opsegu ako mu je vrednost izmedju 13 i 22.
	 * 
	 * @param precnik precnik gume tipa int
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 && precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * Vraca sirinu gume automobila
	 * @return sirinu gume automobila kao int
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * Postavlja vrednost sirine gume ako joj sirina nije van opsega. Sirina je u opsegu ako joj je vrednost izmedju 135 i 355.
	 * @param precnik Precnik gume tipa int
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 && sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume automobila
	 * @return Visinu gume automobila kao int
	 */
	public int getVisina() {
	return visina;
	}
	
	/**
	 * Postavlja vrednost visine gume ako joj visina nije van opsega. Visina je u opsegu ako joj je vrednost izmedju 135 i 355.
	 * @param precnik Precnik gume tipa int
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}
}
