package com.and.ploader.mylibrary

import android.content.Context
import android.widget.Toast

fun Context.toast(s:String){
    Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
}