package lessons.java;

//  Draft1_Task2_1_1    Задание_TaskМодуль - Тема - Урок
//  здесь пример: https://stackoverflow.com/questions/43500275/test-interface-implementation-for-simple-calculator

interface Operation {
    void calculate(int a, int b);

    void calculate();
}
public class Draft1_Task2_1_1 {
    static int a = 10;
    static int b = 2;
    static int result = 0;
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tЗадание в рамках интерфейса java нужно создать калькулятор " +
                "\nвыполняющий 4 основных арифметических функций, сложение, вычитание, деление, умножение, " +
                "\nа также осуществить вывод на результатов на экран\n\nРешение: ");
        Operation add = new Operation() {

            @Override
            public void calculate(int a, int b) {
                result = a + b;
                System.out.println("Сложение: " + a + " + " + b + " = " + result);
            }

            @Override
            public void calculate() {

            }
        };
        add.calculate();
    }
}
