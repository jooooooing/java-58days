package ch2;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {

    public void readAChar() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        int ascciCode = isr.read();

        System.out.println(ascciCode);
    }
}
