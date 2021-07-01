package ex2;

/** Représente un compte bancaire de type livret A (type=LA)
 * @author Joachim
 */
public class LivretA extends CompteBancaire {
	
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
		setType("LA");

	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter for tauxRemuneration
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Applique la rémunération annuelle au solde
	 * 
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(getSolde() + getSolde()*getTauxRemuneration()/100);
	}

}
