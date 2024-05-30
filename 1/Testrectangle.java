
/*
По примеру класса Circle (из примера программы к разделу 1 и 2) создайте класс Rectangle 
для представления прямоугольника. Класс Rectangle должен содержать:
 Два поля данных типа double с именами width и height, задающими ширину и 
высоту прямоугольника. Значение по умолчанию: -1 как для ширины, так и для 
высоты.
 Безаргументный конструктор, создающий прямоугольник с указанными по 
умолчанию значениями.
 Конструктор, создающий прямоугольник с указанными шириной и высотой.
 Метод с именем getArea(), возвращающий площадь этого прямоугольника.
 Метод с именем getPerimeter(), возвращающий периметр.
Напишите клиент этого класса - программу, которая создает два объекта типа Rectangle: 
первый - с шириной 4 и высотой 40, а второй - с шириной 3.5 и высотой 35.9. Программа 
также должна отображать ширину, высоту, площадь и периметр каждого прямоугольника 
в указанном порядке
*/

public class Main
{
    public static void main(String[] args) {
        Rectangle Rectangle1 = new Rectangle();
         System.out.println("Площадь прямоугольника c шириной " + Rectangle1.width + " и длиной " + Rectangle1.height + " равна " + Rectangle1.getArea());
         System.out.println("Периметр прямоугольника c шириной " + Rectangle1.width + " и длиной " + Rectangle1.height + " равен " + Rectangle1.getPerimetr());
        Rectangle Rectangle2 = new Rectangle(4, 40);
         System.out.println("Площадь прямоугольника c шириной " + Rectangle2.width + " и длиной " + Rectangle2.height +  " равен " + Rectangle2.getArea());
         System.out.println("Периметр прямоугольника c шириной " + Rectangle2.width + " и длиной " + Rectangle2.height + " равен " + Rectangle2.getPerimetr());
        Rectangle Rectangle3 = new Rectangle(3.5, 35.9);
         System.out.println("Площадь прямоугольника c шириной " + Rectangle3.width + " и длиной " + Rectangle3.height +  " равен " + Rectangle3.getArea());
         System.out.println("Периметр прямоугольника c шириной " + Rectangle3.width + " и длиной " + Rectangle3.height + " равен " + Rectangle3.getPerimetr());
    }
}
