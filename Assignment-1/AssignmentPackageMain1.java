import TestPackage.Foundation;
public class AssignmentPackageMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation foundation = new Foundation();
		
		//variable 1,2,3 cannot be accessed outside the package as they are private, default, protected type.
		
		
		foundation.var4 = 4;
		System.out.println(foundation.var4);

	}

}
