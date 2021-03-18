package stud.viko.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Class that creates server
 */
public class Server {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;
    private static Scanner scanner = new Scanner(System.in);
    public final static int SOCKET_PORT = 13267;  // you may change this
    public final static String FILE_TO_SEND = "C:/Users/Raevon/Desktop/player.xml"; // you may change this

    /**
     * void method that starts server in main class
     * @throws IOException exception to catch errors
     */
        public void start() throws IOException {

            FileInputStream fis = null;
            BufferedInputStream bis = null;
            OutputStream os = null;
            ServerSocket servsock = null;
            Socket sock = null;
            try {
                servsock = new ServerSocket(SOCKET_PORT);
                while (true) {
                    System.out.println("Waiting...");
                    try {
                        sock = servsock.accept();
                        System.out.println("Accepted connection : " + sock);
                        // send file
                        File myFile = new File (FILE_TO_SEND);
                        byte [] mybytearray  = new byte [(int)myFile.length()];
                        fis = new FileInputStream(myFile);
                        bis = new BufferedInputStream(fis);
                        bis.read(mybytearray,0,mybytearray.length);
                        os = sock.getOutputStream();
                        System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
                        os.write(mybytearray,0,mybytearray.length);
                        os.flush();
                        System.out.println("Done.");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (bis != null) bis.close();
                        if (os != null) os.close();
                        if (sock!=null) sock.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (servsock != null) servsock.close();
            }
        }
}
