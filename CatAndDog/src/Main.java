import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Nikita\\Desktop\\CatAndDog.txt");
        System.setOut(new PrintStream(fos));
        System.out.println("Zhenya has a cat. The cat is redhead. The cat is fluffy.");

        FileInputStream fis = new FileInputStream("C:\\Users\\Nikita\\Desktop\\CatAndDog.txt");

        FileOutputStream fosdog = new FileOutputStream("C:\\Users\\Nikita\\Desktop\\CatAndDogCopy.txt");
        System.setOut(new PrintStream(fosdog));
        int a;
        String str = "";
        while ((a=fis.read())!= -1){
            char b = (char)a;
            str = str + b;
        }
        System.out.println(str.replaceAll("cat","dog"));
    }
}
