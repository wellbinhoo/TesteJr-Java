package Interface;

public class veiculo implements car {

	private int speed = 10;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void accelerate(){
	this.speed = this.speed * 5;
	}

	@Override
	public void desacelerar() {
		this.speed = this.speed - 4;
		
	
	}
	@Override
	public int getCurrentSpeed() {
		return speed;
	}
	
  }
