package ch09.sec01;

/** 바깥 클래스 A**/
class A{
	A(){System.out.println("A객체가 생성됨.");}
		
	
	//중첩 클래스 종류
	
		/**1. 인스턴스 멤버 클래스**/
		class B{
			B(){System.out.println("인스턴스 멤버 클래스 B가 생성됨.");}
			
			/** 인스턴스 필드와 인스턴스 메서드는 선언 가능 **/
			int field1;
			void method1() {}
			
			/**클래스 B내에 정적 필드, 정적 메서드 선언 불가 **/
			//static int field2;
			//static void method2() {}
		}
		
		/** 2. 정적 멤버 클래스 **/
		// 클래스 C내에서 인스턴스 정적 필드, 메서드 모두 선언가능
		static class C{
			C(){System.out.println("정적 멤버 클래스 C가 생성됨");}
			
			/**인스턴스 필드와 인스턴스 메서드는 선언 가능**/
			int field1;
			void method1() {}
			
			/**클래스 B내에 정적 필드, 정적 메서드 선언 가능 **/
			static int field2;
			static void method2() {}
		}
			
		
		/** 3. 로컬 클래스 **/
		void method(){
			class D{
				D(){System.out.println("로컬 클래스 D가 생성됨.");}
				
				/**인스턴스 필드와 인스턴스 메서드는 선언 가능**/
				int field1;
				void method1() {}
				
				/**클래스 B내에 정적 필드, 정적 메서드 선언 불가 **/
//				static int field2;
//				static void method2() {}
		}
		D d = new D();
		d.field1 =3;
		d.method1();

	}

}



