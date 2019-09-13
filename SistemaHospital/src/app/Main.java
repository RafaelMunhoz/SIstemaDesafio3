package app;

import java.io.IOException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	static Stage stageAtual;
	static FXMLLoader loader;
	
	@Override
	public void start(Stage Stage) throws Exception {
		stageAtual = Stage;
		
		
	try {
		openpage(Rotas.LOGIN);
		}catch(IOException a) {
			
		}
	}

	public void openpage(String rota) throws IOException {
		
		  loader = new FXMLLoader(getClass().getResource(rota));
			Scene scene = new Scene(loader.load());
			stageAtual.setScene(scene);
			stageAtual.show();
	}
	
	public static void main (String[] args) {
		launch(args);
		Conexao con = new Conexao();
		System.out.println(con.getConnection());
		System.out.println(con.getStatus());
		/*
		 String inserir = "insert into table() values(?, ?, ?)"
		 PreparedStatement stmt = ? 
		 stmt.setInt(4, txtLogin.getText()) 
		  */
		
	}
}