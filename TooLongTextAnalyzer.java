public class TooLongTextAnalyzer implements TextAnalyzer{
	private int maxLenght;

	public TooLongTextAnalyzer(int maxLenght){
		this.maxLenght = maxLenght;
	}

	public Label processText(String text){
		if(text.length()>maxLenght)
			return Label.TOO_LONG;
		else
			return Label.OK;
		
	}

	public Label checkLabels(TextAnalyzer[] analyzers, String text){
		for(int i = 0; i < analyzers.length; i++)
			if(analyzers[i].processText(text) != Label.OK)
				return analyzers[i]. processText(text);
			return Label.OK;
	}
}
