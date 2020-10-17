package Item7;

import java.io.*;

public class TryFinally {
    static final int BUFFER_SIZE = 10;

    // 자원이 하나일때 회수
    static String firstLineofFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    // 자원이 둘 이상일때, -> try finally 방식은 굉장히 지저분함.
    static void copy(String src , String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf , 0 , n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
