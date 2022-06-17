package lesson1;
//test
public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(30), new Water(3), new Wall(5)); // Создаем полосу препятствий
        Team team = new Team("Heroes", new Human("Johny", 50, 3, 5), new Human("Ivan", 80, 40, 17), new Human("Petr", 15, 9, 24), new Human("Marina", 55, 15, 6)); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");// Показываем результаты
        team.showResults();
    }
}
