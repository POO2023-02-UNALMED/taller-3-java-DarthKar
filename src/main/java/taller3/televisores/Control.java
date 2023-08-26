package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public void turnOn() {
	    this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOn();
	}
	public void setCanal(int canal) {
		if (tv.getEstado() && canal>=1 && canal<=120) {
			this.tv.setCanal(canal);
		}
	}
	public void setVolumen(int volumen) {
		if (tv.getEstado() && volumen>=0 && volumen<=7) {
			this.tv.setVolumen(volumen);
		}
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return this.tv;
	}
}