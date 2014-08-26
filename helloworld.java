package test;

public class helloworld {
	public static void main(String[] args) {
		//ความสูงของพีระมิด
		for(int i=5; i>0; i--){
			//ปริ้นช่องว่าง
			for (int j = i; j > 1; j--){
				System.out.print("-");
			}
			//ปริ้น* มาจากซีกซ้ายออกมา
			for(int j = i; j<5; j++){
				System.out.print("*");
			}
			//ปริ้น* มาจากซีกขวาออกมา
			for (int j =i; j<= 5; j++){
				System.out.print("*");
			}
			//ปริ้นช่องว่างหลังจากสร้างพีระมิด
			for (int j = i; j > 1; j--){
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
