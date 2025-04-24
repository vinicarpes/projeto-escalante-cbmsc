package br.gov.cbmsc.fln.projetoescalante.domain.model;

import br.gov.cbmsc.fln.projetoescalante.domain.enums.ETipoEscala;

import java.util.List;

public class Praia {
    private String sigla;
    private String nome;
    private ETipoEscala tipoEscala;
    private List<Byte> listNecessidade;
}
