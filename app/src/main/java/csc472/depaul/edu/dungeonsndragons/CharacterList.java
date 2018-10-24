package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CharacterList extends AppCompatActivity {

    Button newCharacter;
    TextView dndTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);

        // we need to display the saved characters at the home page
        newCharacter = findViewById(R.id.newCharacterButton);
        dndTitle = findViewById(R.id.dndTitle);

        newCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String title = dndTitle.getText().toString();
                createCharacterActivity();
            }
        });
    }

    private void createCharacterActivity(){
        Intent intent = new Intent(this, CreationScreen.class);
        startActivity(intent);
    }
}
