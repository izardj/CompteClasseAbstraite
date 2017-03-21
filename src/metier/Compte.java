package metier;

/**
 * Classe representant un compte sans autorisation de decouvert
 * @author Stagiaire
 *
 */
public abstract class Compte {
	private int id;
	private String nom;
	protected float solde;
	private static int nbComptes;
	
	/**
	 * Constructeur du Compte
	 */
	public Compte() {
		super();
		nbComptes++;
	}

	/**
	 * @param id identifiant du compte
	 * @param nom nom du compte
	 * @param solde solde du compte
	 */
	public Compte(int id, String nom, float solde) {
		super();
		nbComptes++;
		this.id = id;
		this.nom = nom;
		this.solde = solde;
	}
	
	// Pour illustrer heritage de methode, ne respecte pas l'architecture n-tier (devrait etre dans la couche service)
	/**
	 * Methode verser
	 * @param montant montant a verser
	 * @return solde apres versement
	 */
	public float verser(float montant) {
		if(montant>0){
			this.solde += montant;
		}
		return solde;
	}
	/**
	 * Methode retirer
	 * @param montant montant a retirer
	 * @return solde apres retrait
	 */
	public abstract float retirer(float montant);
	//---------------------------------------------------------------------------------------------------------------//

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id  + ", nom=" + nom + ", solde=" + solde + "]";
	}

	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}

	
	
}
