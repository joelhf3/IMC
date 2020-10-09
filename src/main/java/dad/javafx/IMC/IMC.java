package dad.javafx.IMC;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IMC extends Application {

	private TextField textPeso;
	private TextField textAltura;
	private Label labelPeso;
	private Label labelKg;
	private Label labelAltura;
	private Label labelCm;
	private Label labelImc;
	private Label labelResultado;
	private Label labelEscala;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		labelPeso = new Label();
		labelPeso.setText("Peso:");
		
		textPeso = new TextField();
		textPeso.setPrefColumnCount(5);
		textPeso.setMaxWidth(50);
		textPeso.setAlignment(Pos.CENTER);
		
		labelKg = new Label();
		labelKg.setText("kg");
		
		labelAltura = new Label();
		labelAltura.setText("Altura:");
		
		textAltura = new TextField();
		textAltura.setPrefColumnCount(5);
		textAltura.setMaxWidth(50);
		textAltura.setAlignment(Pos.CENTER);
		
		labelCm = new Label();
		labelCm.setText("cm");

		labelImc = new Label();
		labelImc.setText("IMC:");
		
		labelResultado = new Label();
		labelResultado.setText("(peso * altura^ 2)");
		
		labelEscala = new Label();
		labelEscala.setText("Bajo peso | Normal | Sobrepeso | Obeso");
		
		HBox hboxPeso = new HBox();
		hboxPeso.setSpacing(5);
		hboxPeso.setAlignment(Pos.CENTER);
		hboxPeso.getChildren().addAll(labelPeso, textPeso, labelKg);
		
		HBox hboxAltura = new HBox();
		hboxAltura.setSpacing(5);
		hboxAltura.setAlignment(Pos.CENTER);
		hboxAltura.getChildren().addAll(labelAltura, textAltura, labelCm);
		
		HBox hboxImc = new HBox();
		hboxImc.setSpacing(5);
		hboxImc.setAlignment(Pos.CENTER);
		hboxImc.getChildren().addAll(labelImc, labelResultado);
		
		HBox hboxEscala = new HBox();
		hboxEscala.setSpacing(5);
		hboxEscala.setAlignment(Pos.CENTER);
		hboxEscala.getChildren().addAll(labelEscala);
		
		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hboxPeso, hboxAltura, hboxImc, hboxEscala);
		
		Scene scene = new Scene(vbox, 320, 200);		
		stage.setScene(scene);
		stage.setTitle("IMC");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
