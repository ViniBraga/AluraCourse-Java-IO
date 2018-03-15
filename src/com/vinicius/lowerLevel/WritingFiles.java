package com.vinicius.lowerLevel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WritingFiles {

  public static void main(String[] args) throws IOException {

    /** Input */
    InputStream is = new FileInputStream("A.txt");
    // OR:
    //InputStream is = System.in; // To capture text from the keyboard
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);    
    
    /** Output */
    OutputStream os = new FileOutputStream("Exit.txt");
    // OR:
    //OutputStream os = System.out; // To write on the console
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);

    String linha = br.readLine();
    while(linha!=null){
        System.out.println(linha);
        bw.append(linha);
        bw.newLine();
        linha = br.readLine();
    }

    br.close();
    bw.close();

  }
}
