package org.kh.site;
//대입 연산자: 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, |=, >>=, <<=, >>>=,^=(&=,|=은 하나만 사용하므로 2진수 연산이 된다.)
//비트(2진수) 연산자: &(and), |(or), ~(not=complement), ^(xor), >>(right shift), <<(left shift)
public class Operation7 {
	public static void main(String[] args) {
		int a =20;
		int b =15;
		int tmp;
		a+=b; //a=35(b를 a에 더해 대입한다.) , b=15
		b-=a; //a=35, (b=b-a)-> b=-20
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//*a와 b의 값을 맞교환
		//만약 a와 b에 값을 서로 바꾸고 싶다면?-> a=b만 하게 될 경우, b에 있는-20이 a에 값이 들어가 -20이 되므로 둘다 -20,-20된다.
		//따라서 값을 지정하지 않은 int c에 먼저 a에 값을 임시 저장한 후 그 뒤에 a=b로 b에 값을 a에 넣어야 맞교환이 된다.
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("교환 후");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int x =0b01101;
		int y =0b01011;
		System.out.println("x="+Integer.toBinaryString(x));
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x&y="+Integer.toBinaryString(x&y));		//and
		System.out.println("x|y="+Integer.toBinaryString(x|y));		//or
		System.out.println("~x="+Integer.toBinaryString(~x));		//not
		System.out.println("x^y="+Integer.toBinaryString(x^y));		//xor(실제 2진수 계산법)
		System.out.println("x>>2:"+Integer.toBinaryString(x>>2));	//right shift=나누기 2씩
		System.out.println("x<<2:"+Integer.toBinaryString(x<<2));	//left shift=곱하기 2씩
		
		System.out.println("대입 연산자");
		
		//16 8 4 2 1		
		int i= 25;	//11001
		int j= 30;	//11110
		i&=j; // i=i&j		
		System.out.println("i&=j:"+i);//11000->16+8이므로 24
		
		i= 25;
		i|=j;//i=i|j
		System.out.println("i|=j:"+i);//11111->16+8+4+2+1이므로 31
		i= 25;
		i^=j;//i=i^j (서로 같으면 0 서로 다르면 1)
		System.out.println("i^=j:"+i);//00111->4+2+1이므로 7
		j>>=2;//11110을 오른쪽으로 두번 밀어 없앤다.->111이르모 4+2+1은 7
		System.out.println("j>>=2:"+j);
		j=30;//11110
		j<<=2;//1111000
		System.out.println("j<<=2:"+j);
		j=30;
		j>>>=2;
		System.out.println("j>>>=2:"+j);
	}
}