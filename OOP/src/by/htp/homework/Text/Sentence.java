package by.htp.homework.Text;


public class Sentence implements TextStructure{

	int numberIn;
	String stringOfText;
	String endOfString;
	int countOfWord;
	boolean isEndOfParagraph;
	
	

	public Sentence(int numberIn, String stringOfText, String endOfString, int countOfWord, boolean isEndOfParagraph) {
		super();
		this.numberIn = numberIn;
		this.stringOfText = stringOfText;
		this.endOfString = endOfString;
		this.countOfWord = countOfWord;
		this.isEndOfParagraph = isEndOfParagraph;
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

@Override
	public int endofText(String endOfString) {
	int check = 0;
	for (PunctuationMark.SentenceMark item : PunctuationMark.SentenceMark.values()) {
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

public String getEndOfString() {
	return endOfString;
}

public void setEndOfString(String endOfString) {
	this.endOfString = endOfString;
}

public int getCountOfWord() {
	return countOfWord;
}

public void setCountOfWord(int countOfWord) {
	this.countOfWord = countOfWord;
}

public boolean isEndOfParagraph() {
	return isEndOfParagraph;
}

public void setEndOfParagraph(boolean isEndOfParagraph) {
	this.isEndOfParagraph = isEndOfParagraph;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + countOfWord;
	result = prime * result + ((endOfString == null) ? 0 : endOfString.hashCode());
	result = prime * result + (isEndOfParagraph ? 1231 : 1237);
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
	Sentence other = (Sentence) obj;
	if (countOfWord != other.countOfWord)
		return false;
	if (endOfString == null) {
		if (other.endOfString != null)
			return false;
	} else if (!endOfString.equals(other.endOfString))
		return false;
	if (isEndOfParagraph != other.isEndOfParagraph)
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
	String endOfPar = "";
	if(isEndOfParagraph) {endOfPar = ", is the end of paragraf";}
	return "Sentence " + numberIn + " [" + stringOfText + endOfString
			+ "]" + endOfPar;
};
	
}
