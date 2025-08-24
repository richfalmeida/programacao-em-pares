package model;

public class Bairro {
    private int cdBairro;
    private String nmBairro;

    public Bairro(int cdBairro, String nmBairro) {
        this.cdBairro = cdBairro;
        this.nmBairro = nmBairro;
    }

	public int getCdBairro() {
		return cdBairro;
	}

	public void setCdBairro(int cdBairro) {
		this.cdBairro = cdBairro;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

}
