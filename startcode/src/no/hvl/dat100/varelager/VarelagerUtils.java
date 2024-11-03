package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		int posisjon = 0;
		
		for(int i = 1; i < varer.length; i++) {
			
			if(varer[i].getPris() < varer[i-1].getPris()) {
				posisjon = i;
			}
			
		}return varer[posisjon];

	}
	
	public static double totalPris(Vare[] varer) {		
		
		double totalPris = 0;
		
		for (int i = 0; i < varer.length; i++) {
			totalPris += varer[i].getPris();
		}
		return totalPris;

	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int[] nyTab = new int[varer.length];
		
		for (int i = 0; i < varer.length; i++) {
			nyTab[i] = varer[i].getVarenr();
		} return nyTab;
	} 
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		double[] prisTab = new double[varer.length-1];

		for (int i = 0; i < varer.length - 1; i++) {
	        prisTab[i] = Math.abs(varer[i + 1].getPris() - varer[i].getPris()); //Hvis differanse er negativ, blir den omgjort pos.
	    }
		return prisTab;
	}
	
}
