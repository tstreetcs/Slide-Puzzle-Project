package cs2114.groupproject.pokeslidepuzzle;

import android.view.View;
import android.widget.Button;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import sofia.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Activity;
import android.view.View.OnClickListener;

// -------------------------------------------------------------------------
/**
 * This class represents the activity run once the puzzle has been solved.
 *
 * @author Timothy Street (timvt)
 * @author Filip Gouglev (gfilip1)
 * @author Ryan Bishop (ryanb79)
 * @version 12.08.2013
 */
public class PuzzleSolvedActivity
    extends Activity
{
    @Override
    /**
     * Instantiates a new instance of this activity.
     */
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzlesolvedactivity);
        TextView scoreText = (TextView)findViewById(R.id.scoreText);
        ImageView imgView = (ImageView)findViewById(R.id.imgView);
        scoreText.setText("Great job!");
        Bitmap b1 =
            BitmapFactory.decodeResource(getResources(), R.drawable.pikachu2);
        imgView.setImageBitmap(b1);
        restartButtonClickListener();
        quitClickListener();
    }


    /**
     * Handles the behavior of the restart button. Ends this activity and starts
     * another instance of the MainScreen activity.
     */
    public void restartButtonClickListener()
    {
        Button restartButton = (Button)findViewById(R.id.restartButton);
        restartButton.setOnClickListener(new OnClickListener() {

            public void onClick(View view)
            {
                Intent myIntent =
                    new Intent(PuzzleSolvedActivity.this, MainScreen.class);
                startActivity(myIntent);
                finish();
            }
        });
    }

    /**
     * Handles the activity that quits out of the app completely.
     */
    public void quitClickListener()
    {
        Button quit = (Button)findViewById(R.id.quit);
        quit.setOnClickListener(new OnClickListener() {

            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
