package com.buxmeapp.utilities;

import android.view.animation.LayoutAnimationController;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Arbeeorlar on 02/01/2016.
 */
public class anim {

    public static void performAnimationRelativeLayout(RelativeLayout viewToAnimate) {
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(500);
        set.addAnimation(animation);

        animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        animation.setDuration(500);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(
                set, 0.5f);
        //RelativeLayout loading = (RelativeLayout) findViewById(R.id.loading);
        viewToAnimate.setVisibility(View.VISIBLE);
        viewToAnimate.setLayoutAnimation(controller);
    }
    public static void performAnimation(LinearLayout viewToAnimate) {
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(500);
        set.addAnimation(animation);

        animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        animation.setDuration(500);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(
                set, 0.5f);
        //RelativeLayout loading = (RelativeLayout) findViewById(R.id.loading);
        viewToAnimate.setVisibility(View.VISIBLE);
        viewToAnimate.setLayoutAnimation(controller);
    }
    public static void setRobotoFont(Context context,TextView textView,String FontType){
        //Typeface tf=Typeface.createFromAsset(context.getAssets(),"fonts/"+FontType);
        //textView.setTypeface(tf);
    }
    public static void setRobotoButtonFont(Context context,Button button,String FontType){
        //Typeface tf=Typeface.createFromAsset(context.getAssets(), "fonts/"+FontType);
        //button.setTypeface(tf);
    }
    public static void setRobotoEditTextFont(Context context,EditText txtBox,String FontType){
        //Typeface tf=Typeface.createFromAsset(context.getAssets(), "fonts/"+FontType);
        //txtBox.setTypeface(tf);
    }
}
