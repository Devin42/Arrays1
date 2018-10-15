package packageOne;

public class ArrayTest {

	public static void main(String[] args) {
		Array aTest = new Array(1987, 600);
		
		aTest.addNode(1979, 650);
		
		System.out.println(aTest.searchYr(1979).year + " " + aTest.searchYr(1979).water);
		
		System.out.println(aTest.searchW(1979).year + " " + aTest.searchW(1979).water);
		

		
	}
	
}
