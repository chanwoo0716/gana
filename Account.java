package object_class;
//은행계좌 클래스(신한은행)			
public class Account {
	//클래스는 3개로 구성 - 멤버변수(필드), 생성자함수, 메소드
	//1. 멤버변수(필드) - 클래스의 정보를 저장하는 변수
	static final String BANKNAME="신한은행"; //static final=>정적, 마지막=>상수(하나의 값을 저장).
										  //상수는 관습상 대문자로 쓴다. 변수는 소문자
										  //static: 정적멤버변수. 객체를 통해 접근안하고 클래스 자체로 접근할 수 있다.
	String accountNo; //계좌번호 - 인스턴스 멤버변수(객체를 new로 생성해서 사용)
	String ownerName; //예금주이름 - 인스턴스 멤버변수
	int balance;	  //잔액 - 인스턴스 멤버변수
	
	//2. 생성자 = 객체를 생성과 동시에 초기화하는 것. 멤버변수값을 초기화하는 것.(값을 저장한다는 말)
	//Account안의 내용은 외부로부터 받는 값들(매개변수)
	//빈 생성자는 자동으로 생성된다. 하지만 매개변수를 설정한 생성자함수를 만들면 빈 생성자는 따로 만들어야한다.(Ctrl+space)
	
	/*
	public Account(String accNo, String owName, int bal) {
		accountNo=accNo; //매개변수를 멤버변수로.
		ownerName=owName;
		balance=bal;
	
	*Source - generate constructor....
	}
	*/
	public Account() { //객체생성시 아무것도 안받는 빈 생성자
		// TODO Auto-generated constructor stub
	}
	
	//외부서 받는 매개변수와 멤버변수이름을 같게 만들면 this를 붙여줘야 한다.
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}

	
	//3. 메소드(기능)
	//예금한다 메소드
	//int->void, return amount;지우셈
	void deposit(int amount) {
		balance+=amount; //balance=balance+amount;
	}
	
	// 인출한다 메서드 
	int withdraw(int amount) throws Exception { //인위적으로 예외처리. 예외가 생기면 예외가 생긴곳에 던지겠다
		if(balance < amount) { //조건 만족시 Exception생성 후 잔액부족출력
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;  //balance=balance-amount;
		return amount;//메소드앞에 타입이 오면 반드시 return을 써야한다
	}
	
	//3월 21일 정리
	/*
	 return을 하면 호출한 곳으로 그 값을 보낸다.
	 
	 void를 쓰면 return이 없기때문에 변수안에 amount가 안들어간다
	 ->
	 
	 */
	
	
	
	
	
}
