package pracitce01;

import java.util.Scanner;

public class ErrorInput {

		void InputToDo(){
		    System.out.println("二つ目の入力して下さい。");

		    Scanner scan = new Scanner(System.in);

		    String str = scan.next();
		    System.out.println("二つ目の入力値は: "+ str);

		    scan.close();

		}


}
