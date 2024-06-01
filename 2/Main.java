// Вариант 1
// Создайте класс MyTime для представления времени. Класс MyTime должен содержать:
//  Поля данных hour, minute и second, которые представляют время.
//  Безаргументный конструктор, который создает объект типа MyTime для текущего
// времени. (Значения полей данных этого объекта представляют текущее время.)
//  Конструктор, который создает объект типа MyTime с указанным временем в
// миллисекундах, прошедших с 00:00, 1 января 1970 г. (Значения полей данных этого
// объекта будут представлять это время.)
//  Конструктор, который создает объект типа MyTime с указанными часами,
// минутами и секундами.
//  Три getter-метода для полей данных hour, minute и second соответственно.
//  Метод с именем setTime(long elapseTime), который присваивает объекту новое
// время с помощью прошедшего времени. Например, если прошедшее время
// равно 555550000 миллисекундам, то hour равно 10, minute равно 19,
// а second равно 10.
// Напишите клиент этого класса — программу, которая создает три объекта
// типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23,
// 55)) и отображает значениях их полей данных hour, minute и second в
// формате часы:минуты:секунды.
// (Подсказка: первые два конструктора извлекут значения hour, minute и second из
// прошедшего времени. Для безаргументного конструктора текущее время может быть
// получено с помощью метода System.currentTimeMillis())
// Вариант 2
// Создайте класс с именем StopWatch для представления секундомера.
// Класс StopWatch должен содержать:
//  Скрытые поля данных startTime и endTime с getter-методами.
//  Безаргументный конструктор, который инициализирует startTime с текущим
// временем.
//  Метод с именем start(), который сбрасывает startTime до текущего времени.
//  Метод с именем stop(), который присваивает endTime текущее время.
//  Метод с именем getElapsedTime(), который возвращает прошедшее время на
// секундомере в миллисекундах.
// Напишите клиент этого класса – программу, которая вычисляет время выполнения
// сортировки 100 000 (или более) чисел методом пузырька.

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1.hour+ ":"+time1.minute+ ":"+ time1.second);

        MyTime time2 = new MyTime(555550000);
        System.out.println(time2.hour+ ":"+time2.minute+ ":"+ time2.second);

        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println(time3.hour+ ":"+time3.minute+ ":"+ time3.second);

        time3.setTime(555550000);

        System.out.println(time3.hour+ ":"+time3.minute+ ":"+ time3.second);
        System.out.println(time3.GetHour()+ ":"+time3.GetMin()+ ":"+ time3.GetSec());

        Random random = new Random();
        int[] mass = random.ints(100000, 10,100000).toArray();
        StopWatch s1 = new StopWatch();
        s1.start();
        bubbleSort(mass);
        s1.stop();
        System.out.println("Время работы программы: "+s1.getElapsedTime());

        }
    public static void bubbleSort(int[] sortArr) {
        int swap;
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

}