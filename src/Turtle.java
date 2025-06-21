import java.util.HashSet;

public class Turtle {
    public static void main(String[] args) {
        System.out.println(crossing("urruld"));
        System.out.println(crossing("rulur"));
    }

    public static boolean crossing(String route) {
        HashSet<String> coordinates = new HashSet<>();
        int x = 0;
        int y = 0;
        coordinates.add(x + ";" + y);
        char[] chars = route.toCharArray();
        for (char move : chars) {
            if (move == 'u') {
                y++;
            }
            if (move == 'd') {
                y--;
            }
            if (move == 'r') {
                x++;
            }
            if (move == 'l') {
                x--;
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
