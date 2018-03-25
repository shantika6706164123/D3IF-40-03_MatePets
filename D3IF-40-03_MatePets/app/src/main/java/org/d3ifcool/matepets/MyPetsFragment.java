package org.d3ifcool.matepets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MyPetsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_pets,container, false);

        final ArrayList<Pets> words = new ArrayList<Pets>();
        words.add(new Pets("Kucing", "Angora","Jantan" ,R.drawable.kucing));
        words.add(new Pets("Anjing", "Chihuahua","Betina", R.drawable.anjing));
        words.add(new Pets("Burung", "Merpati", "Jantan",R.drawable.burung));
        words.add(new Pets("Kucing", "Angora","Jantan" ,R.drawable.kucing));
        words.add(new Pets("Anjing", "Chihuahua","Betina", R.drawable.anjing));
        words.add(new Pets("Burung", "Merpati", "Jantan",R.drawable.burung));
        words.add(new Pets("Kucing", "Angora","Jantan" ,R.drawable.kucing));
        words.add(new Pets("Anjing", "Chihuahua","Betina", R.drawable.anjing));
        words.add(new Pets("Burung", "Merpati", "Jantan",R.drawable.burung));
        words.add(new Pets("Kucing", "Angora","Jantan" ,R.drawable.kucing));
        words.add(new Pets("Anjing", "Chihuahua","Betina", R.drawable.anjing));
        words.add(new Pets("Burung", "Merpati", "Jantan",R.drawable.burung));
        words.add(new Pets("Kucing", "Angora","Jantan" ,R.drawable.kucing));
        words.add(new Pets("Anjing", "Chihuahua","Betina", R.drawable.anjing));
        words.add(new Pets("Burung", "Merpati", "Jantan",R.drawable.burung));


        PetsAdapter adapter = new PetsAdapter(getContext(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
