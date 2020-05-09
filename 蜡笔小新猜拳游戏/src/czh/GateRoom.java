/**
 * 游戏房间
*@author czh
*@date 2020年5月4日 上午11:02:19
*
*/
package czh;

import java.util.Scanner;

public class GateRoom {
	//属性：记分牌、道具、房间号
	private WanJia wanJia=null;
	private Compalyer compalyer=null;
	/** 房间id*/
	private long roomId;
	/**房间名称*/
	private String roomName;
	/**房间密码*/
	private String roomPass;
	
	public GateRoom(String roomName,String roomPass) {
		// TODO Auto-generated constructor stub
		//判断id和密码是否只正确
		if("JKchen".equals(roomName)&&"123321".equals(roomPass)) {
			this.setRoomName(roomName);;
			ChuShihua();
			starGame();
			endGame();
		}else {
			System.out.println("输入错误，进入房间失败");
		}
		
	}
	
	
	//方法：开始游戏、初始化游戏、显示菜单、选择人物、判断（定义在裁判类中）
	
	/**初始化*/
	public void ChuShihua() {
		//实例化游戏玩家
		wanJia=new WanJia();
		compalyer=new Compalyer();
		
		//选择角色
		for(int i=1;i<30;i++) {
			System.out.print("$");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
	/**开始游戏*/
	public void starGame() {
		showMenu();
		choiceRole();
		//双方出拳
		gameing();
		//游戏结束

		
	}


	private void gameing() {
		while (true) {
		System.out.println("请出拳：");
		wanJia.setFist(new Scanner(System.in).nextInt());
		int fist1=wanJia.getFist();			//玩家出拳
		int fist2=compalyer.getFist();		//人机出拳
		
		//判断输赢
		
		int pd=judege(fist1, fist2);
		
		//打印结果
		if (pd==-1) {
			System.out.println(wanJia.getNameString()+"胜利");//玩家胜利
			wanJia.setScore(wanJia.getScore()+1);			//玩家分数+1
//			System.out.print(wanJia.getNameString()+":");	
			wanJia.TaiCi(wanJia.MessageTypewin);
//			System.out.print(compalyer.getNameString()+":");
			compalyer.TaiCi(compalyer.MessageTypelose);
		}else if (pd==0) {
			System.out.println("平局");
//			System.out.print(wanJia.getNameString()+":");
			wanJia.TaiCi(wanJia.MessageTypeFist);
//			System.out.print(compalyer.getNameString()+":");
			compalyer.TaiCi(compalyer.MessageTypeFist);
		}else if(pd==1) {
			System.out.println(compalyer.getNameString()+"胜利");//人机胜利
			compalyer.setScore(compalyer.getScore()+1);			//人机分数+1
//			System.out.print(compalyer.getNameString()+":");   //人机名字
			compalyer.TaiCi(compalyer.MessageTypewin);		//人机台词
//			System.out.print(wanJia.getNameString()+":");		//玩家名字
			wanJia.TaiCi(wanJia.MessageTypelose);			//玩家台词
		}
		//判断是否继续
		System.out.println("还继续吗？Y/N");
		String yString=new Scanner(System.in).next();
		if (!"y".equalsIgnoreCase(yString)) {
			System.out.println(wanJia.getNameString()+":分数\t\t"+wanJia.getScore()
							+compalyer.getNameString()+":分数\t\t"+compalyer.getScore());
			if(wanJia.getScore()>compalyer.getScore()) {
				System.out.println("最终的胜利是"+wanJia.getNameString());
			}else if(wanJia.getScore()==compalyer.getScore()) {
				System.out.println("又是平局，不分上下");
			}else {
				System.out.println("最终的胜利是"+compalyer.getNameString());
			}
			break;
		}
		}
	}
	/**显示菜单*/
	public void showMenu() {
		System.out.println("\n欢迎进入《"+roomName+"》房间");
		System.out.println("出拳规则：1-剪刀2-石头3-布");
		
	}
	/**选择角色*/
	public void choiceRole() {
		System.out.println("对方角色：1-风间2-妮妮3-正南4-阿呆");
		System.out.println("请选择：");
		int choice=new Scanner(System.in).nextInt();
		String choiceString[]= {"风间","妮妮","正南","阿呆"};
		compalyer.setNameString(choiceString[choice-1]);
		wanJia.setNameString("原野心之助");
		System.out.println(wanJia.getNameString()+"VS"+compalyer.getNameString());
		
	}
	/**判断输赢*/
	public int judege(int fist1,int fist2) {
		if(fist1==fist2) return 0;//平局
		if(fist1==1&&fist2==3||fist1==2&&fist2==1||fist1==3&&fist2==2) {
			
			return -1;
		}//else if(fist2==1&&fist1==3||fist2==2&&fist1==1||fist2==3&&fist1==2) 
			
			return 1;

	}
	/**结束游戏*/
	public void endGame() {
		System.out.println("游戏结束，下次再来玩");
	}
	
	
	
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
}
