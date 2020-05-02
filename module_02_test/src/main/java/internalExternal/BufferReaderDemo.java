package internalExternal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/ferhanali/IdeaProjects/JavaExam/module_02_test/src/main/resources/Key-To-Success");
        BufferedReader br = new BufferedReader(fr);


        int i;
        while ((i=br.read()) !=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();

        /**
         *
         *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
         *
         * */
    }
}