package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {
	/**
	 * Methode main representant l'entree du programme
	 * @param args arguments
	 */
	public static void main(String[] args) {
		
		//Compte c = new Compte(1, "testCompte", 10000);
		CompteSimple cs = new CompteSimple(2, "testCompteSimple", 12000, 200);
		
		CompteEpargne ce = new CompteEpargne((float)0.0075);
		ce.setId(3);
		ce.setNom("testCompteEpargne");
		ce.setSolde(10000);
		

		ComptePayant cp = new ComptePayant(0.2f);
		cp.setId(4);
		cp.setNom("testComptePayant");
		cp.setSolde(5500);
		
		/*
		System.out.println(c);
		System.out.println("------------------------------------------------------");
		
		System.out.println("verser 100");
		c.verser(100);
		System.out.println(c);
		System.out.println("------------------------------------------------------");
		
		System.out.println("retirer 500");
		c.retirer(500);
		System.out.println(c);
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		*/
		
		System.out.println(cs);
		System.out.println("------------------------------------------------------");
		
		System.out.println("verser 100");
		cs.verser(100);
		System.out.println(cs);
		System.out.println("------------------------------------------------------");
		
		System.out.println("retirer 500");
		cs.retirer(500);
		System.out.println(cs);
		System.out.println("------------------------------------------------------");
		
		System.out.println("retirer 12500");
		cs.retirer(12500);
		System.out.println(cs);
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		
		System.out.println(ce);
		System.out.println("------------------------------------------------------");
		System.out.println("verser 500");
		ce.verser(500);
		System.out.println(ce);
		System.out.println("------------------------------------------------------");
		System.out.println("retirer 300.25");
		ce.retirer(300.25f);
		System.out.println(ce);
		System.out.println("------------------------------------------------------");
		System.out.println("Interets:" + ce.calculInterets());
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		System.out.println(cp);
		System.out.println("------------------------------------------------------");
		System.out.println("verser 458.25");
		cp.verser(458.25f);
		System.out.println(cp);
		System.out.println("------------------------------------------------------");
		System.out.println("retirer 300");
		cp.retirer(300);
		System.out.println(cp);
		System.out.println("------------------------------------------------------");
		System.out.println("retirer 5656");
		cp.retirer(5698);
		System.out.println(cp);
		System.out.println("------------------------------------------------------");
		System.out.println("------------------- NOMBRE DE COMPTES -------------------------");
		System.out.println(Compte.getNbComptes());
	}

}
