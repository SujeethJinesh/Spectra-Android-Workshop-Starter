package app.android.example.com.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void emailMessage(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));

        EditText editText = (EditText) findViewById(R.id.my_edit_text);

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sujeethjinesh@gmail.com"});
        intent.putExtra(Intent.EXTRA_TEXT, editText.getText());

        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 0);
        }
    }

}
