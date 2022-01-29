
public class SecondProgram {

	public static void main(String[] args) {
		short firstShortNumber;
		int   secondIntNumber;
		int[] cards = new int[8];
		int[] cardss = {1,2,3,7,453};
		char[] cardsss = {'4', '2', 'a', 'c', 'm'};
		
		firstShortNumber = 10;
		secondIntNumber = 20;
		
		float myFloatNumber = 10;
		 
		float  result = myFloatNumber/3;
		
		char myCharacter = 'a';
		
		
	    boolean statement=prokriya(firstShortNumber,secondIntNumber);
	    
		System.out.println(firstShortNumber);
		System.out.println(secondIntNumber);
		System.out.println(result);
		System.out.println(myCharacter);
		System.out.println(statement);
		System.out.println(cardsss[4]);

	}
	

	static public boolean prokriya(int firstValue,int secondValue) {
		
		boolean answer = firstValue>secondValue;
		return answer;
		
	}
}
