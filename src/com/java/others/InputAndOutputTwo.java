package com.java.others;
import com.java.test.Parent;

import java.io.*;

//기존 byte단위로 읽는 FileInput,Ouput클래스를 개선한게 DataInputStream&DataOutputStream이다.
public class InputAndOutputTwo {
    public static void main(String[] args) {
        String str = "hello_ hi";
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        try {

//            InputStream inputStream = null; //복사하기 위한 인풋스트림 선언
//            DataInputStream dataInputStream = null;
            outputStream = new FileOutputStream("C:\\Users\\Seungwon Kwon\\IdeaProjects\\Java_Study2\\hello");
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(str);

//            --파일 읽기 및 복사로직--
//            inputStream = new FileInputStream("C:\\java\\pjt_ex\\helloWorld.txt");
//            dataInputStream = new DataInputStream(inputStream);
//
//            String str = dataInputStream.readUTF();
//
//            outputStream = new FileOutputStream("C:\\java\\pjt_ex\\helloWorldCopy.txt");
//            dataOutputStream = new DataOutputStream(outputStream);
//
//            dataOutputStream.writeUTF(str);



        } catch (Exception e) {
//            e.printStackTrace(); // e.printstackTrace는 JVM내에 메모리상으로 악영향을 끼침 + 웹의경우 보안이슈 존재, 되도록 지양
            System.out.println(e.getMessage());
        } finally {
            try {
                if(dataOutputStream != null) {
                    dataOutputStream.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                if(outputStream != null) {
                    outputStream.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
