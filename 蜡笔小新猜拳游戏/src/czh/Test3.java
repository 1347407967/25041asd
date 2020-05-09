package czh;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("输入房间id");
		String id=inputScanner.next();//输入id
		System.out.println("输入房间名字");
		String name=inputScanner.next();//输入房间名字
		new GateRoom(id,name);
	}

}
