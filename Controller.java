import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnSalir;

    @FXML
    private ImageView imgMascotas;

    @FXML
    private Label lblDatos;

    @FXML
    private Label lblEdad;

    @FXML
    private Label lblEspecie;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblRaza;

    @FXML
    private Label lblRegistro;

    @FXML
    private Label lblResultados;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;

    @FXML
    private TextArea txtResultados;
    
    private Mascota mascota;

    @FXML
    void AgregarRaza(ActionEvent event) {

    }

    @FXML
    void agregarEdad(ActionEvent event) {

    }

    @FXML
    void agregarEspecie(ActionEvent event) {

    }

    @FXML
    void agregarMascotas(ActionEvent event) {

    }

    @FXML
    void agregarNombre(ActionEvent event) {

    }

    @FXML
    void agregarResultados(MouseEvent event) {

    }

    @FXML
    void mostrarMascotas(ActionEvent event) {

    }

    @FXML
    void salirFormulario(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'Untitled'.";
        assert btnMostrar != null : "fx:id=\"btnMostrar\" was not injected: check your FXML file 'Untitled'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'Untitled'.";
        assert imgMascotas != null : "fx:id=\"imgMascotas\" was not injected: check your FXML file 'Untitled'.";
        assert lblDatos != null : "fx:id=\"lblDatos\" was not injected: check your FXML file 'Untitled'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'Untitled'.";
        assert lblEspecie != null : "fx:id=\"lblEspecie\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert lblRaza != null : "fx:id=\"lblRaza\" was not injected: check your FXML file 'Untitled'.";
        assert lblRegistro != null : "fx:id=\"lblRegistro\" was not injected: check your FXML file 'Untitled'.";
        assert lblResultados != null : "fx:id=\"lblResultados\" was not injected: check your FXML file 'Untitled'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'Untitled'.";
        assert txtEspecie != null : "fx:id=\"txtEspecie\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtRaza != null : "fx:id=\"txtRaza\" was not injected: check your FXML file 'Untitled'.";
        assert txtResultados != null : "fx:id=\"txtResultados\" was not injected: check your FXML file 'Untitled'.";

    }

}
