package org.d3ifcool.matepets;

/**
 * Created by DidinHamdaniA.Md.Kom on 13/03/2018.
 */

public class Pets {
    private String mTypePets;
    private String mSpesiesPets;
    private String mGenderPets;
    private int mImageResourceId =  NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Pets(String typePets, String spesiesPets, String genderPets, int imageResourceId){
        mTypePets = typePets;
        mSpesiesPets = spesiesPets;
        mGenderPets = genderPets;
        mImageResourceId = imageResourceId;
    }

    public String getmTypePets() {
        return mTypePets;
    }

    public String getmSpesiesPets() {
        return mSpesiesPets;
    }

    public String getmGenderPets() {
        return mGenderPets;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
