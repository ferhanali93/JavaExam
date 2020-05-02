package internalExternal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/Users/ferhanali/IdeaProjects/JavaExam/module_02_test/src/main/resources/Key-To-Success");
		int i;
		while ((i=fr.read()) !=-1){
			System.out.print((char)i);
		}


	}
}
/**
 * Use API to read the below textFile and print to console.
 * /src/main/resources/Key-To-Success
 * Use FileReader class, no need to store in buffer
 * Use try....catch block to handle Exception.
 * Use ForEach loop/while loop/Iterator to retrieve data.
 */