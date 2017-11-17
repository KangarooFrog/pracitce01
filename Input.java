package pracitce01;

import java.util.Scanner;

public class Input {
	void InputToDo(){
	    System.out.println("1つ目の入力して下さい。");

	    Scanner scan = new Scanner(System.in);

	    String str = scan.next();
	    System.out.println("1つ目の最初の入力値は: "+ str);



	}
}
