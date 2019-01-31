package basic.anas.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewdice;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewdice = findViewById(R.id.image_view_dice);
        imageViewdice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }

        public void roll(){
            int randomnumber = rnd.nextInt(6) + 1;
            switch (randomnumber) {
                case 1:
                    imageViewdice.setImageResource(R.drawable.dice1);
                    break;
                case 2:
                    imageViewdice.setImageResource(R.drawable.dice2);
                    break;
                case 3:
                    imageViewdice.setImageResource(R.drawable.dice3);
                    break;
                case 4:
                    imageViewdice.setImageResource(R.drawable.dice4);
                    break;
                case 5:
                    imageViewdice.setImageResource(R.drawable.dice5);
                    break;
                case 6:
                    imageViewdice.setImageResource(R.drawable.dice6);
                    break;
            }
        }

}
