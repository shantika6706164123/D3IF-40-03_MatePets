package org.d3ifcool.matepets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DidinHamdaniA.Md.Kom on 13/03/2018.
 */

public class PetsAdapter extends ArrayAdapter<Pets> {

    public PetsAdapter(@NonNull Context context,
                       @NonNull ArrayList<Pets> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Pets currentPets = getItem(position);

        TextView typePets = (TextView) listitemView.findViewById(R.id.type_pets);
        typePets.setText(currentPets.getmTypePets());

        TextView spesiesPets = (TextView) listitemView.findViewById(R.id.spesies_pets);
        spesiesPets.setText(currentPets.getmSpesiesPets());

        TextView genderPets = (TextView) listitemView.findViewById(R.id.gender_pets);
        genderPets.setText(currentPets.getmGenderPets());

        ImageView imgPets = (ImageView) listitemView.findViewById(R.id.image_pets);
        if (currentPets.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imgPets.setImageResource(currentPets.getmImageResourceId());
            // Make sure the view is visible
            imgPets.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imgPets.setVisibility(View.GONE);
        }

        return listitemView;
    }
}
