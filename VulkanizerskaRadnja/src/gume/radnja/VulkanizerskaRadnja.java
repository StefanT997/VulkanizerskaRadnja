package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Vulkanizerska radnja koja vrsi operacije nad auto gumama.
 * 
 * @author Stefan Tosic
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista auto guma u radnji
	 */
	public LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu u listu auto guma.
	 * 
	 * @param a Auto guma koja se dodaje u listu guma
	 * @throws java.lang.RuntimeException Ako je uneta null vrednst ili ako guma vec postoji u listi guma
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addLast(a);
	}

	/**
	 * Pronalazi auto gumu u listi guma na osnovu zadate marke modela gume.
	 * 
	 * @param markaModel Marka modela guma na osnovu koje se pretrazuje guma
	 * @return Ako je marka modela null vraca null u suprotnom vraca se 
	 * lista guma koja zadovoljava kriterijum marke modela
	 * 
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		if(novaLista.size()>0)
			return novaLista;
		return null;
	}
}