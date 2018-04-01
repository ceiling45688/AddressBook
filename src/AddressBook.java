import java.util.*;
public class AddressBook {
	public static void main(String[] args) {
		
	
		
	// 存放联系人名单等成员变量
	ContactList addressList = new ContactList();
	Scanner reader = new Scanner(System.in);
	String input = null;
	do {
		    //提供用户界面等操作的成员方法
			System.out.println("L----列出通讯录中所有联系人");
			System.out.println("A----添加一个联系人到通讯录");
			System.out.println("D----删除通讯录中指定联系人");
			System.out.println("F----按姓名查找指定联系人");
			System.out.println("X----退出通讯录");
			if (reader.hasNextLine())
				input = reader.nextLine();
			if (input.compareTo("L") == 0) {
				System.out.println("通讯录所有联系人如下：");
				System.out.println(addressList.toString());
			}
			else if (input.compareTo("A") == 0) {
				System.out.println("输入联系人姓名，地址，电话，（每项用英文逗号分隔）");
				 if (reader.hasNextLine())
					 input = reader.nextLine();
				 
				 String[] additem = input.split(",");
				 if (additem.length == 3) {
					 addressList.addContact(new Contact(additem[0], additem[1], additem[2]));
					 System.out.println("添加联系人成功");
				 }
				 else {
					 System.out.println("输入错误，请重新输入！");
				 }
			}
			else if(input.compareTo("D") == 0) {
				System.out.println("输入要删除的联系人姓名：");
				if(reader.hasNextLine())
					input = reader.nextLine();
				addressList.removeContact(input);
			}
			else if(input.compareTo("F") == 0) {
				System.out.println("输入要查询的联系人姓名：");
				if(reader.hasNextLine())
					input = reader.nextLine();
				Contact item = addressList.findContact(input);
				System.out.println("查找姓名为" + input + "的结果为：");
				System.out.println(item.toString());
			}
		}while(input.compareTo("X") != 0);
	}
}
