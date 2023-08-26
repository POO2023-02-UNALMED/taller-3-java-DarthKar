package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
	    tv.turnOn();
	}
	public void turnOff() {
		tv.turnOn();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);	
	}
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}	
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	
}