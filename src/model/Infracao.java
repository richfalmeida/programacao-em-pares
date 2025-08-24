package model;

public class Infracao {
    private int cdInfracao;
    private String dsInfracao;
    private String nrArtigo;
    private int nrPontuacao;
    private double vlInfracao;

    public Infracao(int cdInfracao, String dsInfracao, String nrArtigo, int nrPontuacao, double vlInfracao) {
        this.cdInfracao = cdInfracao;
        this.dsInfracao = dsInfracao;
        this.nrArtigo = nrArtigo;
        this.nrPontuacao = nrPontuacao;
        this.vlInfracao = vlInfracao;
    }

	public int getCdInfracao() {
		return cdInfracao;
	}

	public void setCdInfracao(int cdInfracao) {
		this.cdInfracao = cdInfracao;
	}

	public String getDsInfracao() {
		return dsInfracao;
	}

	public void setDsInfracao(String dsInfracao) {
		this.dsInfracao = dsInfracao;
	}

	public String getNrArtigo() {
		return nrArtigo;
	}

	public void setNrArtigo(String nrArtigo) {
		this.nrArtigo = nrArtigo;
	}

	public int getNrPontuacao() {
		return nrPontuacao;
	}

	public void setNrPontuacao(int nrPontuacao) {
		this.nrPontuacao = nrPontuacao;
	}

	public double getVlInfracao() {
		return vlInfracao;
	}

	public void setVlInfracao(double vlInfracao) {
		this.vlInfracao = vlInfracao;
	}

}
