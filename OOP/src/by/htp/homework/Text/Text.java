package by.htp.homework.Text;


public class Text implements TextStructure {

	int numberIn;
	String stringOfText;
	boolean isTitle;

	public Text(int numberIn, String stringOfText, boolean isTitle) {
		super();
		this.numberIn = numberIn;
		this.stringOfText = stringOfText;
		this.isTitle = isTitle;

	}

	@Override
	public int countOf(String stringOfText) {
		int countOfWords = stringOfText.split(" ").length + 1;
		if (countOfWords > 1) {
			return countOfWords;
		} else {
			return 0;
		}
	}

	public int endofText(String endOfString) {

		int check = 0;
		for (PunctuationMark.TextMark item : PunctuationMark.TextMark.values()) {
			if (item.getMark() == endOfString) {
				check = 1;
			}
		}
		return check;
	}

	public int getNumberIn() {
		return numberIn;
	}

	public void setNumberIn(int numberIn) {
		this.numberIn = numberIn;
	}

	public String getStringOfText() {
		return stringOfText;
	}

	public void setStringOfText(String stringOfText) {
		this.stringOfText = stringOfText;
	}

	public boolean isTitle() {
		return isTitle;
	}

	public void setTitle(boolean isTitle) {
		this.isTitle = isTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isTitle ? 1231 : 1237);
		result = prime * result + numberIn;
		result = prime * result + ((stringOfText == null) ? 0 : stringOfText.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (isTitle != other.isTitle)
			return false;
		if (numberIn != other.numberIn)
			return false;
		if (stringOfText == null) {
			if (other.stringOfText != null)
				return false;
		} else if (!stringOfText.equals(other.stringOfText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String title = "";
		if(isTitle) {title = " is a title";}
		return "Text " + numberIn + " [" + stringOfText + "]" + title;
	}
	
	
	
}