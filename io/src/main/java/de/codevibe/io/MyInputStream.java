package de.codevibe.io;

import java.io.IOException;
import java.io.InputStream;

public class MyInputStream extends InputStream {

    @Override
    public int read() throws IOException {
        return 'a';
    }

}
