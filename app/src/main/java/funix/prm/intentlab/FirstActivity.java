package funix.prm.intentlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText mMessage;
    public static final String EXTRA_MSG_KEY = "EXTRA_MSG_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mMessage = findViewById(R.id.etMessage);
    }

    public void newIntentClick(View view) {
        Intent secondActivityIntent = new Intent(FirstActivity.this, SecondActivity.class);
        secondActivityIntent.putExtra(EXTRA_MSG_KEY, mMessage.getText().toString());
        FirstActivity.this.startActivity(secondActivityIntent);
    }

}