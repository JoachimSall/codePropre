package ex3_proposition;

/** Classe permettant de créer un animal
 * 
 * @author Joachim
 *
 */
public class Animal {
	
	/** Nom de l'animal*/
	private String nom;
	
	/** Famille de l'animal*/
	private Famille famille;
	
	/** Regime de l'animal*/
	private Regime regime;
	
	/**
	 * @param nom
	 * @param famille
	 * @param regime
	 */
	public Animal(String nom, Famille famille, Regime regime) {
		this.nom = nom;
		this.famille = famille;
		this.regime = regime;
	}
	
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/** Setter for nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/** Getter for famille
	 * @return the famille
	 */
	public Famille getFamille() {
		return famille;
	}
	
	/** Setter for famille
	 * @param famille
	 */
	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	
	/** Getter for regime
	 * @return the regime
	 */
	public Regime getRegime() {
		return regime;
	}
	
	/** Setter for regime
	 * @param regime
	 */
	public void setRegime(Regime regime) {
		this.regime = regime;
	}
	
	/**ToString de Animal
	 * @return les attributs de l'animal au format String
	 */
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", famille=" + famille + ", regime=" + regime + "]";
	}
	
}
