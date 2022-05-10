import java.util.concurrent.Semaphore;

public class Grilo extends Thread {
	
	float S= 0;
	int name; 
	int team; 
	static Semaphore semaphore;

	

	float GetRandomPulo() {
		return (float)(Math.random()*10);
	}
	public Grilo(int name, int team) {
	
		this.name = name; 
		this.team = team;
		semaphore = new Semaphore(team);
		start();
	}
	
	public void FixedUpdate(float deltaT) {
		float X = 0;
		
		try {semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if(S <100) { 
			X = GetRandomPulo();
			S = S + X; 
			System.out.printf("O Grilo_0" + name + " pulou "+ (int)X + "cm 		e j� percorreu " + (int)S + "cm" + "\n");
		}
		semaphore.release();

	}





}
