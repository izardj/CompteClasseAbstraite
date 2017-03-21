package metier;

/**
 * Classe representant un compte d'epragne avec interet
 * @author Stagiaire
 *
 */
public class CompteEpargne extends Compte {
	private float taux;

	/**
	 * Constructeur du compte epargne
	 * @param taux taux d'interet
	 */
	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}
	
	// Pour illustrer heritage de methode, ne respecte pas l'architecture n-tier (devrait etre dans la couche service)
	/**
	 * Calcul les interets
	 * @return le montant des interets
	 */
	public float calculInterets() {
		float interets = solde*taux;
		return interets;
	}
	
	@Override
	public float retirer(float montant) {
		if(montant>0){
			if(montant <= solde){
				this.solde -= montant;
			}
		}
		return solde;
	}
	//---------------------------------------------------------------------------------------------------------------//

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		return "CompteEpargne [" + super.toString() + ", taux=" + taux + "]";
	}	
}
