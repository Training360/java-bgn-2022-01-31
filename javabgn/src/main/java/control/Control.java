package control;

import java.util.Scanner;

public class Control {

    public char getCharacter(char character) {
        switch (character) {
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'í':
                return 'i';
            case 'ó':
            case 'ö':
            case 'ő':
                return 'o';
            case 'ú':
            case 'ü':
            case 'ű':
                return 'u';
            default:
                return character;
        }
    }

    public static void main(String[] args) {
        Control control = new Control();
//        char result = control.getCharacter('g');
//        System.out.println(result);
//        char result2 = control.getCharacter('ü');
//        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while(!exit.equals("x")) {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            exit = scanner.nextLine();
        }
    }
}
