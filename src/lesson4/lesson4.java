package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class lesson4 {
    //Поле
    public static char[][] map;
    //Размер поля
    public static final int SISE = 3;
    //Точек для победы
    public static final int DOTS_TO_WIN = 3;
    //Точки
    public static final char EMPTY_DOT = '*';
    public static final char DOT_X = 'x';
    public static final char DOT_O = '0';

    //Инициализация поля
    public static void initMap() {
        map = new char[SISE][SISE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], EMPTY_DOT);
        }
    }

    //Сканер
    public static final Scanner SC = new Scanner(System.in);

    //Рандом
    public static final Random RNDM = new Random();

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");


        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            //нлмер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");


            }
            System.out.println();

        }
    }
    //ход человека

    public static void manTurn() {
        int x, y;
        do {
            System.out.println("input coordinates x y");
            x = SC.nextInt() - 1;
            y = SC.nextInt() - 1;

        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    //ход компьютера
    public static void aiTurne() {
        int x, y;
        do {
            x = RNDM.nextInt(SISE);
            y = RNDM.nextInt(SISE);

        }
        while (!isCellValid(x, y));
        System.out.println("now turn the computer" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }

    //проверка значений поля
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SISE || y < 0 || y >= SISE) {
            return false;
        }
        if (map[y][x] != EMPTY_DOT) {
            return false;
        }
        return true;


    }

    //проверка на победу
    public static boolean checkWin(char symbol) {
        //строки

        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        //стбцы
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;

        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        //диагонали
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }
        return false;


    }

    // проверка нет свободных ячеек
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;

                }


            }

        }
        return true;

    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            manTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Win the man");
                break;
            }
            if (isMapFull()) {
                System.out.println("Drow");

            }

            aiTurne();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Win the computer");
                break;
            }
            if (checkWin(DOT_X)) {
                System.out.println("Win the man");
                break;
            }
            if (isMapFull()) {
                System.out.println("Drow");
            }
        }
    }
}




