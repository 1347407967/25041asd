
/**
 * @dome ����ʯͷ��
*@author czh
*@date 2020��5��2�� ����9:16:18
*
*/
package czh;

import java.util.Scanner;

import org.graalvm.compiler.nodes.NamedLocationIdentity;



public class Compalyer {
	
	//��ȭ��Ϣ
	public static final int MessageTypeFist=1;
	//Ӯ��ʱ����Ϣ
	public static final int MessageTypewin=2;
	//���ʱ����Ϣ
	public static final int MessageTypelose=3;
	
	

	//���ԣ����ơ�������������ȭͷ����ɫ��̨��
	private String nameString;
	private int score;
	private int fist;
	
	//��ɫ��ȭʱ���̨��
	private String[] fistWordStrings= {
		"��ǹbiubiu~~~~"	
	};
	
	private String[] winwordStrings= {
			"С��"
	};
	private String[] loswordStrings= {
			"����ҵ���"
	};
	public void TaiCi(int msageType) {
		int index=(int)Math.random()*1;
		String string=null;//Ҫ��ӡ����Ϣ
		switch (msageType) {
		case MessageTypeFist:
			string=fistWordStrings[index];
			break ;
		case MessageTypewin:
			string=winwordStrings[index];
			break;
		case MessageTypelose:
			string=loswordStrings[index];
			break;
		}
		System.out.println(nameString+":"+string);
	}
	
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getFist() {
		//���������1-3������
		fist=(int)(Math.random()*3)+1;
		return fist;
	}
	
	//���������ú͵õ����ơ�������˵����̨�ʡ���ȭ
//	static String nameString;
//	String chuQuanString ;
//	
//	/*
//	 * ������ҵ����֣������
//	 */
//	public static void name(String nameString) {
//
////		nameString=name;
////		return "����������"+nameString;
////		nameString=name;
//		System.out.println("��������������");
//		nameString=new Scanner(System.in).next();
//		System.out.println("����������"+nameString);
//	}
//	/*
//	 * ������ʯͷ������ҵĳ�ȭ
//	 * ������ҵĳ�ȭ�࣬�����ѡ���ȭ
//	 */
//	public static void chuquna(int chuquan ) {
//		if(chuquan==1) {
//			System.out.println();
//			
//		}
//	}
	
}
