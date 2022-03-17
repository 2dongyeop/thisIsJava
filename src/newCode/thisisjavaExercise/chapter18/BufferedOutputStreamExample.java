package newCode.thisisjavaExercise.chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("img01.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("img01-copy.jpg");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();

        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용하지 않았을 때: " + (end-start) + "ms");

        fis = new FileInputStream("img01.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("img01-copy.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();

        fos.close();
        bis.close();
        fis.close();
        bos.close();
        System.out.println("사용했을 때: " + (end-start) + "ms");
    }
}
