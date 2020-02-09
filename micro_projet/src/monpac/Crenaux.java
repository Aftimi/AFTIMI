package monpac;
public class Crenaux {
	int idcre;
	int dheure;
	int fheure;
	int dmin;
	int fmin;
	int idmedcin;
	public Crenaux() {
	}
	public Crenaux(int idcre,int dheure,int fheure,int dmin,int fmin,int idmedcin
			) {
		super();
		this.idcre = idcre;
		this.fheure = fheure;
		this.dheure = dheure;
		this.fmin = fmin;
		this.dmin = dmin;
		this.idmedcin = idmedcin;
	}
	public int getIdcre() {
		return idcre;
	}
	public void setIdcre(int idcre) {
		this.idcre = idcre;
	}

	public int getFmin() {
		return fmin;
	}
	public void setFmin(int fmin) {
		this.fmin = fmin;
	}
	public int getDmin() {
		return dmin;
	}
	public void setDmin(int dmin) {
		this.dmin = dmin;
	}
	public int getFheure() {
		return dheure;
	}
	public void setFheure(int fheure) {
		this.fheure = fheure;
	}
	public int getDheure() {
		return dheure;
	}
	public void setDheure(int dheure) {
		this.dheure = dheure;
	}
	public int getIdmedcin() {
		return idmedcin;
	}
	public void setId(int idmedcin) {
		this.idmedcin = idmedcin;
	}
	

	
}
