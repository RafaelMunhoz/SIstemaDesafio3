package app;

import java.io.IOException;

import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	static Stage stageAtual;
	static FXMLLoader loader;
		
	@Override
	public void start(Stage stage) throws Exception {
		stageAtual = stage;
		loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
		
		Parent root = loader.load();
		Scene scene = new Scene(root, 600, 450);
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void openpage(String rota) throws IOException {
		loader = new FXMLLoader(getClass().getResource(rota));
		Scene scene = new Scene(loader.load());
		stageAtual.setScene(scene);
		stageAtual.show();
	}
}
