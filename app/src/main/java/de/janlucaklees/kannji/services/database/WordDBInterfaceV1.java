package de.janlucaklees.kannji.services.database;

import java.util.List;

/**
 * Created by Jan-Luca Klees on 2017-02-27.
 */
public interface WordDBInterfaceV1 {
	void storeWord( String word, String reading, String translation );

	void storeWord( String word, List<String> readings, List<String> translations );

	List<Word> getAllWords();
}