
public class Contact {
	
	//�����������ַ���绰����Ϣ�ĳ�Ա����
	private String name, address, telephone;
	private static int itemCount = 0; // ����Contact�������ɵĸ���
	
	
	//�Գ�Ա�������в����ĳ�Ա����
	public static int getItemCount() {
		return itemCount;
	}
	
	public Contact(String name, String address, String telephone){
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		itemCount++;
	}
	
	public Contact() {
		name = null; address = null; telephone = null; 
		itemCount++;
	}
	
	public Contact(Contact aItem) {
		this(aItem.name, aItem.address, aItem.telephone);
	}
	
	//��Ա��������
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	//��ó�Ա����
	public String getName(String name) {
		return name;
	}
	public String getAddress(String address) {
		return address;
	}
	public String getTelephone(String telephone) {
		return telephone;
	}
	public static int getiItemCount() {
		return itemCount;
	}
	public String toString() {
		return name + ' ' + address + ' ' + telephone; 
	}
}
