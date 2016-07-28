package com.ssyijiu.alertdialog.ui;


import android.content.Context;
import android.content.res.Resources;

public class DensityUtil {


    public static int dp2px(Context context, float dpValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f); 
    }  


    public static int px2dp(Context context, float pxValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;  
        return (int) (pxValue / scale + 0.5f);  
    }

    public static int sp2px(Resources resources, float spValue){
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return (int) (spValue * scale + 0.5f);
    }
}
