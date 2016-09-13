package com.example.admin.smellslikebakin;

/**
 * Created by admin on 16-09-06.
 */
public class GridAdapter extends RecyclerAdapter {
    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }


    @Override
    protected int getLayoutid() {
        return R.layout.grid_item;
    }


    @Override
    protected void onRecipeSelected(int mIndex) {
        mListener.onGridRecipeSelected(mIndex);
    }
}
