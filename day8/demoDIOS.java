import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;


class demoDIOS {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];         

        FileOutputStream fout = new FileOutputStream(fileName);
        DataOutputStream dout=new DataOutputStream(fout);

        dout.writeInt(12);
        dout.writeBoolean(true);
        dout.writeDouble(23.43);
        dout.writeShort(2);
        dout.writeUTF(" good ");
        dout.close();

        
        DataInputStream din = new DataInputStream(new FileInputStream(fileName));
        System.out.println(din.readInt());
        System.out.println(din.readBoolean());
        System.out.println(din.readDouble());
        System.out.println(din.readShort());
        System.out.println(din.readUTF());
        din.close();
    }
}
