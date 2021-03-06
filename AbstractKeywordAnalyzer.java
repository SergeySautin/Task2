public abstract class AbstractKeywordAnalyzer{
	public abstract String[] getKeywords();

	public abstract Label getLabel();

	public Label processText(String text){
		String[] keywords = getKeywords();
		for(String keyword : keywords){
			if(text.contains(keyword)){
				return getLabel();
			}
		}

		return Label.OK;	
	}
}

	