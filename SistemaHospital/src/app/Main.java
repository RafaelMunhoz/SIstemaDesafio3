package app;

import java.io.IOException;


import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	static Stage stageAtual;
	static FXMLLoader loader;

	@Override
	public void start(Stage Stage) throws Exception {
		stageAtual = Stage;

		try {
//			Parent root = loader.load();
//			Scene scene = new Scene(root, 600, 400);
//			scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
//			Stage.setScene(scene);
//			Stage.show();
			openpage(Rotas.LOGIN);
		} catch (IOException a) {
			
		}
	}

	public void openpage(String rota) throws IOException {

		loader = new FXMLLoader(getClass().getResource(rota));
		Scene scene = new Scene(loader.load());
		stageAtual.setScene(scene);
		stageAtual.show();

	}

	public static void main(String[] args) {
		Conexao con = new Conexao();
		con.getConnection();		System.out.println(con.getStatus());
		launch(args);
	}

}