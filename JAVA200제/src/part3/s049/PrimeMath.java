package part3.s049;
//제곱근을 이용해 소수 판별하기
public class PrimeMath {
	public static boolean isPrime(int n){
		boolean isS = true;
		
		//i는 2부터 시작해서 n의 제곱근 값이 될때까지 1씩 상승하며 for문을 돈다
		for(int i=2;i<=(int) Math.sqrt(n); i++) {
			if(n%i ==0) {
				
				//나눠지는 수가 있으면 소수가 아님
				isS = false;
				break;
			}
		}
		//boolean isS를 반환한다
		return isS; 
	}

	public static void main(String[] args) {
		int number = 101;
		
		//number이 소수인가를 확인
		boolean ifPrime = isPrime(number);
		if(ifPrime) {
			System.out.println(number+"는 1과 자신으로만 나누어지는 소수이다.");
		}else {
			System.out.println(number + "은 소수가 아니다.");
		}

	}

}
