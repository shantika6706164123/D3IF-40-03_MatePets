package org.d3ifcool.matepets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MyPetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pets);

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

        PetsAdapter adapter = new PetsAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
