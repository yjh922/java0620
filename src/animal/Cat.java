//자바 원본 소스에 패키지를 명시하면, 컴파일 명령의 옵셥 중 -d가 해당 패키지를
//자동으로 생성하여 그 안에 .class 파일을 둔다.
//package 패키지란?
//자바 파일을 관련성 있는 것끼리 묶어 놓은 디렉토리
//사용 이유 ?
//1) 관련성 있는 클래스들끼리 묶기 위함(개발의 효율성)
//2) 규모가 큰 개발시, 클래스들끼리의 중복을 방지해 줌
package animal;
//패키지에 넣어둔 클래스는 아무도 접근할 수 없으므로, 접근할 수 있도록 보안을 풀어줘야 한다.
public class Cat{
	String name;//null
	String color;///null
	int a;
	boolean x;

}
