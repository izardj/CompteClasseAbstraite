/**
 * 
 */
package metier;

/**
 * Classe repr�sentant un compte simple avec autorisation de decouvert
 * @author Stagiaire
 *
 */
public class CompteSimple extends Compte {
	
	private float decouvert;

	/**
	 * Constructeur du compte simple avec decouvert en argument
	 * @param decouvert decouvert autorise
	 */
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	/**
	 * Constructeur du compte simple 
	 * prenant tous les arguments de la classe mere Compte
	 * et le decouvert
	 * @param id identifiant du compte
	 * @param nom nom du compte
	 * @param solde solde du compte
	 * @param decouvert decouvert autorise
	 */
	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);
		this.decouvert = decouvert;
	}	
	
	// Pour illustrer heritage de methode, ne respecte pas l'architecture n-tier (devrait etre dans la couche service)
	@Override
	public float retirer(float montant){
		if(montant>0){
			if(montant <= solde + decouvert){
				this.solde -= montant;
			}
		}
		return solde;
	}
	//---------------------------------------------------------------------------------------------------------------//
	
	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple [" + super.toString() + ", Decouvert =" + decouvert + "]";
	}
}
