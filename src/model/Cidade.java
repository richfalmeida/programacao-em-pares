package model;

public class Cidade {
    private int cdCidade;
    private String nmCidade;

    public Cidade(int cdCidade, String nmCidade) {
        this.cdCidade = cdCidade;
        this.nmCidade = nmCidade;
    }

	public int getCdCidade() {
		return cdCidade;
	}

	public void setCdCidade(int cdCidade) {
		this.cdCidade = cdCidade;
	}

	public String getNmCidade() {
		return nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

}
