import java.util.HashSet;

public class Turtle {
    public static void main(String[] args) {
        System.out.println(crossing("urruld"));
        System.out.println(crossing("rulur"));
        System.out.println(crossing("urxld"));
    }

    public static boolean crossing(String route) {
        HashSet<String> coordinates = new HashSet<>();
        int x = 0;
        int y = 0;
        coordinates.add(x + ";" + y);
        char[] chars = route.toCharArray();
        for (char move : chars) {
            switch (move) {
                case 'u': y++; break;
                case 'd': y--; break;
                case 'r': x++; break;
                case 'l': x--; break;
                default: throw new IllegalArgumentException("Некорректный символ: " + move);
            }
            String coordinate = x + ";" + y;
            if (coordinates.contains(coordinate)) {
                return true;
            }
            coordinates.add(coordinate);
        }
        return false;
    }
}
