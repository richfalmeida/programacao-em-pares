package model;

public class Agente {
    private int cdAgente;
    private String nmAgente;
    private String nrMatricula;

    public Agente(int cdAgente, String nmAgente, String nrMatricula) {
        this.cdAgente = cdAgente;
        this.nmAgente = nmAgente;
        this.nrMatricula = nrMatricula;
    }

	public int getCdAgente() {
		return cdAgente;
	}

	public void setCdAgente(int cdAgente) {
		this.cdAgente = cdAgente;
	}

	public String getNmAgente() {
		return nmAgente;
	}

	public void setNmAgente(String nmAgente) {
		this.nmAgente = nmAgente;
	}

	public String getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(String nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

}
