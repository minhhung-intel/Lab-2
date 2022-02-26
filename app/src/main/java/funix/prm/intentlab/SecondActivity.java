package funix.prm.intentlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent passedIntent = getIntent();
        Bundle extras = null;
        if (passedIntent != null) {
            extras = passedIntent.getExtras();
        }
        if (extras != null && extras.containsKey(FirstActivity.EXTRA_MSG_KEY)) {
            Toast.makeText(this, extras.getString(FirstActivity.EXTRA_MSG_KEY), Toast.LENGTH_LONG).show();
        }
    }
}