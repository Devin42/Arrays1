public class ArrayTestGit {

	public static void main(String[] args) {
		ArrayGit1 aTest = new ArrayGit1(1987, 600);
		
		aTest.addNode(1979, 650);
		aTest.addNode(1985, 630);
		
		
		System.out.println(aTest.searchYr(1979).year + " " + aTest.searchYr(1979).water);
		
		System.out.println(aTest.searchW(1985).year + " " + aTest.searchW(1985).water);

	}

}
