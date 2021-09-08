package c3;

public class Ex4 {
	public static void filtrare(String[] sir, String cuvant, int litere) {
		String[] sirFiltrat = new String[sir.length];
		int marimeSirFiltrat = 0;
		cuvant = cuvant.toLowerCase();
		 
		for (int i = 0; i < sir.length; i++) {
			String crtSir = sir[i].toLowerCase();
			int lungimeMin = Math.min(crtSir.length(), cuvant.length());
			int countlitere = 0;
		    	for (int j = 0; j < lungimeMin; j++) {
		    		if (crtSir.charAt(j) == cuvant.charAt(j)) {
		    			countlitere++;
		    		}
		    	}
		    	if (countlitere >= litere) {
		    		sirFiltrat[marimeSirFiltrat] = sir[i]; 
		    		marimeSirFiltrat++;
		    	}
		  	}
		 
		for(int i = 0; i < marimeSirFiltrat; i++) {
			System.out.print(sirFiltrat[i] + " ");
		}	
		}
		public static void main(String[] args) {
		
		String [] sir = {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
		String cuvant = "plot";
		int litere = 1;
		filtrare ( sir,  cuvant,  litere);
		
	}
		
}
