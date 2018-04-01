
public class Contact {
	
	//存放姓名、地址、电话等信息的成员变量
	private String name, address, telephone;
	private static int itemCount = 0; // 计数Contact对象生成的个数
	
	
	//对成员变量进行操作的成员方法
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
	
	//成员变量定义
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	//获得成员变量
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
