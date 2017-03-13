package com.bit_makers.realm.adapters;

import android.support.v7.widget.RecyclerView;
import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;

/**
 * Developed by Fojle Rabbi Saikat on 3/7/2017.
 * Owned by Bitmakers Ltd.
 * Contact fojle.rabbi@bitmakers-bd.com
 */
public abstract class RealmRecyclerViewAdapater<T extends RealmObject> extends RecyclerView.Adapter {

    private RealmBaseAdapter<T> realmBaseAdapter;

    public T getItem(int position) {

        return realmBaseAdapter.getItem(position);
    }

    public RealmBaseAdapter<T> getRealmAdapter() {

        return realmBaseAdapter;
    }

    public void setRealmAdapter(RealmBaseAdapter<T> realmAdapter) {

        realmBaseAdapter = realmAdapter;
    }
}
