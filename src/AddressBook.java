import java.util.*;
public class AddressBook {
	public static void main(String[] args) {
		
	
		
	// �����ϵ�������ȳ�Ա����
	ContactList addressList = new ContactList();
	Scanner reader = new Scanner(System.in);
	String input = null;
	do {
		    //�ṩ�û�����Ȳ����ĳ�Ա����
			System.out.println("L----�г�ͨѶ¼��������ϵ��");
			System.out.println("A----���һ����ϵ�˵�ͨѶ¼");
			System.out.println("D----ɾ��ͨѶ¼��ָ����ϵ��");
			System.out.println("F----����������ָ����ϵ��");
			System.out.println("X----�˳�ͨѶ¼");
			if (reader.hasNextLine())
				input = reader.nextLine();
			if (input.compareTo("L") == 0) {
				System.out.println("ͨѶ¼������ϵ�����£�");
				System.out.println(addressList.toString());
			}
			else if (input.compareTo("A") == 0) {
				System.out.println("������ϵ����������ַ���绰����ÿ����Ӣ�Ķ��ŷָ���");
				 if (reader.hasNextLine())
					 input = reader.nextLine();
				 
				 String[] additem = input.split(",");
				 if (additem.length == 3) {
					 addressList.addContact(new Contact(additem[0], additem[1], additem[2]));
					 System.out.println("�����ϵ�˳ɹ�");
				 }
				 else {
					 System.out.println("����������������룡");
				 }
			}
			else if(input.compareTo("D") == 0) {
				System.out.println("����Ҫɾ������ϵ��������");
				if(reader.hasNextLine())
					input = reader.nextLine();
				addressList.removeContact(input);
			}
			else if(input.compareTo("F") == 0) {
				System.out.println("����Ҫ��ѯ����ϵ��������");
				if(reader.hasNextLine())
					input = reader.nextLine();
				Contact item = addressList.findContact(input);
				System.out.println("��������Ϊ" + input + "�Ľ��Ϊ��");
				System.out.println(item.toString());
			}
		}while(input.compareTo("X") != 0);
	}
}
