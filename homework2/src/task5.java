public class task5 {
    public static void main(String[] args) {
        int[] mas = {2, 5, 10, 15, 125};
        System.out.println("Самое короткое число");
        for (int i = 0; i < 5; i++){
            if ((mas[i] / 10) < 1) System.out.println(mas[i] + " Длина один символ");
        }
        System.out.println("Самое длинное число");
        int A = 0;
        int B = 0;
        for (int i = 0; i < 5; i++){
            if (((mas[i] % 10) >= 0) & ((mas[i] / 10) >= 1)  ){
                if ((mas[i] / 10) < 10){
                    if (mas[i] > A){
                        A = mas[i];
                        B = 2;
                    }
                }
                else if ((mas[i] / 100) < 10) {
                    if (mas[i] > A){
                        A = mas[i];
                        B = 3;
                    }
                }
            }
        }
        System.out.println(A + " знака " + B);
    }
}
