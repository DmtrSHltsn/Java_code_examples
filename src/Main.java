import java.util.Random;
import java.math.BigDecimal;
import java.lang.IO;

public class Main {
    public static void main(String[] args) {

    /*
    Опыт персонажа в игре
     */
        // Для внутреннего подсчета опыта можно использовать double
        double npcExpValue = 1546651.56; // Текущий опыт песонажа
        npcExpValue += 468.36; // Полученный опыт за выполнение квеста

        // Выводим внутренне значение опыта (как записано в памяти)
        System.out.println("Опыт персонажа в игре после выполнения квеста: " + npcExpValue + " очков");

        // Для видимого игроком опыта используем long (int может не хватить)
        // При выводе на экран используем математическое округление (0.5 -> 1)
        long visibleExpValue = Math.round(npcExpValue);

        // Выводим значение опыта для игрока
        System.out.println("Отображаемый на экране опыт: " + visibleExpValue);

        // Выводим опыт в форматированной виде
        System.out.printf("Красиво на экране: %,d EXP%n", visibleExpValue);
        System.out.println("-----------------------------------------------------------------------");


    /*
    Работа с финансовыми задачами только через класс BigDecimal
     */
        BigDecimal bankAccountBalance = new BigDecimal("1000000.02"); // Иницилизируем переменную и задаем баланс на счете
        BigDecimal clientDeposit = new BigDecimal("50.22"); // Иницилизируем переменную и указываем размер депозита
        bankAccountBalance = bankAccountBalance.add(clientDeposit);
        System.out.println("На вашем счету " + bankAccountBalance + " $");

        System.out.println("-----------------------------------------------------------------------");

    /*
    Кол-во пассажиров в лифте
     */
        int personWeight; // Определяем целочисленную переменную для веса пассажира
        int maxElevatorWeight; // Определяем целочисленную переменную для максимальной грузоподъёмности лифта
        int peopleInElevator; // Определяем целочисленную переменную для кол-ва пассажиров в лифте
        personWeight = 150; // Устанавливаем максимальный вес пассажира
        maxElevatorWeight = 1400; // Устанавливаем максимальную грузоподъёмность лифта
        peopleInElevator = maxElevatorWeight / personWeight; // Вычисляем кол-во пассажиров делением грузоподъёмности на максимальный вес пассажира
        System.out.print("Лифт может поднять не более ");
        System.out.print(peopleInElevator);
        System.out.println(" человек");
        System.out.println("-----------------------------------------------------------------------");
    /*
    Кол-во юбилеев со дня свадьбы
     */
        var yersAfterWedding = 24; // Задаём значение переменной для кол-ва прошедших после свадьбы лет
        var yearsForAnniversaries = 5; // Задаём кол-во лет для юбилеев
        var numberOfAnniversaries = yersAfterWedding / yearsForAnniversaries; // Считаем кол-во юбилеев
        System.out.println("Кол-во юбилеев " + numberOfAnniversaries);
        System.out.println("-----------------------------------------------------------------------");
    /*
    Выводим символы из таблицы символов ДО (- i) или ПОСЛЕ (+ i) требуемого.
    Используется явное приведение типа (explicit type casting) (char), чтобы значение сначало стало int,
    с ним произвелось арифметическое действие, а уже потом в переменную записалось значение символа из таблицы.
     */
        for (int i = 0; i < 20; i++) {
            char myLetter1 = (char) ('A' + i); // Добавляем к числовому значению символа смещение из цикла и записываем в переменную символ
            int myLetter1inUNICODE = myLetter1; // Записываем числовое значение символа в отдельгую переменную
            System.out.println(myLetter1 + " - " + myLetter1inUNICODE + " ; ");
        }
        System.out.println("-----------------------------------------------------------------------");

    /*
    Варианты вывода значений со смещением вперед и назад
     */
        var testNum = 10;
        System.out.println("Тествое число = " + testNum); // Выводим тестовое число (10)
        System.out.println("Следующее за ним число = " + ++testNum); // Смещаемся перед выводом на 1 значение вперед и выводим значение (11)
        System.out.println("Добавим еще 2, получится = " + (testNum += 2)); // Добавляем перед выводм к 11 еще 2 (без скобок не работает) (13)
        System.out.println("Перейдем на одно число назад, получим = " + --testNum); // Смещаемся перед выводом на одно значение назад (12)
        System.out.println("Умножим " + testNum + " на 2, получим = " + (testNum *=2)); // Умножаем 12 на 2 и выводим значение (24)
        testNum++; // Не выводя на экран сообщение, смещаемся на одно значение вперед (25)
        System.out.println("Следующее за ним число = " + testNum++); // Выводим значение переменной (25), а в переменную записываем плюс 1 (26)
        System.out.println("А после него = " + testNum); // Выводим значение переменной (26)
        System.out.println("-----------------------------------------------------------------------");
    /*
    Викторина "реши пазл"
     */
        Random prizeRandom = new Random(); // Объявляем переменную которая ссылается на новый экземпляр класса Random
        int basePrize = 500; // Задаем нижний уровень выигрыша
        int maxPrize = 1000; // Задаем верхний уровень выигрыша
        int prizeStep = 50; // Задаем шаг выигрыша
        int randomCounter = (maxPrize - basePrize) / prizeStep; // Вычисляем счетчик Random 1000/500=500 и 500/50=10 (Кол-во возможных вариантов выигрыша)
        int winnersPrize = basePrize + prizeStep * prizeRandom.nextInt(randomCounter + 1); // складываем базовый выигрыш 500р с бонусом (шаг 50р * randomCounter+1)
        System.out.println("Реши пазл и выиграй от " + basePrize + " до " + maxPrize + " рублей!");
        String unsolvedPuzzle = "NE?E! GI?E A SUC@E! AN E?EN B!EA@"; // Вводим строковую переменную для загадки
        System.out.println(unsolvedPuzzle); // Выводим загадку на экран
        String solvedPuzzle = unsolvedPuzzle.replace('?', 'V').replace('!', 'R').replace('@', 'K'); // Производим замену символов
        System.out.println(solvedPuzzle); // Выводим решение
        System.out.println("Поздравляем! Ваш выигрыш составил " + winnersPrize + " рублей!");
        System.out.println("-----------------------------------------------------------------------");
    /*
    Рандом
     */
        Random newRandom = new Random();
        System.out.println("Пример простого рандома от 0 до 100 -> " + newRandom.nextInt(100));
        System.out.println("-----------------------------------------------------------------------");
    /*
    Замена на малый регистр
     */
        String lowerChars = solvedPuzzle.toLowerCase();
        System.out.println(lowerChars);
        System.out.println("-----------------------------------------------------------------------");
    /*
    Замена не символов, а целых выражений
     */
        String replaceChars = lowerChars.replace("never", "always");
        System.out.println(replaceChars);
        System.out.println("-----------------------------------------------------------------------");
    /*
    Игра угадай число
     */
        String userChoice = IO.readln("Сыграем в игру Угадай число ? ( yes / no ) ");
        if (userChoice.equals("yes")) {
            System.out.println("Хорошо, тогда давайте начнем!");
            String HiddenValueBegin = IO.readln("Укажите ОТ какого значения я могу загадать число -> ");
            int HiddenNumberBegin = Integer.parseInt(HiddenValueBegin);
            String HiddenValueEnd = IO.readln("Теперь укажите ДО какого значения я могу загадать число -> ");
            int HiddenNumberEnd = Integer.parseInt(HiddenValueEnd);
            System.out.println("Отлично, значит я могу загадать число от " + HiddenNumberBegin + " до " + HiddenNumberEnd);
            Random HiddenValue = new Random();
            int HiddenNumber = HiddenValue.nextInt((HiddenNumberEnd - HiddenNumberBegin) + 1) + HiddenNumberBegin;
            System.out.println("Ну что же, я загадал число, теперь посмотрим, сможете ли вы его разгадать!");
            // System.out.println(HiddenNumber);
            String userInputValue = IO.readln("Введите число которое вы думаете я загадал -> ");
            int userInputNumber = Integer.parseInt(userInputValue);
            if (userInputNumber == HiddenNumber) {
                System.out.println("***** Вы выиграли! ***** ");
            } else {
                System.out.println("Вы проиграли, загаданное число было: " + HiddenNumber);
            }
        } else {
            if (userChoice.equals("no")) {
                System.out.println("Жаль! Ну может в следующий раз ... ");
            }
        }
        System.out.println("-----------------------------------------------------------------------");
    /*
    Игра угадай пароль
     */
        System.out.println("Для продолжения работы в системе, необходимо авторизоваться");
        String correctPassword = "swordfish";
        int passwordCounter = 5;
        int cycleCounter = passwordCounter;
        for (int i = 0; i < cycleCounter; i++) {
            String userInputPassword = IO.readln("Введите пароль (осталось попыток " + passwordCounter + ") -> ");
            if (userInputPassword.equals(correctPassword)) {
                i = passwordCounter; // принудительно завершаем цикл
                System.out.println("Пароль верный! Добро пожаловать в систему");
            } else {
                System.out.println("Неверный пароль :(");
                --passwordCounter;
                if (passwordCounter == 0) {
                    System.out.println("Вы исчерпали все попытки, вход невозможен");
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------");

    }
}