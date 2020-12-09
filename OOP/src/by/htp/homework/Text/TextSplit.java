package by.htp.homework.Text;

import java.util.List;

public class TextSplit {

	String inputText = "Я помню чудное мгновенье!\n" + "Я помню чудное мгновенье: " + "Передо мной явилась ты, "
			+ "Как мимолетное виденье, " + "Как гений чистой красоты.\n" + "В томленьях грусти безнадежной, "
			+ "В тревогах шумной суеты, " + "Звучал мне долго голос нежный " + "И снились милые черты.\n"
			+ "Шли годы. Бурь порыв мятежный " + "Рассеял прежние мечты, " + "И я забыл твой голос нежный, "
			+ "Твои небесные черты.\n" + "В глуши, во мраке заточенья " + "Тянулись тихо дни мои "
			+ "Без божества, без вдохновенья, " + "Без слез, без жизни, без любви.\n" + "Душе настало пробужденье: "
			+ "И вот опять явилась ты, " + "Как мимолетное виденье, " + "Как гений чистой красоты.\n"
			+ "И сердце бьется в упоенье, " + "И для него воскресли вновь " + "И божество, и вдохновенье, "
			+ "И жизнь, и слезы, и любовь. ";

	// preparing text for insert
	String readyToRead(String stringForSplit) {
		String newline;
		newline = stringForSplit.replaceAll("\n", "\n ");
		newline = stringForSplit.replaceAll("\n\n", "\n");
		return newline;
	}

	void toParagraph(String stringForInsert, int index, List<Text> textList) {
		// int numberIn, String stringOfText, boolean isTitle
		textList.add(new Text(index + 1, stringForInsert, ifFirst(index)));

	}

	void toWord(String stringForInsert, int index, List<Word> wordList) {
		// Word(int numberIn, String stringOfText, String endOfString, boolean
		// isEndOfSent, boolean isEndOfParagraph)
		String symbol = endOfWord(stringForInsert);
		wordList.add(new Word(index + 1, stringToWord(stringForInsert), symbol, ifLastInSent(symbol),
				ifLastInPar(stringForInsert)));
	}

	// collect word to sentence
	void toSentence(List<Word> listWord, List<Sentence> sentenceList) {
		String sentenceLine = "";
		int countSent = 0;
		int countWord = 0;
		for (Word word : listWord) {
			sentenceLine += word.getStringOfText() + word.getEndOfString() + " ";
			countWord++;
			if (word.isEndOfParagraph) {

				// Sentence(int numberIn, String stringOfText, String endOfString, int
				// countOfWord, boolean isEndOfParagraph)
				sentenceList.add(new Sentence(countSent + 1, sentenceLine, word.getEndOfString(), countWord, true));
				countSent = 0;
				countWord = 0;
				sentenceLine = "";
			} else if (word.isEndOfSent) {
				sentenceList.add(new Sentence(countSent + 1, sentenceLine, word.getEndOfString(), countWord, false));
				countSent += 1;
				countWord = 0;
				sentenceLine = "";
			}
		}
	}

	// title
	boolean ifFirst(int index) {
		boolean ifFirst = false;
		if (index == 0) {
			ifFirst = true;
		}
		return ifFirst;
	}

	// select word
	String stringToWord(String line) {
		line = line.replaceAll("\n", "");
		for (PunctuationMark.WordMark enumItem : PunctuationMark.WordMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				line = line.substring(0, line.length() - 1);
			}
		}
		System.out.println("-" + line);
		return line;
	}

	// the end of paragraph
	boolean ifLastInPar(String line) {
		int check = 0;
		for (PunctuationMark.TextMark enumItem : PunctuationMark.TextMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				check = 1;
			}
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	// the end of sentence
	boolean ifLastInSent(String symbol) {
		int check = 0;
		for (PunctuationMark.SentenceMark enumItem : PunctuationMark.SentenceMark.values()) {
			if (symbol != null) {
				if (symbol.charAt(0) == enumItem.getMark().charAt(0)) {
					check = 1;
				}
			}
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	// the end of word
	String endOfWord(String line) {
		String symbol = null;
		line = line.replaceAll("\n", "");
		for (PunctuationMark.WordMark enumItem : PunctuationMark.WordMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				symbol = Character.toString(line.charAt(line.length() - 1));
			}
		}
		return symbol;
	}

	String paragraphToSent(String stringForSplit) {
		String newline = stringForSplit.replaceAll("\n", "\n ");
		return newline;
	}

	void splitBy(String stringForSplit, List<Word> wordList, List<Sentence> sentenceList, List<Text> textList) {
		stringForSplit = readyToRead(stringForSplit);
		String[] textArray;
		textArray = stringForSplit.split(PunctuationMark.TextMark.END.getMark());
		for (int i = 0; i < textArray.length; i++) {

			// -> Paragraph
			toParagraph(textArray[i], i, textList);
			String[] wordArray = textArray[i].split(" ");
			for (int j = 0; j < wordArray.length; j++) {

				// -> Word
				if (j == wordArray.length - 1) {
					toWord(wordArray[j] + "\n", j, wordList); // toWord(String stringForInsert, int index, List<Word>
																// wordList)
				} else {
					toWord(wordArray[j], j, wordList);
				}
			}

		}
		// -> Sentence
		toSentence(wordList, sentenceList); //
	}

	// get text from words
	String toText(List<Word> listWord) {
		String sentenceLine = "";
		String endOfWord = "";
		for (Word word : listWord) {
			if (word.getEndOfString() == null) {
				endOfWord = "";
			} else {
				endOfWord = word.getEndOfString();
			}
			sentenceLine += word.getStringOfText() + endOfWord + " ";
			if (word.isEndOfParagraph) {
				sentenceLine += "\n";
			}
		}
		return sentenceLine;
	}
}
