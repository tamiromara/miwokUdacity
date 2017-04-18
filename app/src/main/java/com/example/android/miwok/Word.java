package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for the word.
 */

public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    // Constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word
     * */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     * */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
