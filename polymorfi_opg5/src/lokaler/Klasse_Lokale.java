package lokaler;

public class Klasse_Lokale extends Lokale {

	public Klasse_Lokale(int areal, int kapacitet) {
		super(areal, kapacitet);
	}

	public Klasse_Lokale(Lokale other) {
		super(other);
	}

	@Override
	public int getAreal() {
		return super.areal;
	}

	@Override
	public int getKapacitet() {
		return super.kapacitet;
	}

	@Override
	public void setAreal(int areal) {
		super.areal = areal;
	}

	@Override
	public void setKapacitet(int kapacitet) {
		super.kapacitet = kapacitet;
	}

	@Override
	public String toString() {
		return "Klasse_Lokale [areal=" + areal + ", kapacitet=" + kapacitet
				+ "]";
	}
}
