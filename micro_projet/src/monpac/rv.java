package monpac;


public class rv {
	int idrv;
	String jour;
	int idc;
	int idcre;
	public rv () {
	}
	public rv (int idrv,String jour,int idc,int idcre) {
		super();
		this.idrv = idrv;
		this.jour = jour;
		this.idc = idc;
		this.idcre=idcre;
	}
	public int idrv() {
		return idrv;
	}
	public void setIdrv(int idrv) {
		this.idrv = idrv;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		idc = idc;
	}
	public int getIdcre() {
		return idcre;
	}
	public void setIdcre(int idcre) {
		idcre = idcre;
	}
	

}

