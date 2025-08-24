package model;

public class Ait {
    private int cdAit;
    private String nrAit;
    private String dtInfracao;
    private double vlMulta;
    private String dsLocalInfracao;
    private String dtPrazoDefesa;
    private String nrCpfCnpjProprietario;
    private String nrCepProprietario;
    private String dsEnderecoProprietario;
    private String nrEnderecoProprietario;
    private int cdAgente;    
    private int cdCidade;    
    private int cdInfracao;  
    private int cdBairro; 
    private String nrPlaca;
    private String nmMarcaModelo;
    private int anoFabricacao;
    private int anoModelo;
    private String nrRenavan;
    private String nmProprietario;

    public Ait() {}

    public Ait(int cdAit, String nrAit, String dtInfracao, double vlMulta, String dsLocalInfracao,
               String dtPrazoDefesa, String nrCpfCnpjProprietario, String nrCepProprietario,
               String dsEnderecoProprietario, String nrEnderecoProprietario,
               int cdAgente, int cdCidade, int cdInfracao, int cdBairro,
               String nrPlaca, String nmMarcaModelo, int anoFabricacao,
               int anoModelo, String nrRenavan, String nmProprietario) {

        this.cdAit = cdAit;
        this.nrAit = nrAit;
        this.dtInfracao = dtInfracao;
        this.vlMulta = vlMulta;
        this.dsLocalInfracao = dsLocalInfracao;
        this.dtPrazoDefesa = dtPrazoDefesa;
        this.nrCpfCnpjProprietario = nrCpfCnpjProprietario;
        this.nrCepProprietario = nrCepProprietario;
        this.dsEnderecoProprietario = dsEnderecoProprietario;
        this.nrEnderecoProprietario = nrEnderecoProprietario;
        this.cdAgente = cdAgente;
        this.cdCidade = cdCidade;
        this.cdInfracao = cdInfracao;
        this.cdBairro = cdBairro;

        this.nrPlaca = nrPlaca;
        this.nmMarcaModelo = nmMarcaModelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.nrRenavan = nrRenavan;
        this.nmProprietario = nmProprietario;
    }

    public int getCdAit() { return cdAit; }
    public void setCdAit(int cdAit) { this.cdAit = cdAit; }
    
    public String getNrAit() { return nrAit; }
    public void setNrAit(String nrAit) { this.nrAit = nrAit; }

    public String getDtInfracao() { return dtInfracao; }
    public void setDtInfracao(String dtInfracao) { this.dtInfracao = dtInfracao; }

    public double getVlMulta() { return vlMulta; }
    public void setVlMulta(double vlMulta) { this.vlMulta = vlMulta; }

    public String getDsLocalInfracao() { return dsLocalInfracao; }
    public void setDsLocalInfracao(String dsLocalInfracao) { this.dsLocalInfracao = dsLocalInfracao; }

    public String getDtPrazoDefesa() { return dtPrazoDefesa; }
    public void setDtPrazoDefesa(String dtPrazoDefesa) { this.dtPrazoDefesa = dtPrazoDefesa; }

    public String getNrCpfCnpjProprietario() { return nrCpfCnpjProprietario; }
    public void setNrCpfCnpjProprietario(String nrCpfCnpjProprietario) { this.nrCpfCnpjProprietario = nrCpfCnpjProprietario; }

    public String getNrCepProprietario() { return nrCepProprietario; }
    public void setNrCepProprietario(String nrCepProprietario) { this.nrCepProprietario = nrCepProprietario; }

    public String getDsEnderecoProprietario() { return dsEnderecoProprietario; }
    public void setDsEnderecoProprietario(String dsEnderecoProprietario) { this.dsEnderecoProprietario = dsEnderecoProprietario; }

    public String getNrEnderecoProprietario() { return nrEnderecoProprietario; }
    public void setNrEnderecoProprietario(String nrEnderecoProprietario) { this.nrEnderecoProprietario = nrEnderecoProprietario; }

    public int getCdAgente() { return cdAgente; }
    public void setCdAgente(int cdAgente) { this.cdAgente = cdAgente; }

    public int getCdCidade() { return cdCidade; }
    public void setCdCidade(int cdCidade) { this.cdCidade = cdCidade; }

    public int getCdInfracao() { return cdInfracao; }
    public void setCdInfracao(int cdInfracao) { this.cdInfracao = cdInfracao; }

    public int getCdBairro() { return cdBairro; }
    public void setCdBairro(int cdBairro) { this.cdBairro = cdBairro; }

    public String getNrPlaca() { return nrPlaca; }
    public void setNrPlaca(String nrPlaca) { this.nrPlaca = nrPlaca; }

    public String getNmMarcaModelo() { return nmMarcaModelo; }
    public void setNmMarcaModelo(String nmMarcaModelo) { this.nmMarcaModelo = nmMarcaModelo; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }

    public String getNrRenavan() { return nrRenavan; }
    public void setNrRenavan(String nrRenavan) { this.nrRenavan = nrRenavan; }

    public String getNmProprietario() { return nmProprietario; }
    public void setNmProprietario(String nmProprietario) { this.nmProprietario = nmProprietario; }
}
