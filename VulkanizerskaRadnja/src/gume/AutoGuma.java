package gume;

/**
 * Tip gume za automobile 
 * 
 * @author Stefan Tosic
 * @version 0.1.1
 * 
 */
public class AutoGuma {
	/**
	 * Marka modela gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca marku modela gume automobila
	 * 
	 * @return marku modela kao string
	 * 
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	
	/**
	 * Postavlja vrednost marke modela
	 * 
	 * @param markaModel marka modela tipa string 
	 * 
	 * @throws java.lang.RuntimeException Ako je uneta:
	 *  <ul>
	 *  	<li>null vrednost,</li> 
	 *      <li>duzina marke modela manja od 3</li>
	 *  </ul>
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
	 * Postavlja vrednost precnika gume ako precnik nije van opsega. 
	 * 
	 * @param precnik precnik gume tipa int
	 * @throws java.lang.RuntimeException Ako je precnik:
	 *  <ul>
	 *  	<li>manji od 13</li> 
	 *      <li>veci od 22</li>
	 *  </ul>
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
	 * Postavlja vrednost sirine gume.
	 * @param sirina Sirina gume tipa int.
	 * 
	 * @throws java.lang.RuntimeException Ako je sirina:
	 *  <ul>
	 *  	<li>manja od 135</li> 
	 *      <li>veca od 355</li>
	 *  </ul>
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
	 * Postavlja visinu gume na zadatu vrednost.
	 * 
	 * @param visina Visina gume koju treba postaviti
	 * @throws java.lang.RuntimeException Ako je visina:
	 *  <ul>
	 *  	<li>manja od 25</li> 
	 *      <li>veca od 95</li>
	 *  </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca marku modela, precnik, sirinu i visinu gume kao formatiran tekst.
	 * 
	 * @return Formatiran tekst koji sadrzi marku modela, precnik, sirinu i visinu gume
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi da li su dve auto gume iste. 
	 * 
	 * @return Vraca true ako jesu, false ako nisu.
	 */
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
