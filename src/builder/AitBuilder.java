package builder;

import model.Ait;

public class AitBuilder {
    private Ait ait;

    public AitBuilder() {
        this.ait = new Ait();
    }

    public AitBuilder addCdAit(int cdAit) {
        ait.setCdAit(cdAit);
        return this;
    }
    
    public AitBuilder addNrAit(String nrAit) {
        ait.setNrAit(nrAit);
        return this;
    }

    public AitBuilder addDtInfracao(String dtInfracao) {
        ait.setDtInfracao(dtInfracao);
        return this;
    }

    public AitBuilder addVlMulta(double vlMulta) {
        ait.setVlMulta(vlMulta);
        return this;
    }

    public AitBuilder addDsLocalInfracao(String dsLocal) {
        ait.setDsLocalInfracao(dsLocal);
        return this;
    }

    public AitBuilder addDtPrazoDefesa(String dtPrazoDefesa) {
        ait.setDtPrazoDefesa(dtPrazoDefesa);
        return this;
    }

    public AitBuilder addNrCpfCnpjProprietario(String nrCpfCnpj) {
        ait.setNrCpfCnpjProprietario(nrCpfCnpj);
        return this;
    }

    public AitBuilder addNrCepProprietario(String nrCep) {
        ait.setNrCepProprietario(nrCep);
        return this;
    }

    public AitBuilder addDsEnderecoProprietario(String dsEndereco) {
        ait.setDsEnderecoProprietario(dsEndereco);
        return this;
    }

    public AitBuilder addNrEnderecoProprietario(String nrEndereco) {
        ait.setNrEnderecoProprietario(nrEndereco);
        return this;
    }

    public AitBuilder addCdAgente(int cdAgente) {
        ait.setCdAgente(cdAgente);
        return this;
    }

    public AitBuilder addCdCidade(int cdCidade) {
        ait.setCdCidade(cdCidade);
        return this;
    }

    public AitBuilder addCdInfracao(int cdInfracao) {
        ait.setCdInfracao(cdInfracao);
        return this;
    }

    public AitBuilder addCdBairro(int cdBairro) {
        ait.setCdBairro(cdBairro);
        return this;
    }

    public AitBuilder addNrPlaca(String nrPlaca) {
        ait.setNrPlaca(nrPlaca);
        return this;
    }

    public AitBuilder addNmMarcaModelo(String nmMarcaModelo) {
        ait.setNmMarcaModelo(nmMarcaModelo);
        return this;
    }

    public AitBuilder addAnoFabricacao(int anoFabricacao) {
        ait.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public AitBuilder addAnoModelo(int anoModelo) {
        ait.setAnoModelo(anoModelo);
        return this;
    }

    public AitBuilder addNrRenavan(String nrRenavan) {
        ait.setNrRenavan(nrRenavan);
        return this;
    }

    public AitBuilder addNmProprietario(String nmProprietario) {
        ait.setNmProprietario(nmProprietario);
        return this;
    }

    public Ait build() {
        return ait;
    }
}
