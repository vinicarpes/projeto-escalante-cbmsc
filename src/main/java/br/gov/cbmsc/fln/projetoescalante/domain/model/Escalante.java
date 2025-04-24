package br.gov.cbmsc.fln.projetoescalante.domain.model;

import br.gov.cbmsc.fln.projetoescalante.domain.enums.ETipoEscala;

import java.util.List;

public class Escalante {
    private List<Byte> listVacancias;
    private Byte mes;
    private List<Praia> listPraias;
    private List<Gvc> listGvcs;

    public void setListVacancias(List<Byte> listVacancias) {
        this.listVacancias = listVacancias;
    }
    public List<Byte> getListVacancias() {
        return listVacancias;
    }
    public void setListPraias(List<Praia> listPraias) {
        this.listPraias = listPraias;
    }
    public List<Praia> getListPraias() {
        return listPraias;
    }
    public void setListGvcs(List<Gvc> listGvcs) {
        this.listGvcs = listGvcs;
    }
    public List<Gvc> getListGvcs() {
        return listGvcs;
    }

    public void escalar(){}

    public void calcularRemessa(){ //float
        return ;
    }

    public void otimizarEscala(){}
}

