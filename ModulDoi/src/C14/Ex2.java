package C14;

public class Ex2 {

	public static void main(String[] args) {
		
		System.out.println(" Matricea A: \n");
		int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(a[i][j]+" ");    
			}    
			System.out.println();   
		}   
		System.out.println("\n Matricea B: \n");
		int b[][]={{2,7,9},{3,8,5},{4,6,9}};  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(b[i][j]+" ");    
			}    
			System.out.println();    
		}   
		    
		int c[][]=new int[3][3]; 
		    
		System.out.println("\n Adunarea a doua matrici:  Matricea C = A + B: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=a[i][j]+b[i][j];     
				System.out.print(c[i][j]+" ");    
			}    
			System.out.println();//new line    
		}    
		
		int d[][]=new int[3][3]; 
	    
		System.out.println("\n Scaderea a doua matrici: Matricea D = B - A: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				d[i][j]=b[i][j] - a[i][j];     
				System.out.print(d[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		
		int e[][]=new int[3][3]; 
	    
		System.out.println("\n Inmultirea a doua matrici: Matricea E = A * B: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				e[i][j]=a[i][j] * b[i][j];     
				System.out.print(e[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		
		int f[][]=new int[3][3]; 
	    
		System.out.println("\n Inmultirea cu un scalar:  Matricea F = 5 * A: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				f[i][j]= 5 * a[i][j];     
				System.out.print(f[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		
	}

}
