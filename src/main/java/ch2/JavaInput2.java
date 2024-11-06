package ch2;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {

    public void readTwoChars() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println(isr.read());
        System.out.println(isr.read());

    }
}
