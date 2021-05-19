package com.java.others;
import java.io.*;

//BufferedReader, BufferedWirter은 문자를 읽기에 특화된 클래스이다.

public class InputAndOutputThree {
    public static void main(String[] args) {
        //읽기 로직.
        String fileName = "C:\\Users\\Seungwon Kwon\\IdeaProjects\\Java_Study2\\hello";

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String strLine;

            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        /* 쓰기로직
        String fileName = "C:\\java\\pjt\\helloWriter.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String str = "Hello Java World~~\n";
            str += "Hello C World~~\n";
            str += "Hello C++ World~~\n";

            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(str);

            System.out.println("end");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }*/
    }
}
