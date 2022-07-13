package com.dark.giftsuggestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView mTextName;
    Drawable drawable;
    Random mRandom;
    /*
    int[] mGiftPhoto={
            R.drawable.gift_1,
            R.drawable.gift_2,
            R.drawable.gift_3,
            R.drawable.gift_4,
            R.drawable.gift_5,
            R.drawable.gift_6,
            R.drawable.gift_7,
            R.drawable.gift_8,
            R.drawable.gift_9,
    };

     */

    int mGiftPhotoIndex=0;
    /*
    int [][] mGiftPhoto ={
            {R.drawable.gift_1,R.string.gift1},
            {R.drawable.gift_2,R.string.gift2},
            {R.drawable.gift_3,R.string.gift3},
            {R.drawable.gift_4,R.string.gift4},
            {R.drawable.gift_5,R.string.gift5},
            {R.drawable.gift_6,R.string.gift6},
            {R.drawable.gift_7,R.string.gift7},
            {R.drawable.gift_8,R.string.gift8},
            {R.drawable.gift_9,R.string.gift9},
            {R.drawable.gift_10,R.string.gift10},
    };
     */
    int mCurrentGiftPhotoIndex=0;
    private Gift[] mGift={
            new Gift(R.string.gift1,R.drawable.gift_1),
            new Gift(R.string.gift2,R.drawable.gift_2),
            new Gift(R.string.gift3,R.drawable.gift_3),
            new Gift(R.string.gift4,R.drawable.gift_4),
            new Gift(R.string.gift5,R.drawable.gift_5),
            new Gift(R.string.gift6,R.drawable.gift_6),
            new Gift(R.string.gift7,R.drawable.gift_7),
            new Gift(R.string.gift8,R.drawable.gift_8),
            new Gift(R.string.gift9,R.drawable.gift_9),
            new Gift(R.string.gift10,R.drawable.gift_10)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image_gift); //image view is the image view in the layout
        mTextName=findViewById(R.id.gift_text_view); //text name is the text view in the layout
        mRandom =new Random();
    }
    public void display(View view) {
        if (mGiftPhotoIndex < 9) {
            // Show the image at the counter index
            mCurrentGiftPhotoIndex=mRandom.nextInt(10);
          showGift();

        }
        else {
            mGiftPhotoIndex =-1;
            Toast.makeText(this, "لقد وصلت الي نهايه الهدايا وسوف يتم البدء من جديد", Toast.LENGTH_SHORT).show();
        }
    }
    public void showGift() {
        Gift suggestionGift=mGift[mCurrentGiftPhotoIndex];
        drawable =ContextCompat.getDrawable(this,suggestionGift.getPicture());
        imageView.setImageDrawable(drawable);
        mTextName.setText(suggestionGift.getName());
    }
    /*
    public void display(View view) {
        if (mGiftPhotoIndex < 9) {
            // Show the image at the counter index
            Drawable drawable = ContextCompat.getDrawable(this, mGiftPhoto[mGiftPhotoIndex++]);
            imageView.setImageDrawable(drawable);//set the drawable to the image view
        }else {
            mGiftPhotoIndex = 0;
            Toast.makeText(this, "لقد وصلت الي نهايه الهدايا وسوف يتم البدء من جديد", Toast.LENGTH_SHORT).show();
        }
    }

     */
    /*
    public void display(View view){
        try {
            drawable= ContextCompat.getDrawable(this,mGiftPhoto[mGiftPhotoIndex++]);//get the drawable from the image view
            imageView.setImageDrawable(drawable);//set the drawable to the image view
        }catch (ArrayIndexOutOfBoundsException e){
            Toast.makeText(this,"لقد وصلت الي نهايه الهدايا وسوف يتم البدء من جديد",Toast.LENGTH_SHORT).show();
            mGiftPhotoIndex=0;
        }

    }

     */
}