import java.util.concurrent.Semaphore;

public class gri extends Thread {
	
	float S= 0;
	int name; 
	int time; 
	static Semaphore semaphore;

	

	float GetRandomPulo() {
		return (float)(Math.random()*10);
	}
	public gri(int name, int time) {
	
		this.name = name; 
		this.time = time;
		semaphore = new Semaphore(time);
		start();
	}
	
	public void FixedUpdate (float deltaT) {
		float X = 0;
		
		try {semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if(S <100) { 
			X = GetRandomPulo();
			S = S + X; 
			System.out.printf("O Grilo_0" + name + " pulou "+ X + "cm 		e j� percorreu " + S + "cm" + "\n");
		}
		semaphore.release();

	}





}
