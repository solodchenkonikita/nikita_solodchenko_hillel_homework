public class task2 {
    public static void main(String[] args) {
        int[] mas = {1, 4, 5, 7, 8, 10, 13, 23, 25};
        System.out.println("Постые числа до 120");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 1) System.out.print(mas[i] + " ");
            if (mas[i] == 2) System.out.print(mas[i] + " ");
            if (mas[i] == 3) System.out.print(mas[i] + " ");
            if (mas[i] == 5) System.out.print(mas[i] + " ");
            if (mas[i] == 7) System.out.print(mas[i] + " ");
            if (mas[i] % mas[i] == 0 & mas[i] != 1 & mas[i] % 2 > 0 & mas[i] % 3 > 0 & mas[i] % 5 > 0 & mas[i] % 7 > 0)
                System.out.print(mas[i] + " ");
        }
    }
}
