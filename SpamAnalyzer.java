public class SpamAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer{

	private String[] analyzer;

	public SpamAnalyzer(String[] analyzer){
		this.analyzer = analyzer;
	}

	public String[] getKeywords(){
		return analyzer;
	}

	public Label getLabel(){
		return Label.SPAM;
	}
}
		
	