//=====================================
//Programmeur : Sean Leclerc
//Fichier : AlgorithmeTableau.java
//Date : Oct 31, 2016 
//Description :  Algorithme
//======================================
public class AlgorithmeTableau {
	public static void afficherTableau( double[] t, int nbC, String format) {
	for( int i=0 ; i<t.length ; i++) {
		System.out.printf("%1$"+format+"f",t[i]);
		if( (i+1)%nbC==0) System.out.println();
	}
	}
	//Definition de la methode
	public static double somme( double[] t ) {
		double somme = 0.0;
		for( int i=0 ; i<t.length ; i++)  somme += t[i];
		return somme;
		
		}
		//utilisation de la methode
	public static double moyenne( double[] t ) {
		return somme( t)/t.length;
	}
	public static double min( double[] t ) {
		double min = t[0];
		for( int i=1 ; i<t.length ; i++ ) {
			if( t[i]<min ) min=t[i];
		}
		return min;
	}
	public static double max( double[] t ) {
		double max = t[0];
		for( int i=1 ; i<t.length ; i++ ) {
			if( t[i]>max ) max=t[i];
		}
		return max;
	}
	public static double etendue( double[] t) {
		double max = t[0];
		double min = t[0];
		for( int i=1 ; i<t.length ; i++ ) {
			if( t[i]>max ) max=t[i];
			if( t[i]<min ) min=t[i];
		}
		return max-min;
	}
	public static void melanger( double[] t) {
		double temp;
		for(int i = 0; i<t.length; i++) {
		int j = (int) (Math.random()*t.length);
		//On echange t[i] et t[j]
		temp = t[i];
		t[i] = t[j];
		t[j] = temp;
		
		}
	}

	public static void main(String[] args) {
		double[] tab = new double [30];
		for( int i = 0 ; i<tab.length ; i++ ) tab[i] = i;
		afficherTableau( tab, 6, "6.2" );
		System.out.println("\nMinimum : " + min(tab));
		System.out.println("\nMaximun : " + max(tab));
		System.out.println("\nEtendue :" + etendue(tab));
		melanger(tab);
		afficherTableau( tab, 6, "6.2" );
	}
	

}
