package com.java.others;

import java.io.*;

//데이터가 입출력되는 공간 : Stream
//입출력 기본클래스 :
// InputStream : FileInputStream, DataInputStream, BufferedInputStream
// OutputStream : FileOutputStream, DataOutputStream, BufferedOutputStream
//FileInputStream & FileOutputStream -> 1바이트 단위로 데이터를 읽으며 read와 write메소드를 이용함.
// Input과 Output을 이용하면 파일을 읽어서 복사 할 수도있다.
public class InputAndOutput {
    public static void main(String[] args) {
        /*
		InputStream inputStream = null;
		try {

			inputStream = new FileInputStream("C:\\java\\pjt_ex\\hello.txt");
			int data = 0;

			while(true) {

				try {
					data = inputStream.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(inputStream != null) inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		*/

        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream("C:\\Users\\Seungwon Kwon\\IdeaProjects\\Java_Study2\\JavaBulidPathTutorial"); // 해당 프로젝트 내에 있는 정리된 파일 읽기.

            int data = 0;
            byte[] bs = new byte[3];

            while (true) {

                try {
                    data = inputStream.read(bs);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (data == -1) break;
                System.out.println("data : " + data);
                for (int i = 0; i < bs.length; i++) {
                    System.out.println("bs[" + i + "] : " + bs[i]);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 파일에 내용 입력하기.
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("C:\\Users\\Seungwon Kwon\\IdeaProjects\\Java_Study2\\hello");
            String data = "Hello java world!!"; // hello java world라는 내용을 파일에 입력하게됨.
            byte[] arr = data.getBytes();

            try {
                outputStream.write(arr);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        // write()
//        OutputStream outputStream2 = null;
//        try {
//
//            outputStream2 = new FileOutputStream("C:\\java\\pjt_ex\\helloW.txt");
//            String data = "Hello java world!!";
//            byte[] arr = data.getBytes();
//
//            try {
//                outputStream2.write(arr, 0, 5);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(outputStream != null) outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
