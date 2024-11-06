package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {

    public void plusTwoNums() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.readLine() + br.readLine());

    }
}
