package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class CharacterList extends AppCompatActivity {

    Button newCharacter;
    TextView dndTitle;
    ArrayList<StringBuilder> charList = new ArrayList<>();
    String[] name = new String[3], background = new String[3], race = new String[3], job = new String[3], dice = new String[3];
    int[] str = new int[3], dex = new int[3], con = new int[3], intt = new int[3], wis = new int[3], cha = new int[3];
    int counter = 0;
    CharacterMethods dummy;

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

        File dir = Environment.getExternalStorageDirectory();
        File file = new File(dir, "/DnD/character.txt");

        if (file.exists())
        {
            ReadFromSDCard();
            ParseReadCharacter();
        }
    }

    private void createCharacterActivity(){
        Intent intent = new Intent(this, CreationScreen.class);
        startActivity(intent);
    }



    private void ReadFromSDCard()
    {
        File dir = Environment.getExternalStorageDirectory();

        File file = new File(dir, "/DnD/character.txt");

        if (file.exists())
        {
            StringBuilder text = new StringBuilder();

            try
            {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                while ((line = br.readLine()) != null)
                {
                    text.append(line);
                    text.append('n');
                    charList.add(text);
                }
            }
            catch (Exception e) {
                Toast toast = Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else
        {
            Toast toast = Toast.makeText(this, "File Does Not Exists", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    private void ParseReadCharacter()
    {
        for (StringBuilder chars : charList)
        {
            String[] tokens = chars.toString().split(",");
            ConvertToStats(tokens, counter);
            if (counter >= 3)
                counter = 0;
            else
                counter++;
        }
        SetButtons(counter);
    }

    private void ConvertToStats(String[] inTokens, int index)
    {
        name[index] = inTokens[0];
        background[index] = inTokens[1];
        race[index] = inTokens[2];
        job[index] = inTokens[3];
        dice[index] = inTokens[4];

        str[index] = Integer.parseInt(inTokens[5]);
        dex[index] = Integer.parseInt(inTokens[6]);
        con[index] = Integer.parseInt(inTokens[7]);
        intt[index] = Integer.parseInt(inTokens[8]);
        wis[index] = Integer.parseInt(inTokens[9]);
        cha[index] = Integer.parseInt(inTokens[10]);
    }

    private void SetButtons(final int index)
    {
        final Button btn1 = findViewById(R.id.charSlot1);
        final Button btn2 = findViewById(R.id.charSlot2);
        final Button btn3 = findViewById(R.id.charSlot3);

        String charID = name[index] + ", " + race[index] + ", " + job[index] + ", " + background[index];

        if (charList.get(0) != null)
        {
            btn1.setText(charID);
            btn1.setVisibility(View.VISIBLE);
        }

        if (charList.get(1) != null)
        {
            btn2.setText(charID);
            btn2.setVisibility(View.VISIBLE);
        }

        if (charList.get(2) != null)
        {
            btn3.setText(charID);
            btn3.setVisibility(View.VISIBLE);
        }

        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                SendCharacter(index);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                SendCharacter(index);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                SendCharacter(index);
            }
        });
    }

    private void SendCharacter(int index)
    {
        dummy = new Character();

        dummy.SetName(name[index]);
        dummy.SetRace(race[index]);
        dummy.SetJob(job[index]);
        dummy.SetBackground(background[index]);
        dummy.SetDie(dice[index]);

        dummy.SetStrength(str[index]);
        dummy.SetDexterity(dex[index]);
        dummy.SetConstitution(con[index]);
        dummy.SetIntelligence(intt[index]);
        dummy.SetWisdom(wis[index]);
        dummy.SetCharisma(cha[index]);

        Intent mainPage = new Intent(this, CharacterMainDisplayScreen.class);
        mainPage.putExtra("characterInfo", (Character)dummy);

        startActivity(mainPage);
    }
}