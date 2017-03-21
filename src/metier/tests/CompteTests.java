package metier.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import metier.Compte;

public class CompteTests {
	private Compte compte;
	
	@Before
	public void creerCompteSolde100(){
		//this.compte = new Compte(1, "CompteTest", 100);
	}
	
	@Test
	public void testVerser() {
		Assert.assertEquals(compte.getSolde()+250.12f, this.compte.verser(250.12f), 0);
	}

	@Test
	public void testVerserMontantNegatif() {
		Assert.assertEquals(compte.getSolde(), compte.verser(-500.25f), 0);
	}
	
	@Test
	public void testRetirer() {
		Assert.assertEquals(compte.getSolde()-25.40f, compte.retirer(25.40f), 0);
	}
	
	@Test
	public void testRetirerMontantNegatif() {
		Assert.assertEquals(compte.getSolde(), compte.retirer(-30), 0);
	}

}
