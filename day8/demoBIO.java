import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

class demoBIO {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];  // assumes user provides a filename

        // Write to the file
        FileOutputStream fout = new FileOutputStream(fileName);
        String str = "this is the content which is going to embed into sample1";
        byte[] bystr = str.getBytes();
        fout.write(bystr);
        fout.close();

        // Read from the file
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
        int i;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
    }
}
