package ex3_proposition;

public class ZooApplication {

	public static void main(String[] args) {
		
		/*Instanciation du zoo*/
		Zoo zoo = new Zoo("Thoiry");
		
		/*Instanciation des animaux*/
		Animal gazelle = new Animal("Gazelle", Famille.MAMMIFERE, Regime.HERBIVORE);
		Animal zebre = new Animal("Zèbre", Famille.MAMMIFERE, Regime.HERBIVORE);
		Animal lion = new Animal("Lion", Famille.MAMMIFERE, Regime.CARNIVORE);
		Animal panthere = new Animal("Panthère", Famille.MAMMIFERE, Regime.CARNIVORE);
		Animal requin = new Animal("Requin blanc", Famille.POISSON, Regime.CARNIVORE);
		Animal truite = new Animal("Truite dorée", Famille.POISSON, Regime.HERBIVORE);
		Animal python = new Animal("Python", Famille.REPTILE, Regime.CARNIVORE);
		
		/*Ajout des animaux dans le zoo*/
		zoo.addAnimal(gazelle);
		zoo.addAnimal(zebre);
		zoo.addAnimal(lion);
		zoo.addAnimal(panthere);
		zoo.addAnimal(requin);
		zoo.addAnimal(truite);
		zoo.addAnimal(python);
		
		/*Affichage des animaux du zoo par zone*/
		zoo.afficherListeAnimaux();
	}

}
