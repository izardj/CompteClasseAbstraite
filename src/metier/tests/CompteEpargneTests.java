package metier.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import metier.CompteEpargne;

public class CompteEpargneTests {

	private CompteEpargne compte;
	
	@Before
	public void creerCompteSolde100(){
		this.compte = new CompteEpargne(0.5f);
		this.compte.setId(1);
		this.compte.setNom("CompteEpargneTest");
		this.compte.setSolde(100);
	}
	
	@Test
	public void testCalculInterets() {
		Assert.assertEquals(compte.getSolde()*compte.getTaux(), compte.calculInterets(), 0);
	}

}
