public class Main { // Вот эта строчка показывает системе где находится наш файл.
    public static void main(String[] args) { // Что означает эта строчка?
        BmiService calculate = new BmiService(); // Здесь мы подключаем метод. Насколько я понял подгружаем его из другого одноимённого файла где идут расчёты
        double massEffect = calculate.calculate (90, 1.8); // В этой строке написана переменная куда ставятся вес и рост. Но почему здесь написано calculate.calculate?
        System.out.println(massEffect); // Вывел значение на экран.
    }
}