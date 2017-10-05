package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTAns1Button;
    Button mTAns2Button;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTAns1Button = (Button) findViewById(R.id.buttonTop);
        mTAns2Button = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTAns1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTAns1Button.setText(R.string.T3_Ans1);
                    mTAns2Button.setText(R.string.T3_Ans2);
                    mStoryIndex+=2; // Increment to the next story
                } else if (mStoryIndex == 3 || mStoryIndex == 4) {
                    mStoryTextView.setText(R.string.T6_End);
                    mTAns1Button.setVisibility(View.GONE);
                    mTAns2Button.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mTAns2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 ) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTAns1Button.setText(R.string.T2_Ans1);
                    mTAns2Button.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mTAns1Button.setVisibility(View.GONE);
                    mTAns2Button.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 3 || mStoryIndex == 4) {
                    mStoryTextView.setText(R.string.T5_End);
                    mTAns1Button.setVisibility(View.GONE);
                    mTAns2Button.setVisibility(View.GONE);
                }
            }
        });

    }
}
