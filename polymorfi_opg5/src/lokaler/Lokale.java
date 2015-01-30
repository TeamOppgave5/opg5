package lokaler;

public abstract class Lokale {

	protected int areal = 0;
	protected int kapacitet = 0;
	
	public Lokale(int areal, int kapacitet) {
		this.areal = areal;
		this.kapacitet = kapacitet;
	}
	
	public Lokale(Lokale other) {
		areal = other.areal;
		kapacitet = other.kapacitet;
	}
	
	public abstract int getAreal();
	
	public abstract int getKapacitet();
	
	public abstract void setAreal(int areal);
	
	public abstract void setKapacitet(int kapacitet);

	@Override
	public String toString() {
		return "Lokale [areal=" + areal + ", kapacitet=" + kapacitet + "]";
	}
	
}
