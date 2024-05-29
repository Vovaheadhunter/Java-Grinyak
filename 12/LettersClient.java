import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersClient {
    public static void main(String[] args) throws IOException {
        File file = new File("letters.txt");
        try(FileWriter writer = new FileWriter(file, false))
        {
            String text = "русскийтекстenglishtextсноварусскийтекстenglishtextonceagain";
            writer.write(text);
        }
        try{
            Socket clientSocket = new Socket("localhost", 7777);
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter out = new PrintWriter(outputStream);
            try(BufferedReader reader = new BufferedReader( new FileReader(file, Charset.forName("windows-1251"))) ){
                String l;
                Pattern pattern = Pattern.compile("[A-Za-z]*[A-Za-z]",Pattern.UNICODE_CHARACTER_CLASS);
                while((l = reader.readLine()) != null){
                    Matcher matcher = pattern.matcher(l);
                    while(matcher.find()){
                        out.println(matcher.group());
                        out.flush();
                    }
                }
            }
        }
        catch(java.net.ConnectException ex){
            System.out.println("Не запущен сервер");
        }

    }
}