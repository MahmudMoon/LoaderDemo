package com.example.bou.loaderdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.Arrays;
import java.util.List;

public class StringLoader extends AsyncTaskLoader<List<String>> {
    Context mContext;
    public StringLoader(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<String> loadInBackground() {
        List<String> stringList = Arrays.asList(getContext().getResources().getStringArray(R.array.item));
        return stringList;
    }
}
