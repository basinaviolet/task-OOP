package by.htp.homework.Text;

public class PunctuationMark{

enum WordMark {
	SPACE (" "), COMMA (","), COLON (":"), SEMICOLON (";"), DASH ("-"), POINT ("."), QUESTION ("?"), EXCLAMATION ("!");
	
	private String mark;
	
	WordMark (String mark){
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
}

enum SentenceMark {

POINT ("."), QUESTION ("?"), EXCLAMATION ("!"), SEMICOLON (";");
	
	private String mark;
	
	SentenceMark (String mark){
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}

enum TextMark {
	END ("\n");
	
	private String mark;
	
	TextMark (String mark){
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
}

}