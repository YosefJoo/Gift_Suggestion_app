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
    private Gift[] mGift=new Gift[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image_gift); //image view is the image view in the layout
        mTextName=findViewById(R.id.gift_text_view); //text name is the text view in the layout
        mRandom =new Random();
        Gift gif1t=new Gift();
        gif1t.setName(R.string.gift1);
        gif1t.setPicture(R.drawable.gift_1);
        mGift[0]=gif1t;
        Gift gift2=new Gift();
        gift2.setName(R.string.gift2);
        gift2.setPicture(R.drawable.gift_2);
        mGift[1]=gift2;
        Gift gift3=new Gift();
        gift3.setName(R.string.gift3);
        gift3.setPicture(R.drawable.gift_3);
        mGift[2]=gift3;
        Gift gift4=new Gift();
        gift4.setName(R.string.gift4);
        gift4.setPicture(R.drawable.gift_4);
        mGift[3]=gift4;
        Gift gift5=new Gift();
        gift5.setName(R.string.gift5);
        gift5.setPicture(R.drawable.gift_5);
        mGift[4]=gift5;
        Gift gift6=new Gift();
        gift6.setName(R.string.gift6);
        gift6.setPicture(R.drawable.gift_6);
        mGift[5]=gift6;
        Gift gift7=new Gift();
        gift7.setName(R.string.gift7);
        gift7.setPicture(R.drawable.gift_7);
        mGift[6]=gift7;
        Gift gift8=new Gift();
        gift8.setName(R.string.gift8);
        gift8.setPicture(R.drawable.gift_8);
        mGift[7]=gift8;
        Gift gift9=new Gift();
        gift9.setName(R.string.gift9);
        gift9.setPicture(R.drawable.gift_9);
        mGift[8]=gift9;
        Gift gift10=new Gift();
        gift10.setName(R.string.gift10);
        gift10.setPicture(R.drawable.gift_10);
        mGift[9]=gift10;

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