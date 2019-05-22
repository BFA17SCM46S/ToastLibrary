package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void getToastMethod(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
