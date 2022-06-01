package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    //поле
    public static char[][] map;
    //размер поля
    public static final int Sise = 3;
    //точек для победы
    public static final int Dots_To_Win = 3;
    // описание точек
    public static char Emty = '.';
    public static char Dot_X = 'x';
    public static char Dot_O = '0';
    //сканер
    public static final Scanner SCANNER=new Scanner;
    ;
    //ход человека
    public  static final void humanTurn(){
            int x,y;
            do {
                System.out.println("enter coordinate x y");
                x= SCANNER.nextInt()-1;
                y= SCANNER.nextInt()-1;

            }
            while (!isCellValid(x,y));
                map[y][x]=Dot_X;
                public static Random RANDOM= new Random();



                //ход компьютера
                public static void aiturn{
                    int x, y;
                    do {

                    }
                    while (!isCellValid(x,y));
            System.out.println("AI made turn");
            map[y][x]=Dot_O;


        }



        }
        //проверка поля на валидность
        public static boolean isCellValid(int x,int y) {
            if (x < 0 || x > Sise || y < 0 || y > Sise) {
                return false;
            }
            if (map[y][x] != Emty) {
                return false;
            }
            return true;
        }


    //инициализация поля
    public static void initMap() {

        map = new char[Sise][Sise];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Emty;

            }

        }
    }

    //печать поля
    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]+" ");

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
        printMap();
        humanTurn();
        printMap();
    }


}
