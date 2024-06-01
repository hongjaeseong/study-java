package Ch09;

class Profile {
	// 속성
	String name;
	String addr;
	String job;
	String major;
	// 생성자
	public Profile() {} // default constructor
	public Profile(String name, String addr, String job, String major) // all arguments constructor
	{
		System.out.println("all arg constructor invoke...");
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	// 가변인자 생성자 (',' 를 기준으로 잘라내어 각 속성에 저장)
	public Profile(String... args) {
		System.out.println("varargs constructor invoke...");
		if (args.length > 0) {
			String[] parts = args[0].split(",");
			this.name = parts[0].trim();
			this.addr = parts[1].trim();
			this.job = parts[2].trim();
			this.major = parts[3].trim();
		}
	}
	// toString 재정의
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	// getter and setter 삽입
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	// findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
	// 아니면 false 리턴
	boolean isContain(String findstr) {

		if ((this.name != null && this.name.contains(findstr)) ||
			(this.addr != null && this.addr.contains(findstr)) ||
			(this.job != null && this.addr.contains(findstr)) ||
			(this.major != null && this.major.contains(findstr)))
		{
			return true;
		}
			return false;
	}
	// all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
	// name,addr,job,major 와 일치 하면 true 아니면 false 를 리턴
	boolean isEquals(String ...all) {
		String parts[] = all[0].split(",");
		if ((this.name != null && this.name.equals(parts[0])) &&
			(this.addr != null && this.addr.equals(parts[1])) &&
			(this.job != null && this.job.equals(parts[2])) &&
			(this.major != null && this.major.equals(parts[3]))) {
			return true;
		}
		return false;
	}
}

public class C01PersonMain {
	public static void main(String[] args) {
		Profile hong = new Profile("홍재성,대구,프로그래머,식품경제외식학과"); // varargs constructor invoke...
		System.out.println(hong); // Profile [name=홍재성, addr=대구, job=프로그래머, major=식품경제외식학과]
		Profile kim = new Profile("김현진","대구","원무과","의료경영학과"); // all arg constructor invoke...
		System.out.println(kim); // Profile [name=김현진, addr=대구, job=원무과, major=의료경영학과]
		System.out.println("재성 포함여부 : " + hong.isContain("재성")); // true
		System.out.println("식품 포함여부 : " + hong.isContain("식품")); // true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));// false
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍재성,대구,프로그래머,식품경제외식학과"));// true
	}
}
