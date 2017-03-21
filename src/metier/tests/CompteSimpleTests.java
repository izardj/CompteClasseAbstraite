package metier.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import metier.CompteSimple;

public class CompteSimpleTests {
	private CompteSimple compte;
	
	@Before
	public void creerCompteSolde(){
		this.compte = new CompteSimple(200);
	}

	@Test
	public void testRetirer() {
		Assert.assertEquals(compte.getSolde()-25.40f, compte.retirer(25.40f), 0);
	}
	
	@Test
	public void testRetirerAvecDecouvert() {
		this.compte.setSolde(500);
		this.compte.setDecouvert(100);
		Assert.assertEquals(compte.getSolde()-550,
							compte.retirer(550), 0);
	}
	
	@Test
	public void testRetirerAudelaDuDecouvert() {
		this.compte.setSolde(500);
		this.compte.setDecouvert(100);
		Assert.assertEquals(compte.getSolde(), compte.retirer(700), 0);
	}	
	
	@Test
	public void testRetirerMontantNegatif() {
		Assert.assertEquals(compte.getSolde(), compte.retirer(-30), 0);
	}
}
