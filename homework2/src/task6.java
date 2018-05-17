public class task6 {
    public static void main(String[] args) {
        System.out.println("Числа из различных цифр");
        int[] mas = {2, 5, 10, 11, 15, 125};
        for (int i = 0; i < 6; i++){
            if (mas[i] < 10) System.out.print(mas[i] + " ");
            else{
            int A = mas[i] % 10;
            int B = mas[i] - A;
            B /= 10;
            if (B < 10 & B != A) System.out.print(mas[i] + " ");
            else {
               int C = B % 10;
               C = B - C;
               C /= 10;
               if (C < 10 & A != B & B != C & A != C) System.out.print(mas[i] + " ");
            }
            }

        }
    }
}
