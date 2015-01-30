package lokaler;

public abstract class Lokale {

	private int areal = 0;
	private int kapacitet = 0;
	
	public Lokale(int areal, int kapacitet) {
		this.areal = areal;
		this.kapacitet = kapacitet;
	}
	
	public Lokale(Lokale other) {
		areal = other.areal;
		kapacitet = other.kapacitet;
	}

	@Override
	public String toString() {
		return "Lokale [areal=" + areal + ", kapacitet=" + kapacitet + "]";
	}
	
}
