module br.gov.cbmsc.fln.projetoescalante {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.gov.cbmsc.fln.projetoescalante to javafx.fxml;
    exports br.gov.cbmsc.fln.projetoescalante;
}