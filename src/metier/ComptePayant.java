package metier;

public class ComptePayant extends Compte {
	
	private float pourcentage;
	
	/**
	 * Constructeur du compte payant
	 * @param pourcentage pourcentage a payer pour chaque operation bancaire
	 */
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	
	// Pour illustrer heritage de methode, ne respecte pas l'architecture n-tier (devrait etre dans la couche service)
	@Override
	public float verser(float montant) {
		if(montant > 0) {
			float coutOperation = montant*pourcentage/100;
				this.solde = solde + montant - coutOperation;
		}		
		return solde;
	}
	@Override
	public float retirer(float montant) {
		if(montant > 0) {
			float coutOperation = montant*pourcentage/100;
			
			if(montant + coutOperation <= solde){
				this.solde = solde - montant - coutOperation;
			}
		}
		return solde;
	}
	//---------------------------------------------------------------------------------------------------------------//

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [" + super.toString() + ", pourcentage=" + pourcentage + "]";
	}
}
