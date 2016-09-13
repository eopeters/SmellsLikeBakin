package com.example.admin.smellslikebakin;

/**
 * Created by admin on 16-09-06.
 */
public class ListAdapter extends RecyclerAdapter {
    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }


    @Override
    protected int getLayoutid() {
        return R.layout.list_item;
    }



    @Override
    protected void onRecipeSelected(int mIndex) {
        mListener.onListRecipeSelected(mIndex);
    }

}
