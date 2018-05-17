public class task3 {
    public static void main(String[] args) {
        int[] mas3 = new int [20];
        System.out.println("Числа Фибоначчи");
        for (int i = 0; i < 20; i++){
            if (i < 2){
                mas3[i] = 1;
                System.out.print(mas3[i] + " ");
            }
            else {
                mas3[i] = mas3[i-2] + mas3[i-1];
                System.out.print(mas3[i] + " ");
            }
        }
    }
}
