

public class gri extends Thread {
	
	float S= 0;
	int name; 
	float GetRandomPulo() {
		return (float)(Math.random()*10);
	}
	int time; 
	public gri(int name, int time) {
	
		this.name = name; 
		this.time = time;
		start();
	}
	
	public void FixedUpdate (float deltaT) {
		float X = 0;
		
		if(S <100) { 
			X = GetRandomPulo();
			S = S + X; 
		System.out.printf("O Grilo_0" + name + " pulou "+ X + "cm 		e j� percorreu " + S + "cm" + "\n");
		}

	}





}
