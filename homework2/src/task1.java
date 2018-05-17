public class task1 {
    public static void main(String[] args) {
        int[] mas = {1, 4, 5, 7, 8, 10, 13, 23};
        for (int i = 0; i < mas.length; i++){
            if (mas[i]%2 > 0)
                System.out.print(mas[i] + " ");
        }
        System.out.println("Не четные числа");
        for (int i = 0; i < mas.length; i++){
            if (mas[i]%2 == 0)
                System.out.print(mas[i] + " ");
        }
        System.out.println("Чётные числа");
    }
}
