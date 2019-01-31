package com.elgigs.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {
    private String[] data;
    public PeopleAdapter(String[] data)
    {
        this.data = data;
    }
    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.people_list_layout, viewGroup, false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder peopleViewHolder, int i) {
        String pName = data[i];
        peopleViewHolder.personName.setText(pName);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class PeopleViewHolder  extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView personName, bio;
        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.profle_pic);
            personName = itemView.findViewById(R.id.perosn_name);
            bio = itemView.findViewById(R.id.persom_bio);
        }
    }
}
