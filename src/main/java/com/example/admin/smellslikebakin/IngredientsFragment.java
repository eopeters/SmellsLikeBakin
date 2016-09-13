package com.example.admin.smellslikebakin;

/**
 * Created by admin on 16-09-06.
 */
public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
