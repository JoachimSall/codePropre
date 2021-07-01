package ex3_proposition;

import java.util.ArrayList;
import java.util.List;

/** Classe permettant de créer un zoo
 * 
 * @author Joachim
 *
 */
public class Zoo {
	
	/** Nom du zoo*/
	private String nom;
	
	/** Liste des animaux de la zone savane africaine*/
	private List<Animal> savaneAfricaine;
	
	/** Liste des animaux de la zone carnivore*/
	private List<Animal> zoneCarnivore;
	
	/** Liste des animaux de la ferme reptile*/
	private List<Animal> fermeReptile;
	
	/** Liste des animaux de l'aquarium*/
	private List<Animal> aquarium;
	
	/**
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new ArrayList<>();
		this.zoneCarnivore = new ArrayList<>();
		this.fermeReptile = new ArrayList<>();
		this.aquarium = new ArrayList<>();
	}
	
	/** Permet d'ajouter des animaux dans les différentes zones du zoo en fonction de leurs caractéristiques
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		if (animal.getFamille().equals(Famille.MAMMIFERE) && animal.getRegime().equals(Regime.CARNIVORE)){
			zoneCarnivore.add(animal);
		}
		else if (animal.getFamille().equals(Famille.MAMMIFERE) && animal.getRegime().equals(Regime.HERBIVORE)){
			savaneAfricaine.add(animal);
		}
		else if (animal.getFamille().equals(Famille.REPTILE)){
			fermeReptile.add(animal);
		}
		else if (animal.getFamille().equals(Famille.POISSON)){
			aquarium.add(animal);
		}
	}
	
	/** Permet d'afficher la liste des animaux du zoo
	 * 
	 */
	public void afficherListeAnimaux(){
		
		System.out.println("Animaux de la zone savane africaine");
		for(Animal a : this.savaneAfricaine) {
			System.out.println(a);
		}
		
		System.out.println("Animaux de la zone carnivore");
		for(Animal a : this.zoneCarnivore) {
			System.out.println(a);
		}
		
		System.out.println("Animaux de la ferme reptile");
		for(Animal a : this.fermeReptile) {
			System.out.println(a);
		}
		
		System.out.println("Animaux de l'aquarium");
		for(Animal a : this.aquarium) {
			System.out.println(a);
		}
		
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
