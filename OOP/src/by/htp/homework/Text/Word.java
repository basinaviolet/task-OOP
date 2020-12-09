package by.htp.homework.Text;

public class Word implements TextStructure{

	int numberIn;
	String stringOfText;
	String endOfString;
	int countOfWord = 1;
	boolean isEndOfSent;
	boolean isEndOfParagraph;

	public Word(int numberIn, String stringOfText, String endOfString, boolean isEndOfSent, boolean isEndOfParagraph) {
		super();
		this.numberIn = numberIn;
		this.stringOfText = stringOfText;
		this.endOfString = endOfString;
		this.countOfWord = 1;
		this.isEndOfSent = isEndOfSent;
		this.isEndOfParagraph = isEndOfParagraph;
	}

@Override
	public int countOf(String stringOfText) {
		int countOfWords = stringOfText.split(" ").length + 1;
		if (countOfWords == 1) {
			return 1;
		} else {
			return 0;
		}
	}

@Override
	public int endofText(String endOfString) {
	int check = 0;
	for (PunctuationMark.WordMark item : PunctuationMark.WordMark.values()) {
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

public boolean isEndOfSent() {
	return isEndOfSent;
}

public void setEndOfSent(boolean isEndOfSent) {
	this.isEndOfSent = isEndOfSent;
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
	result = prime * result + (isEndOfSent ? 1231 : 1237);
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
	Word other = (Word) obj;
	if (countOfWord != other.countOfWord)
		return false;
	if (endOfString == null) {
		if (other.endOfString != null)
			return false;
	} else if (!endOfString.equals(other.endOfString))
		return false;
	if (isEndOfParagraph != other.isEndOfParagraph)
		return false;
	if (isEndOfSent != other.isEndOfSent)
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
	String endOfSent = "";
	String endOfPar = "";
	if(isEndOfSent) {endOfSent = "is the end of sentence";}
	if(isEndOfParagraph) {endOfPar = ", is the end of paragraf";}
	return "Word " + numberIn + " [" + stringOfText + endOfString + "] " + endOfSent + endOfPar;
};
	
	
	
}
