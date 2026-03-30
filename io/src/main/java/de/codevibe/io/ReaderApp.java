package de.codevibe.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderApp {

    public static void main(String[] args) throws IOException {
//        Reader reader = new FileReader("blah.txt", StandardCharsets.UTF_8);
//        BufferedReader br = new BufferedReader(reader);
//        for(String line: br.readAllLines()){
//            if(!line.isEmpty()){
//                System.out.println(line);
//            }
//        }


        File directory = new File("./io"); //nimmt das Directory als File

        for (File f:directory.listFiles()){ //durchläuft das Directory
            if (f.exists() && f.isFile()) { //schaut nach einem File, das ein File und kein Verzeichnis ist
                Reader reader = new FileReader(f);
                BufferedReader br = new BufferedReader(reader);
                for(String line:br.readAllLines()){ //liest jede zeile des Files aus
                    if(line.contains("flightNumber")){ // sucht nach FlightNumbers in dem File bzw in der Zeile
                        String number=line.split(":")[1];
                        String out="";
                        for(char c:number.toCharArray()){
                            if(c!='"' && c!=','){
                                out+=c;
                            }
                        }
                        System.out.println(out);
                    }
                }
            }
        }





    }

}
