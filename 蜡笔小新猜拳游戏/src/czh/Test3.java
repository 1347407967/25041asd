package czh;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("���뷿��id");
		String id=inputScanner.next();//����id
		System.out.println("���뷿������");
		String name=inputScanner.next();//���뷿������
		new GateRoom(id,name);
	}

}
