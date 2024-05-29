import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 7777;
        try{
            Socket clientSocket = new Socket(host, port);
            String local = clientSocket.getLocalAddress().toString().substring(1);
            System.out.println("Успешное подключение к серверу "+ local +" "+ clientSocket.getPort());
            Scanner ini = new Scanner(System.in);
            String text;
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter out = new PrintWriter(outputStream);
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

            while (true){
                System.out.print(">> ");
                text = ini.nextLine();
                out.println(local +":"+ clientSocket.getPort()+">> "+text);
                out.flush();

                System.out.println("Ответ от сервера "+in.readLine());
            }
        }
        catch (java.net.ConnectException ex){
            System.out.println("Не удалось подключиться к "+ host + " " + port);
        }

    }
}