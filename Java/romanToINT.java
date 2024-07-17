import java.util.Scanner;

public class romanToINT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman String");
        int result=Convert(sc.nextLine());
        System.out.println("The Equivalent Int is::"+result);
    }

    public static int Convert(String string){
        String str=string.toUpperCase();
        int answer=0, number=0;
        for (int i = 0; i < str.length(); i++) {
           switch (str.charAt(i)) {
            case 'I': number=1;
            break;
            case 'V': number=5;
            break;
            case 'X': number = 10;
            break;
            case 'L': number = 50;
            break;
            case 'C': number = 100;
            break;
            case 'D': number = 500;
            break;
            case 'M': number = 1000;
            break;
           } 
        //    answer+=number;
           answer=(4*number>answer)?answer- number:answer+number;
        }
        return answer;
    }
}
