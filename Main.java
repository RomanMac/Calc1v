import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] input) throws IOException {
        System.out.println("Введите выражение 2 + 2 (Числа от 1 до 10) или два римских числа от I до X:[V + V] + Enter. ");
        System.out.println("Не забывайте про пробелы.");
        Scanner reader = new Scanner(System.in);
        String inputString = reader.nextLine();
        System.out.println(calc(inputString));
    }
    public static String calc(String input) throws IOException {
        String resultat ="";
        String[] vvod = input.split(" ");
        int can1 = 0, can2 = 0;
        String plus = "0";
        //Rime.Roman.valueOf("X").toInt();
        Rime[] values = Rime.values();
        int stroka = vvod.length;
        if (stroka < 3){
            throw new IOException("Не верный ввод выражения");
        }
        if (stroka > 3) {
            throw new IOException("Превышено число символов. Не верный ввод");
        }

        switch (vvod[0]) {
            case ("I"): {
                can1 = 1;
                break;
            }
            case ("II"): {
                can1 = 2;
                break;
            }
            case ("III"): {
                can1 = 3;
                break;
            }
            case ("IV"): {
                can1 = 4;
                break;
            }
            case ("V"): {
                can1 = 5;
                break;
            }
            case ("VI"): {
                can1 = 6;
                break;
            }
            case ("VII"): {
                can1 = 7;
                break;
            }
            case ("VIII"): {
                can1 = 8;
                break;
            }
            case ("IX"): {
                can1 = 9;
                break;
            }
            case ("X"): {
                can1 = 10;
                break;
            }
        }
        if (can1 > 0) {
            switch (vvod[2]) {
                case ("I"): {
                    can2 = 1;
                    break;
                }
                case ("II"): {
                    can2 = 2;
                    break;
                }
                case ("III"): {
                    can2 = 3;
                    break;
                }
                case ("IV"): {
                    can2 = 4;
                    break;
                }
                case ("V"): {
                    can2 = 5;
                    break;
                }
                case ("VI"): {
                    can2 = 6;
                    break;
                }
                case ("VII"): {
                    can2 = 7;
                    break;
                }
                case ("VIII"): {
                    can2 = 8;
                    break;
                }
                case ("IX"): {
                    can2 = 9;
                    break;
                }
                case ("X"): {
                    can2 = 10;
                    break;
                }
            }
            if (can2 > 0) {
                switch (vvod[1]) {
                    case ("+"): {
                        resultat = String.valueOf(can1 + can2);
                        break;
                    }
                    case ("/"): {
                        resultat = String.valueOf(can1 / can2);
                        break;
                    }
                    case ("*"): {
                        resultat = String.valueOf(can1 * can2);
                        break;
                    }
                    case ("-"): {
                        resultat = String.valueOf(can1 - can2);
                        break;
                    }
                }
                if (resultat.equals(plus)) {
                    throw new IOException("Результат не может быть нулевым");
                }
                resultat = values[Integer.parseInt(resultat)].toString();}
            }
            if (can2 == 0) {
                int one = Integer.parseInt(vvod[0]);
                int two = Integer.parseInt(vvod[2]);
                if (one > 10 || one < 1 && two > 10 || two < 1) {
                    throw new IOException("Не верный ввод данных. Числа должны быть от 1 до 10");
                }

           switch (vvod[1]) {
           case("+"):{resultat= String.valueOf(one+two); break; }
               case("/"):{resultat= String.valueOf(one/two); break; }
            case("*"):{resultat= String.valueOf(one*two); break; }
            case("-"):{resultat= String.valueOf(one-two); break; }
}
} return resultat;
}

    }















