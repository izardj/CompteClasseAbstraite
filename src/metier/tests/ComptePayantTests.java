package metier.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import metier.ComptePayant;

public class ComptePayantTests {
	
	private ComptePayant compte;
	
	@Before
	public void creerCompteSolde100(){
		this.compte = new ComptePayant(0.1f);
		this.compte.setId(1);
		this.compte.setNom("ComptePayantTest");
		
	}
	
	@Test
	public void testVerser() {
		this.compte.setSolde(123.456f);
		float montant = 10.45f;
		Assert.assertEquals(compte.getSolde() 
							+ montant
							- montant*compte.getPourcentage()/100,
							compte.verser(montant), 0);
	}
	
	@Test
	public void testVerserMontantNegatif() {
		Assert.assertEquals(compte.getSolde(), compte.verser(-5487.25f), 0);
	}
	
	@Test
	public void testRetirer() {
		this.compte.setSolde(87536f);
		float montant = 88.54f;
		Assert.assertEquals(compte.getSolde() 
							- montant
							- montant*compte.getPourcentage()/100,
							compte.retirer(montant), 0);
	}
	
	@Test
	public void testRetirerSoldeInsuffisant() {
		this.compte.setSolde(100);
		float montant = 98756.19f;
		Assert.assertEquals(compte.getSolde(), compte.retirer(montant), 0);
	}
	
	@Test
	public void testRetirerMontantNegatif() {
		Assert.assertEquals(compte.getSolde(), compte.retirer(-500.25f), 0);
	}
}
