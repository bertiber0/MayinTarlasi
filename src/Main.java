import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz :");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int column = input.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,column);

        mineSweeper.run();

    }
}