import java.util.Random;

public class ExceptionImp {

	public static void main(String[] args) {
//		try {
//			
//		
//    def();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
	System.out.println("I am modified");
	Random r=new Random();
	r.setSeed(8);
	for(int i=0;i<5;i++) {
		
	
	int x=r.nextInt(100)+1;
	System.out.println(x);
	}
	}
public static void def() throws CustomException {
	throw new CustomException("from method");
}
}
