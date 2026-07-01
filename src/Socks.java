import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Socks {
    public static void main(String[] args) {

        // ЗАДАЧА 1
        //
        System.out.println("-------------------------------------------------------------");

        Random random = new Random();

        int socksMin = 10;
        int socksMax = 30;
        int socksRange = socksMax - socksMin + 1;

        List<String> socksColors = new ArrayList<>();
        socksColors.add("красные");
        socksColors.add("чёрные");
        socksColors.add("белые");
        socksColors.add("синие");
        socksColors.add("зелёные");

        List<String> noPairs = new ArrayList();

        int socksColorNumber = socksColors.size();
        System.out.println("Кол-во цветов в списке: " + socksColorNumber);

        System.out.println("Список носков по цветам и количеству:");
        for (String socksColor : socksColors) {
            int socksRandomNumber = random.nextInt(socksRange) + socksMin;
            int numberOfPairs = socksRandomNumber / 2;
            String lostPair = "";
            if (socksRandomNumber % 2 == 1) {
                lostPair = ", для одной нет пары";
                noPairs.add(socksColor);
            }

            System.out.println(socksColor + " - " + socksRandomNumber + " шт., парных комплектов " + numberOfPairs + lostPair);
        }
        System.out.println("");
        System.out.println("Для этих цветов нет пары:");


        // Вывод через for с нумерацией строк
        for (int i = 0; i < noPairs.size(); i++) {
            System.out.println((i + 1) + ". " + noPairs.get(i));
        }

        System.out.println("-------------------------------------------------------------");

        // Простой вывод списка через forEach
        for (String noPair : noPairs) {
            System.out.println(noPair);
        }

        System.out.println("-------------------------------------------------------------");

        // Вывод в одну строку через forEach
        noPairs.forEach(noPair -> System.out.println(noPair));

        System.out.println("-------------------------------------------------------------");

        // ЗАДАЧА 2
        int totalSocks = 20; // задаём кол-во носков в списке

        // Задаём базовый, изменяемый список цветов
        List<String> colors = new ArrayList<>();
        colors.add("красный"); // 0 - индекс в списке
        colors.add("белый"); // 1
        colors.add("чёрный"); // 2
        colors.add("синий"); // 3

        System.out.println("Цветов в списке: " + colors.size() + " шт.: " + colors);

        // Генерируем рандомный список цветных носков
        List<String> socks = new ArrayList<>(totalSocks);
        System.out.println("Список носков:");
        for (int i = 0; i < totalSocks; i++) {
            int randomColorIndex = random.nextInt(colors.size());
            String randomColor = colors.get(randomColorIndex);
            socks.add(randomColor);
            System.out.println((i + 1) + ". " + randomColor + " [" + randomColorIndex + "]");
        }

        // Считаем кол-во повторений одного цвета (каких цветов сколько)
        Map<String, Integer> counts = new HashMap<>();

        // Проходим по всем записям списка socks и складываем повторяющиеся
        socks.forEach(color -> {
            counts.put(color, counts.getOrDefault(color, 0) + 1);
        });
        System.out.println("Носков по цветам: ");
        counts.entrySet().stream()
                .sorted(Comparator // сортировка сначала по кол-ву, затем при равенстве по цвету
                        .comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).reversed()
                        .thenComparing(Map.Entry::getKey))
                .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue() + " шт"));


        // Создаём список носков без пары из сформированного маппера counts
        List<String> withoutPair = counts.entrySet().stream() // entrySet - коллекция, stream - поток данных (к нему применяем методы)
                .filter(entry -> entry.getValue() % 2 == 1) // оставляем только нечётные количества, где остаток от деления на 2 = 1
                .map(Map.Entry::getKey) // из Entry делаем String, оставляя лишь Key (цвет)
                .toList(); // собираем в List всё что осталось


        // Сортируем по возрастанию, собираем в коллекцию и записываем в переменную для красивого вывода
        String result = withoutPair.stream()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Цвета с одиночным носком: " + result);
    }
}
