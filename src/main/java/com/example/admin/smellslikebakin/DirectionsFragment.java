package com.example.admin.smellslikebakin;

/**
 * Created by admin on 16-09-06.
 */
public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");

    }
}
