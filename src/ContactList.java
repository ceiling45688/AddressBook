
public class ContactList {
	
	//���һϵ����ϵ�˵ĳ�Ա����
	private Contact contactList[] = new Contact[100];//����ͨѶ��Ŀ������100��
	private int total;
	
	public ContactList() {
		contactList[0] = new Contact("С��", "������", "2016212888");
		contactList[1] = new Contact("С��", "������", "2016212751");
		total = 2;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void addContact(Contact aItem){
	//��ӵ���Ŀֱ�Ӽ�������β��
		contactList[total] = new Contact(aItem);
		total++;
	}
	
	public void removeContact(String aName) {
		int k = -1;
		for (int i=0; i<total; i++) {
			if (contactList[i].getName(aName).compareTo(aName) == 0) {
				k = i;
			}
		}
		
		if (k != -1) {
			for(int i=k; i<total-1; i++)
				contactList[i] = contactList[i+1];
			total--;
			contactList[total] = null;
		}
		else
			System.out.println("Don't find!");
	}
	
	public Contact findContact(String aName) {
		int i , k;
		for (i=0; i<total; i++) {
			if (contactList[i].getName(aName).compareTo(aName) == 0) {
				k = i;
				break;
			}
		}
		if(i <total)
			return new Contact(contactList[i]);
		else
			return new Contact();
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer("");
		for (int i=0; i<total; i++) {
			str = str.append(contactList[i].toString()).append("\n");
		}
		return str.toString();
	}
}
