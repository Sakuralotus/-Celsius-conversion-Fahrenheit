import java.util.Scanner;
public class weather {
	public static void main(String[] args) {
		int a1;
		Scanner scanner = new Scanner(System.in);
        System.out.print("輸入攝氏: ");
        a1 = scanner.nextInt();
        System.out.println("攝氏溫度轉華氏溫度:" + ((a1*9/5)+32));
    }
 
}

