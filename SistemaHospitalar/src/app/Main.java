package app;

import java.io.IOException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.util.Rotas;
//import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent; -> usado somente na declaração da variável root 
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	static Stage stageAtual;
	static FXMLLoader loader;

	@Override
	public void start(Stage stage) throws Exception {
		stageAtual = stage;
		openpage(Rotas.MEDICO);

//		loader = new FXMLLoader(getClass().getResource(Rotas.PESSOA));  -- Codigo grande virou método openpage 
//		Parent root = loader.load();
//		Scene scene = new Scene(root, 600, 450);
//		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
//		stage.setScene(scene);
//		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
		Conexao con = new Conexao();	
		System.out.println("HELLO");
		System.out.println(con.getConnection());
		System.out.println(con.getStatus());
	}

	public void openpage(String rota) throws IOException {
		loader = new FXMLLoader(getClass().getResource(rota));
		Scene scene = new Scene(loader.load());
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		stageAtual.setScene(scene);
		stageAtual.show();
	}
}