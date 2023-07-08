package part3.s033;
//위도 경도를 한 묶음으로 객체에 저장
public class GeoPoint {

	public static void main(String[] args) {
		double lat1 =37.52127220511242; 
		double long1= 127.0074462890625;
		
		double lat2 =35.52127220511242; 
		double long2= 129.0074462890625;
		
		//객체
		Geo geo1 = new Geo();
		geo1.latitude = lat1;
		geo1.longitude = long1;
		
		System.out.println(geo1.latitude + "\t"+ geo1.longitude);

	}

}
