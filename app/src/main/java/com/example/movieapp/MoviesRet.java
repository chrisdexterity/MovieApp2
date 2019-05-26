package com.example.movieapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MoviesRet extends BaseAdapter {
    Context mContext;
    public MoviesRet(Context context){
        this .mContext=context;
    }
    int[] Images={
            R.drawable.bb,R.drawable.bbbb,R.drawable.bnhjk,R.drawable.bnmj,R.drawable.bty,R.drawable.bv,R.drawable.cfg,
            R.drawable.frt,R.drawable.gyt,R.drawable.hhh,R.drawable.huy,R.drawable.jjj,R.drawable.kil,R.drawable.mmmm,
            R.drawable.nmb,R.drawable.nnn,R.drawable.nuj,R.drawable.shaz,

    };
    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public Object getItem(int position) {
        return Images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(Images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }
}
