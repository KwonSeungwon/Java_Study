package com.java.others;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Network {
    public static void main(String[] args) {
        // 네트워크 대상(객체) 사이에 입출력은 InputStream, OutputStream을 이용한다
        // 소켓 : 네트워크상에서 데이터를 주고받기 위한 장치
        // 1. 서버는 클라이언트를 준비하고 있다가 클라이언트의 요청에 반응한다. (클라이언트 -> 요청, 서버 -> 요청을 받아서 처리)
        ServerSocket serverSocket = null; // 숫자는 포트번호임
        Socket socket = null; // 소켓 생성

        try {
            serverSocket = new ServerSocket(9090); // 숫자는 포트번호임
            socket = null; // 소켓 생성

            System.out.println("서버 연결중..");
            socket = serverSocket.accept();
            System.out.println("서버 연결완료!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket != null) {
                    socket.close();
                }
                if(serverSocket != null) {
                    serverSocket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
