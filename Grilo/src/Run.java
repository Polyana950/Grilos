
public class Run {
	
	static int nGrilos = 4;
	static gri grilinhos[] = new gri[nGrilos]; 
	
	public static void main (String[] args) {
		
		for(int i=0; i < nGrilos; i ++) {
			grilinhos[i] = new gri(i+1, i%2);
		}
		
	}
}
	
