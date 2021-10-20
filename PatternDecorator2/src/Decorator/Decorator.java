package Decorator;

import java.io.*;

public abstract class Decorator extends InputStream {
    protected InputStream inputStream;

    public Decorator(InputStream inputStream){

        this.inputStream=inputStream;
    }

    @Override
    public abstract int read();
}
