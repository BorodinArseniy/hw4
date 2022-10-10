import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int age = rand.nextInt(60) + 1;
        System.out.println(age);

        //дз1
        //task1
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Мелкий, подожди еще немного");
        }

        //task2
        if (age >= 7 && age < 18) {
            System.out.println("Школа");
        } else if (age >= 18 && age < 24) {
            System.out.println("Закончил школу, дуй в универ");
        } else if (age >= 24) {
            System.out.println("Ищи работу");
        }

        //task3
        int space = 102;
        int sits = 60;
        int otherSpots = space - sits;
        int busySits = rand.nextInt(60) + 1;
        int freeSits = sits - busySits;
        int busyOtherSpots = rand.nextInt(otherSpots) + 1;
        int freeOtherSpots = otherSpots - busyOtherSpots;

        if (freeSits == 0 && freeOtherSpots == 0) {
            System.out.println("Вагон уже полностью забит");
        } else if (freeSits == 0 && freeOtherSpots != 0) {
            System.out.println("Свободно " + freeOtherSpots + " стоячих мест");
        } else if (freeSits != 0 && freeOtherSpots == 0) {
            System.out.println("Свободно " + freeSits + " сидячих мест");
        } else {
            System.out.println("Свободно " + freeSits + " сидячих мест и " + freeOtherSpots + " стоячих мест");
        }

        //дз3
        //task1
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека от 2 до 7 лет, то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека от 7 до 18 лет, то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека от 18 до 24 лет, то ему нужно ходить в универ");
        } else if (age >= 24) {
            System.out.println("Если возраст человека от 18 до 24 лет, то ему нужно ходить на работу");
        }

        //task2
        int childAge = rand.nextInt(18) + 1;
        System.out.println(childAge);
        if (childAge < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Катайся со взрослым");
        } else if (childAge >= 14) {
            System.out.println("Катайся");
        }

            //task 3
            int one = rand.nextInt();
            int two = rand.nextInt();
            int three = rand.nextInt();

            if (one > two) {
                two = one;
            } else {
                one = two;
            }

            if (three > two) {
                two = three;
            } else {
                three = two;
            }

            System.out.println(three);


        }
    }
