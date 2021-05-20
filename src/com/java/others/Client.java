package com.java.others;

import java.net.Socket;
import java.io.*;
import java.util.Scanner;

//클라이언트(사용자)
public class Client {
    public static void main(String[] args) {

        Socket socket = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        Scanner scanner = null;

        try {

            socket = new Socket("localhost", 9000);
            System.out.println("서버 연결 완료~~");

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream); // DataOutPutStream으로 확장

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            scanner = new Scanner(System.in);

            while (true) {
                System.out.println("메시지 입력~~");
                String outMessage = scanner.nextLine();
                dataOutputStream.writeUTF(outMessage);
                dataOutputStream.flush();

                String inMessage = dataInputStream.readUTF();
                System.out.println("inMessage : " + inMessage);

                if(outMessage.equals("STOP")) break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if(dataOutputStream != null) dataOutputStream.close();
                if(outputStream != null) outputStream.close();
                if(dataInputStream != null) dataInputStream.close();
                if(inputStream != null) inputStream.close();

                if(socket != null) socket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
