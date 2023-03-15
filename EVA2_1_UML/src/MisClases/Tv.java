package MisClases;

public class Tv {
	
	private int canal;
	private int volumen;
	private boolean power;
	
	public void setCanal(int d){
		canal = d;
	}
	public void plusVol() {
		volumen ++;
	}
	public void minVol() {
		volumen --;
	}
	
	public void setPower() {
		if(power) {
			power = false;
		}else {
			power = true;
		}
	}
	
	public int getVol() {
		return volumen;
	}
	public int getChannel() {
		return canal;
	}
	
	public void imprimirDatos() {
		System.out.println("Canal: " + canal);
		System.out.println("Volumen: " + volumen);
	}
}
