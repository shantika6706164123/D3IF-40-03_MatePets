package org.d3ifcool.matepets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddPetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pets);

        Button img_upload = (Button) findViewById(R.id.btn_input_pets);

        img_upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(AddPetsActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton ic_home = (ImageButton) findViewById(R.id.ivHome);
        ImageButton ic_maps = (ImageButton) findViewById(R.id.ivSearh);
        ImageButton ic_category = (ImageButton) findViewById(R.id.ivCategory);
        ImageButton ic_informartion = (ImageButton) findViewById(R.id.ivInfo);
        ImageButton ic_profile = (ImageButton) findViewById(R.id.ivProfile);

        ic_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddPetsActivity. this, MainActivity.class);
                startActivity(intent);
            }
        });
        ic_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddPetsActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
        ic_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddPetsActivity. this, CategorySearchActivity.class);
                startActivity(intent);
            }
        });
        ic_informartion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddPetsActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
        ic_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddPetsActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
