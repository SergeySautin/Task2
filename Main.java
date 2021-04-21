public class Main{
	public static void main(String[] args){
		NegativeTextAnalyzer negative = new NegativeTextAnalyzer();
		System.out.println(negative.getKeywords());

		TooLongTextAnalyzer tooLong = new TooLongTextAnalyzer(5);
		System.out.println(tooLong.processText("Hello"));
	}
}