
public class Run {
	
	static int nGrilos = 4;
	static Grilo grilinhos[] = new Grilo[nGrilos]; 
	public static float timeReleased = 0f;
	
	public static void main(String[] args) {
		
		for(int i=0; i < nGrilos; i ++) {
			grilinhos[i] = new Grilo(i+1, i%2+1);
		}
		
		Initialize();
	}

	public static void Initialize() {
		float deltaT = 0;
		long start = System.currentTimeMillis();
		while(true) {

			timeReleased += deltaT;
            while(timeReleased > 1.00f/(60)) {
			 	
			// if(deltaT >= 1.0f/60) {

				CallGriFixedUpdate(deltaT);
				timeReleased += deltaT;
				// start = System.currentTimeMillis();
        	}
            deltaT = (float) (System.currentTimeMillis() - start) / 1000.0000f;
		}
	}

	public static void CallGriFixedUpdate(float deltaT) {
		for (Grilo grilo : grilinhos) {
			grilo.FixedUpdate(deltaT);
		 }
		 
	}

}
	
