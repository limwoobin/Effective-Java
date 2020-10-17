package Item7;

import java.io.*;

public class TryWithResources {
    static final int BUFFER_SIZE = 10;

    // try-with-resources 자원을 회수하는 최선책
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))){
            return br.readLine();
        }
    }

    // 복수의 자원을 처리하는 try-with-resources
    static void copy(String src , String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf , 0 , n);
            }
        }
    }

    // try-with-resources 를 catch 절과 함께 쓰는 모습
    static String firstLineOfFile(String path , String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
