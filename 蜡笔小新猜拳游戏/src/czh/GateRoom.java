/**
 * ��Ϸ����
*@author czh
*@date 2020��5��4�� ����11:02:19
*
*/
package czh;

import java.util.Scanner;

public class GateRoom {
	//���ԣ��Ƿ��ơ����ߡ������
	private WanJia wanJia=null;
	private Compalyer compalyer=null;
	/** ����id*/
	private long roomId;
	/**��������*/
	private String roomName;
	/**��������*/
	private String roomPass;
	
	public GateRoom(String roomName,String roomPass) {
		// TODO Auto-generated constructor stub
		//�ж�id�������Ƿ�ֻ��ȷ
		if("JKchen".equals(roomName)&&"123321".equals(roomPass)) {
			this.setRoomName(roomName);;
			ChuShihua();
			starGame();
			endGame();
		}else {
			System.out.println("������󣬽��뷿��ʧ��");
		}
		
	}
	
	
	//��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������жϣ������ڲ������У�
	
	/**��ʼ��*/
	public void ChuShihua() {
		//ʵ������Ϸ���
		wanJia=new WanJia();
		compalyer=new Compalyer();
		
		//ѡ���ɫ
		for(int i=1;i<30;i++) {
			System.out.print("$");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
	/**��ʼ��Ϸ*/
	public void starGame() {
		showMenu();
		choiceRole();
		//˫����ȭ
		gameing();
		//��Ϸ����

		
	}


	private void gameing() {
		while (true) {
		System.out.println("���ȭ��");
		wanJia.setFist(new Scanner(System.in).nextInt());
		int fist1=wanJia.getFist();			//��ҳ�ȭ
		int fist2=compalyer.getFist();		//�˻���ȭ
		
		//�ж���Ӯ
		
		int pd=judege(fist1, fist2);
		
		//��ӡ���
		if (pd==-1) {
			System.out.println(wanJia.getNameString()+"ʤ��");//���ʤ��
			wanJia.setScore(wanJia.getScore()+1);			//��ҷ���+1
//			System.out.print(wanJia.getNameString()+":");	
			wanJia.TaiCi(wanJia.MessageTypewin);
//			System.out.print(compalyer.getNameString()+":");
			compalyer.TaiCi(compalyer.MessageTypelose);
		}else if (pd==0) {
			System.out.println("ƽ��");
//			System.out.print(wanJia.getNameString()+":");
			wanJia.TaiCi(wanJia.MessageTypeFist);
//			System.out.print(compalyer.getNameString()+":");
			compalyer.TaiCi(compalyer.MessageTypeFist);
		}else if(pd==1) {
			System.out.println(compalyer.getNameString()+"ʤ��");//�˻�ʤ��
			compalyer.setScore(compalyer.getScore()+1);			//�˻�����+1
//			System.out.print(compalyer.getNameString()+":");   //�˻�����
			compalyer.TaiCi(compalyer.MessageTypewin);		//�˻�̨��
//			System.out.print(wanJia.getNameString()+":");		//�������
			wanJia.TaiCi(wanJia.MessageTypelose);			//���̨��
		}
		//�ж��Ƿ����
		System.out.println("��������Y/N");
		String yString=new Scanner(System.in).next();
		if (!"y".equalsIgnoreCase(yString)) {
			System.out.println(wanJia.getNameString()+":����\t\t"+wanJia.getScore()
							+compalyer.getNameString()+":����\t\t"+compalyer.getScore());
			if(wanJia.getScore()>compalyer.getScore()) {
				System.out.println("���յ�ʤ����"+wanJia.getNameString());
			}else if(wanJia.getScore()==compalyer.getScore()) {
				System.out.println("����ƽ�֣���������");
			}else {
				System.out.println("���յ�ʤ����"+compalyer.getNameString());
			}
			break;
		}
		}
	}
	/**��ʾ�˵�*/
	public void showMenu() {
		System.out.println("\n��ӭ���롶"+roomName+"������");
		System.out.println("��ȭ����1-����2-ʯͷ3-��");
		
	}
	/**ѡ���ɫ*/
	public void choiceRole() {
		System.out.println("�Է���ɫ��1-���2-����3-����4-����");
		System.out.println("��ѡ��");
		int choice=new Scanner(System.in).nextInt();
		String choiceString[]= {"���","����","����","����"};
		compalyer.setNameString(choiceString[choice-1]);
		wanJia.setNameString("ԭҰ��֮��");
		System.out.println(wanJia.getNameString()+"VS"+compalyer.getNameString());
		
	}
	/**�ж���Ӯ*/
	public int judege(int fist1,int fist2) {
		if(fist1==fist2) return 0;//ƽ��
		if(fist1==1&&fist2==3||fist1==2&&fist2==1||fist1==3&&fist2==2) {
			
			return -1;
		}//else if(fist2==1&&fist1==3||fist2==2&&fist1==1||fist2==3&&fist1==2) 
			
			return 1;

	}
	/**������Ϸ*/
	public void endGame() {
		System.out.println("��Ϸ�������´�������");
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
