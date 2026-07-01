import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class LeaderBoard {

    // Создадим простой класс для игрока, чтобы хранить имя и опыт
    static class Player {
        String name;
        long experience;

        public Player(String name, long experience) {
            this.name = name;
            this.experience = experience;
        }
    }

    public static void main(String[] args) {
        // 1. Создаем список игроков (имитация базы данных игры)
        List<Player> players = new ArrayList<>();
        players.add(new Player("TheDragonSlayer", 1547119));
        players.add(new Player("MagicUser", 245890));
        players.add(new Player("SwiftNinja", 12005));
        players.add(new Player("Newbie", 45));

        // 2. Сортируем по опыту (от большего к меньшему)
        // Это критически важно для таблицы лидеров!
        players.sort(Comparator.comparingLong(p -> -p.experience));

        // 3. Рисуем заголовок
        printSeparator(true, 22, 14); // true = верхняя граница
        System.out.printf(Locale.getDefault(), "║ %-20s ║ %,12d ║%n", "Игрок", "Опыт");
        printSeparator(false, 22, 14); // false = разделитель между заголовком и телом

        // 4. Выводим каждого игрока
        for (Player player : players) {
            // %-20s -> строка, выровненная по левому краю, занимает 20 символов
            // %,12d -> число с разделителями, занимает минимум 12 символов (выравнивание по правому краю)
            System.out.printf(Locale.getDefault(), "║ %-20s ║ %,12d ║%n", player.name, player.experience);
        }

        // 5. Рисуем нижнюю границу
        printSeparator(true, 22, 14);
    }

    // Вспомогательный метод, чтобы не писать одни и те же символы много раз
    private static void printSeparator(boolean isTop, int nameWidth, int scoreWidth) {
        char left, mid, right, line;

        if (isTop) {
            left = '╔'; mid = '╦'; right = '╗'; line = '═';
        } else {
            left = '╠'; mid = '╬'; right = '╣'; line = '═';
        }

        StringBuilder sb = new StringBuilder();
        sb.append(left);
        sb.append(String.valueOf(line).repeat(nameWidth));
        sb.append(mid);
        sb.append(String.valueOf(line).repeat(scoreWidth));
        sb.append(right);

        System.out.println(sb.toString());
    }
}
