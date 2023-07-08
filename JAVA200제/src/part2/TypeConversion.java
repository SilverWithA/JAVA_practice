package part2;

public class TypeConversion {

	public static void main(String[] args) {
				String slat = "37.5121215545";
				//String = "hello;
				//공백 제거 후 double타입으로 변환
				double latitude = Double.parseDouble(slat.trim());
				System.out.println(latitude);
			}

		}