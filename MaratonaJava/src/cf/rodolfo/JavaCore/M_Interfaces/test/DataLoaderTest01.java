package cf.rodolfo.JavaCore.M_Interfaces.test;

import cf.rodolfo.JavaCore.M_Interfaces.domain.DataLoader;
import cf.rodolfo.JavaCore.M_Interfaces.domain.DatabaseLoader;
import cf.rodolfo.JavaCore.M_Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		databaseLoader.load();
		fileLoader.load();
		databaseLoader.remove();
		fileLoader.remove();
		databaseLoader.checkPermission();
		DataLoader.retriveMaxDataSize();
		DatabaseLoader.retriveMaxDataSize();
		
	}

}
