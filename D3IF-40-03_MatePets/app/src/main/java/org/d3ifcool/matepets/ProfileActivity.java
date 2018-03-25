package org.d3ifcool.matepets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ImageButton ic_home = (ImageButton) findViewById(R.id.ivHome);
        ImageButton ic_maps = (ImageButton) findViewById(R.id.ivSearh);
        ImageButton ic_category = (ImageButton) findViewById(R.id.ivCategory);
        ImageButton ic_informartion = (ImageButton) findViewById(R.id.ivInfo);
        ImageButton ic_profile = (ImageButton) findViewById(R.id.ivProfile);

        ic_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity. this, MainActivity.class);
                startActivity(intent);
            }
        });
        ic_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
        ic_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity. this, CategorySearchActivity.class);
                startActivity(intent);
            }
        });
        ic_informartion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Masih Dalam Tahap Pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
        ic_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity. this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
