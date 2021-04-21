public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer{
	
	private final String[] KEYWORDS = {":(", "=(", ":|"};

	public String[] getKeywords(){
		return KEYWORDS;
	}

	public Label getLabel(){
		return Label.NEGATIVE_TEXT;
	}
}
	