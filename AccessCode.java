//WAP to enter the access code and check whether door is open or not in java
import java.util.Scanner;
public class AccessCode
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the access code");
        int code = sc.nextInt();
        if(code==1234)
        System.out.println("Door is open");
        else
        System.out.println("Door is closed");
        }
        }