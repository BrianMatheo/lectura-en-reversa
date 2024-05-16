package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mavenproject1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String linea;
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
        file = new File("./data.txt");
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        linea = bufferedReader.readLine();
        System.out.println(linea);
        }catch(Exception e){
            e.printStackTrace();
            }
        linea = bufferedReader.readLine();
        String texto = linea;
        for(int i= texto.length() - 1 ; i >= 0 ; i--){
            System.out.print(texto.charAt(i));
        }
    }
}
