package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadrEx {

    public void readALine() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());
        System.out.println(br.readLine());

    }
}
