// Encapsulation���� �ۼ��Ͻÿ�.
// name, id, age�� ���λ縦 set, get���� �޼ҵ带 �����Ͻÿ�.
class Member {
	private String name;
	private String id;
	private int age;
	public void setName(String name) { // Setter (Write)
		this.name = name;
	}
	public String getName() { // Getter (Read)
		return this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Member member = new Member();
		member.setName("ȫ�浿");
		member.setAge(20);
		member.setId("1234");
		String name = member.getName();
		int age = member.getAge();
		String id = member.getId();
		System.out.println(name + ", " + age + ", " + id);
	}
}

















