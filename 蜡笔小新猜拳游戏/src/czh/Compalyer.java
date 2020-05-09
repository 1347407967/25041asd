
/**
 * @dome 剪刀石头布
*@author czh
*@date 2020年5月2日 下午9:16:18
*
*/
package czh;

import java.util.Scanner;

import org.graalvm.compiler.nodes.NamedLocationIdentity;



public class Compalyer {
	
	//出拳信息
	public static final int MessageTypeFist=1;
	//赢得时候信息
	public static final int MessageTypewin=2;
	//输的时候信息
	public static final int MessageTypelose=3;
	
	

	//属性：名称、分数、所处的拳头、角色的台词
	private String nameString;
	private int score;
	private int fist;
	
	//角色出拳时候的台词
	private String[] fistWordStrings= {
		"手枪biubiu~~~~"	
	};
	
	private String[] winwordStrings= {
			"小样"
	};
	private String[] loswordStrings= {
			"你给我等着"
	};
	public void TaiCi(int msageType) {
		int index=(int)Math.random()*1;
		String string=null;//要打印的信息
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
		//生成随机的1-3的数字
		fist=(int)(Math.random()*3)+1;
		return fist;
	}
	
	//方法：设置和得到名称、分数、说个性台词、出拳
//	static String nameString;
//	String chuQuanString ;
//	
//	/*
//	 * 定义玩家的名字，并输出
//	 */
//	public static void name(String nameString) {
//
////		nameString=name;
////		return "您的名字是"+nameString;
////		nameString=name;
//		System.out.println("请输入您的名字");
//		nameString=new Scanner(System.in).next();
//		System.out.println("您的名字是"+nameString);
//	}
//	/*
//	 * 出剪刀石头布，玩家的出拳
//	 * 定义玩家的出拳类，让玩家选择出拳
//	 */
//	public static void chuquna(int chuquan ) {
//		if(chuquan==1) {
//			System.out.println();
//			
//		}
//	}
	
}
