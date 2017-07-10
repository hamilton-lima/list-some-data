package com.example.hamiltonlima.listsomedata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String loremIpsum = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem " +
            "accusantium doloremque laudantium totam rem aperiam eaque ipsa quae ab illo " +
            "inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo Nemo " +
            "enim ipsam voluptatem";

    String[] words;
    int records = 50;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.mainList);
        buildArrayOfWords();
        addData(list);
    }

    private void buildArrayOfWords() {
        words = loremIpsum.split(" ");
    }

    private void addData(ListView list) {
        List<Task> data = generateRandomData();
        list.setAdapter(new TaskListAdapter(data));
    }

    private List<Task> generateRandomData() {
        List<Task> data = new ArrayList<Task>();

        for (int n = 0; n < records; n++) {
            String name = getRandomName();
            data.add(new Task(name));
        }
        return data;
    }

    public String getRandomName() {
        StringBuffer buffer = new StringBuffer();

        Random random = new Random();
        int numberOfWords = random.nextInt(4) + 1;

        for (int n = 0; n < numberOfWords; n++) {
            int pos = random.nextInt(words.length - 1);
            buffer.append(words[pos]);
            buffer.append(" ");
        }

        return buffer.toString().trim();
    }
}
