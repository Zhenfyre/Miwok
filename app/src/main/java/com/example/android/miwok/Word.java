package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getMiworkTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
