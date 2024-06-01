// Вариант 1
// Обработка текстовых данных с помощью регулярных выражений.
// В научных текстах (статьях) как правило встречается раздел со списком литературы. Ссылки
// на литературные источники имеют правила оформления. Например, один из вариантов
// оформления ссылки на статью выглядит так:
// 1. Бондарев А.Н., Киричек Р.В. Обзор беспилотных летательных аппаратов общего
// пользования и регулирования воздушного движения БПЛА в разных странах.
// Информационные технологии и телекоммуникации. 2016;4(4):13–23.
// Указывается: авторы статьи, название, наименование журнала, год, номер тома (номер
// выпуска), номера страниц.
// Написать регулярное выражение, определяющее шаблон ссылки на литературу. Написать
// функцию, возвращающую true, если переданная ей в параметре строка является ссылкой на
// литературу и false в противном случае.
// Также написать программу, которая находит в тексте, читаемом из файла, все литературные
// источники (по шаблону, задаваемому регулярным выражением) и выводит их на консоль.
// Пример файла прилагается к заданию.
// УКАЗАНИЕ. Внимательно ознакомьтесь со списком литературы в конце файла. Обратите
// внимание, что в названиях журналов могут быть точки, а ссылки на литературу могут быть в
// том числе и английскими.
// Вариант 2
// Сохранение данных в файлах и чтение данных из файла с помощью сериализации.
// Имея в виду первый вариант задания, нужно описать класс Автор, с данными о фамилии и
// инициалах. С помощью механизма регулярных выражений нужно найти в файле со статьёй
// всех авторов, указанных в списке литературы (соответствующих шаблону Иванов А.А. или
// Иванов А.).
// Используя механизм сериализации нужно сохранить всех авторов в файл, а затем прочесть
// его другой программой и вывести на консоль всех зарубежных авторов (типа Thomas A.J.
// или Hou S.). 

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.Charset;


public class Main {

    public static boolean MyPattern(String text){
        Pattern pattern = Pattern.compile("^\\d.*?\\d+;.*\\d+\\.");
        Matcher m1 = pattern.matcher(text);
        return m1.find();
    }

    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/File with paper.txt", Charset.forName("windows-1251")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(MyPattern(line)){
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        List<Author> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/File with paper.txt", Charset.forName("windows-1251")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Pattern p = Pattern.compile("\\s[A-ZА-ЯЁ][a-zа-яё]*\\s([A-ZА-ЯЁ]\\.){1,2}", Pattern.UNICODE_CHARACTER_CLASS);
                Matcher m = p.matcher(line);
                while (m.find()){
                    Pattern p1 = Pattern.compile("\\s.*\\w\\s", Pattern.UNICODE_CHARACTER_CLASS);
                    Matcher m1 = p1.matcher(m.group());
                    Pattern p2 = Pattern.compile("\\s(\\w\\.){1,2}", Pattern.UNICODE_CHARACTER_CLASS);
                    Matcher m2 = p2.matcher(m.group());
                    if (m1.find()&&m2.find()){
                        list.add(new Author(m1.group(),m2.group()));
                    }
                }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("auth.txt"));
            for (Author a : list) {
                writer.write(a+",");
            }
            writer.close();

            BufferedReader reader2 = new BufferedReader(new FileReader("auth.txt"));
            while ((line = reader2.readLine()) != null){
                Pattern p3 = Pattern.compile("\\w*\\s\\s(\\w\\.){1,2}");
                Matcher m3 = p3.matcher(line);
                while(m3.find()){
                    System.out.println(m3.group());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}