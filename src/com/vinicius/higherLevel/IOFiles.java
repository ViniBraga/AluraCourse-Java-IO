package com.vinicius.higherLevel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IOFiles {
  
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new FileInputStream("A.txt"));
    PrintStream ps = new PrintStream("Exit.txt");
    while(sc.hasNextLine()){
        String linha = sc.nextLine();
        ps.println(linha);
    }
    ps.close();
    sc.close();
  }
  
}
