package lesson4;

import java.util.Arrays;
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


    public static void main(String[] args) {
        initMap();
        printMap();
        manTurn();
        printMap();
        manTurn();
        printMap();
        manTurn();
        printMap();

    }
}
