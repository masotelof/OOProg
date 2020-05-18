import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.sql.*;

public class GUI_Estudiante {
    public TextField txtNUA;
    public TextField txtNombre;
    public TextField txtSemestre;
    public ComboBox<String> cmbCarrera;
    public Button btnConectar;
    public Button btnDesconectar;

    private Connection connection=null;

    public void clicConectar(ActionEvent actionEvent) {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:Estudiantes.db");

            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Carrera");

            this.cmbCarrera.getItems().clear();
            while(resultSet.next()){
                this.cmbCarrera.getItems().add(String.format("%d - %s", resultSet.getInt("idCarrera"), resultSet.getString("Desc")));
            }

            this.btnDesconectar.setDisable(false);
            this.btnConectar.setDisable(true);
            message("Conexión Establecida", "Información", Alert.AlertType.INFORMATION);
        } catch (Exception ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        }
    }

    public void clicDesconectar(ActionEvent actionEvent) {
        try {
            this.connection = null;
            this.btnDesconectar.setDisable(true);
            this.btnConectar.setDisable(false);
            message("Conexión Eliminada", "Información", Alert.AlertType.INFORMATION);
        } catch (Exception ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        }
    }

    public void clicAgregar(ActionEvent actionEvent) {
        try {
            String selectedCarrera = this.cmbCarrera.getSelectionModel().getSelectedItem();
            Integer Carrera = Integer.valueOf(selectedCarrera.split("-")[0].trim());
            String NUA = this.txtNUA.getText();
            String Nombre = this.txtNombre.getText();
            Integer Semestre = Integer.valueOf(txtSemestre.getText().trim());

            Statement statement = this.connection.createStatement();
            statement.execute(String.format("INSERT INTO Estudiante(NUA, Nombre, Semestre, idCarrera) VALUES ('%s', '%s', %d, %d)",
                    NUA, Nombre, Semestre, Carrera));
            message("El estudiante se Agrego de manera Correcta", "Información", Alert.AlertType.INFORMATION);
        } catch (SQLException ex){
            if (ex.getMessage().contains("UNIQUE constraint")){
                message("Ya existe un Estudiante con ese NUA", "Error", Alert.AlertType.ERROR);
            }
        } catch (Exception ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        }
    }

    public void clicEliminar(ActionEvent actionEvent) {
        try {

        } catch (Exception ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        }
    }

    public void clicModificar(ActionEvent actionEvent) {
        try {
            String selectedCarrera = this.cmbCarrera.getSelectionModel().getSelectedItem();
            Integer Carrera = Integer.valueOf(selectedCarrera.split("-")[0].trim());
            String NUA = this.txtNUA.getText();
            String Nombre = this.txtNombre.getText();
            Integer Semestre = Integer.valueOf(txtSemestre.getText().trim());

            Statement statement = this.connection.createStatement();
            statement.execute(String.format("UPDATE Estudiante SET Nombre='%s', Semestre=%d, idCarrera=%d  WHERE NUA='%s'",
                    Nombre, Semestre, Carrera, NUA));
            message("El estudiante se Modifio de manera Correcta", "Información", Alert.AlertType.INFORMATION);
        } catch (SQLException ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        } catch (Exception ex){
            message(ex.getMessage(), "Error", Alert.AlertType.ERROR);
        }
    }

    private void message(String Mensaje, String Cabecera, Alert.AlertType Tipo){
        Alert msg = new Alert(Tipo);
        msg.setHeaderText(Mensaje);
        msg.setTitle(Cabecera);
        msg.showAndWait();
    }
}
