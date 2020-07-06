package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID() { return mAudioResourceID; }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
