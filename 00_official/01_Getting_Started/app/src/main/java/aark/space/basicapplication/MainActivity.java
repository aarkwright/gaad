package aark.space.basicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Constants
    public static final String EXTRA_MESSAGE = "space.aark.basicapplication.MESSAGE";

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user taps the send button
    public void sendMessage(View v) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sayHello(View v) {
        final String helloWorld = getResources().getString(R.string.hello_world);
        final TextView textViewHello = (TextView) findViewById(R.id.textViewHello);
//        Button btnHello = (Button) findViewById(R.id.btnHello);

        textViewHello.setText(helloWorld);
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textViewHello.setText(helloWorld);
//            }
//        });
    }
}
