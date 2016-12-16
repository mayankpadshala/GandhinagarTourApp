package com.example.android.gandhinagartour;

import java.util.ArrayList;

/**
 * Created by mind on 15/12/16.
 */

public class Places extends ArrayList {

    private String mHeading;

    private String mDescription;

    private int mImageResourceId;

    public Places(String Heading, String Description, int ImageResourceId) {
        mHeading = Heading;
        mDescription = Description;
        mImageResourceId = ImageResourceId;
    }

    public String getHeading() {
        return mHeading;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
