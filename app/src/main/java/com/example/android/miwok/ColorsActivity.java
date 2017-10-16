package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private static final String LOG_TAG = "ColorsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an ArrayList of type Word called words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

        // Create an {@link WordAdapter}, whose data source is a list of Words. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout file found in the package com.example.android.miwok
        // This list item layout contains 2 {@link TextView}, which the adapter will set to
        // display a word in its miwok as well as default translation.
        ArrayAdapter<Word> itemsAdapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link WordAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
