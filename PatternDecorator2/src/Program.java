

import Decorator.DecrypteurInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Program {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("original.txt");
        int c = is.read();
        System.out.println(c);
        System.out.println("File décrypté");
        is = new DecrypteurInputStream(is);
        int d = is.read();
       // System.out.println(d);



    }
}
