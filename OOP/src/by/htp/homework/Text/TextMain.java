package by.htp.homework.Text;

import java.util.ArrayList;
import java.util.List;

public class TextMain {
public static void main(String[] args) {
	TextSplit newText = new TextSplit();
	TextView newPrint = new TextView();
	
	List<Word> wordList = new ArrayList<Word>();
	List<Sentence> sentenceList = new ArrayList<Sentence>();
	List<Text> textList = new ArrayList<Text>();
		
	newText.splitBy(newText.inputText, wordList, sentenceList, textList);
	
	newPrint.printWord(wordList);
	newPrint.printSentence(sentenceList); 
	newPrint.printText(textList);
	newPrint.printWordToText(wordList);
}
}
