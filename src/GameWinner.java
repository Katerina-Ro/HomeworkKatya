/**
 * Необходимо написать функцию, которая на вход получает массив строк, в формате имя_игрока количество_очков.
 * 	Необходимо вывести победителя данной игры. Победителем считается тот, кто раньше набрал максимальное количество очков.
 * 	Входные данные = "Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"
 */

public class GameWinner {
    public static void main(String[] args) {
        String[] array = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        Gamer.calculateTheWinner(array);
    }
}
