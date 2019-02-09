import java.util.Scanner;

public class fm {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String chatmessage = in.nextLine(); // Перехват сообщения из чата.

        if (chatmessage.matches("(^%)(\\d+)")) // Проверка соответствия сообщения шаблону %[число].
        {
            String chatmessagenew = chatmessage.replaceAll("%", "");
            int bottom_line = 1;
            int random_number = bottom_line + (int) (Math.random() * 7); // Генерация модификатора к броску
            int modificator1;

            switch (random_number) {
                case 1:
                    modificator1 = -1;
                    break;
                case 2:
                    modificator1 = 0;
                    break;
                case 3:
                    modificator1 = 1;
                    break;
                default:
                    modificator1 = 0;
                    break;

            }

            random_number = bottom_line + (int) (Math.random() * 3); // Генерация модификатора к броску

            int modificator2;


            switch (random_number) {
                case 1:
                    modificator2 = -1;
                    break;
                case 2:
                    modificator2 = 0;
                    break;
                case 3:
                    modificator2 = 1;
                    break;
                default:
                    modificator2 = 0;
                    break;

            }

            random_number = bottom_line + (int) (Math.random() * 3); // Генерация модификатора к броску

            int modificator3;


            switch (random_number) {
                case 1:
                    modificator3 = -1;
                    break;
                case 2:
                    modificator3 = 0;
                    break;
                case 3:
                    modificator3 = 1;
                    break;
                default:
                    modificator3 = 0;
                    break;

            }

            int chatmessagenewint = Integer.parseInt(chatmessagenew);
            int result = chatmessagenewint + modificator1 + modificator2 + modificator3;

            System.out.println("Бросает кубик от [" + chatmessagenewint + "], модификатор [" + modificator1 + ";" + modificator2 + ";" + modificator3 + "], в сумме [" + result + "]");

        } else {
            if (chatmessage.matches("(^%)([-])(\\d+)")) // Проверка соответствия сообщения шаблону %[отрицательное число].
            {
                String chatmessagenew_1 = chatmessage.replaceAll("%", "");
                String chatmessagenew = chatmessagenew_1.replaceAll("-", "");

                int bottom_line = 1;
                int random_number = bottom_line + (int) (Math.random() * 3); // Генерация модификатора к броску
                int modificator1;

                switch (random_number) {
                    case 1:
                        modificator1 = -1;
                        break;
                    case 2:
                        modificator1 = 0;
                        break;
                    case 3:
                        modificator1 = 1;
                        break;
                    default:
                        modificator1 = 0;
                        break;

                }

                random_number = bottom_line + (int) (Math.random() * 3); // Генерация модификатора к броску

                int modificator2;


                switch (random_number) {
                    case 1:
                        modificator2 = -1;
                        break;
                    case 2:
                        modificator2 = 0;
                        break;
                    case 3:
                        modificator2 = 1;
                        break;
                    default:
                        modificator2 = 0;
                        break;

                }

                random_number = bottom_line + (int) (Math.random() * 3); // Генерация модификатора к броску

                int modificator3;

                switch (random_number) {
                    case 1:
                        modificator3 = -1;
                        break;
                    case 2:
                        modificator3 = 0;
                        break;
                    case 3:
                        modificator3 = 1;
                        break;
                    default:
                        modificator3 = 0;
                        break;

                }

                String modficatorstring = "[" + modificator1 + ";" + modificator2 + ";" + modificator3 + "]";
                int chatmessagenewint = Integer.parseInt(chatmessagenew);
                int minuschatmessagenewint = chatmessagenewint*-1;
                int result = minuschatmessagenewint + modificator1 + modificator2 + modificator3;

                System.out.println("Бросает кубик от [" + minuschatmessagenewint + "], модификатор " + modficatorstring + ", в сумме [" + result + "]");
            }
            else { System.out.println(chatmessage); }
        }
    }
}