package pokemon;
import java.util.Scanner;
public class PokemonRunner {
    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the world of Pokemon!");
        System.out.println("Let's choose a pokemon, torchic, snivy, or oshowatt");
        System.out.println("press 1, 2, or 3");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int pokemon_number = Integer.parseInt(input);
        if (pokemon_number == 1) {
            Pokemon first_pokemon = new Pokemon(10, 1, 2, "torchic");
            System.out.println(first_pokemon);
            Pokemon enemy_pokemon = new Pokemon(10, 1, 2, "oshowatt");
            System.out.println(enemy_pokemon);
        }
        else if (pokemon_number == 2) {
            Pokemon first_pokemon = new Pokemon(10, 1, 2, "snivy");
            System.out.println(first_pokemon);
            Pokemon enemy_pokemon = new Pokemon(10, 1, 2, "torchic");
            System.out.println(enemy_pokemon);
        }
        else if (pokemon_number == 3) {
            Pokemon first_pokemon = new Pokemon(10, 1, 2, "oshowatt");
            System.out.println(first_pokemon);
            Pokemon enemy_pokemon = new Pokemon(10, 1, 2, "snivy");
            System.out.println(enemy_pokemon);
        }
    }
}
