import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777); //порт
        Scanner ini = new Scanner(System.in);
        String text;
        Socket socket = serverSocket.accept();
        String adress = socket.getRemoteSocketAddress().toString().substring(1);
        System.out.println("Успешное подключение к клиенту "+ adress);
        InputStream inputStream = socket.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter out = new PrintWriter(outputStream, true);

//в цикле обрабатываем входящие соединения.
        while (true)
        {
            //метод accept ждет, пока кто-то не подключится.

            //читаем сообщение
            try {
                String message = in.readLine();
                System.out.println(message);
            }
            catch (java.net.SocketException ex){
                System.out.println("Клиент " + adress + " разорвал соединение :(");
                socket.close();
                break;
            }

            System.out.print(">> ");
            text = ini.nextLine();

            //отправляем ответ
            out.println(adress+">> "+text);
            out.flush();

        }
    }
}