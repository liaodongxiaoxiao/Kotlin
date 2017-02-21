package com.ldxx.kotlin.extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * Created by ldxx
 * on 2017/2/21.
 */
fun Context.toast(message: CharSequence) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.toast(message: CharSequence, time: Int) =
        Toast.makeText(this, message, time).show()

fun Context.hideKeyboard(caller: View) {
    caller.postDelayed({
        try {
            val imm = caller.getContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(caller.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS)
        } catch (e: Exception) {
            Log.w(javaClass.getSimpleName(), "Could not hide keyboard. " + e.message)
        }
    }, 100)
}

fun Context.showKeyboard(caller: View) {
    caller.postDelayed({
        val imm = caller.getContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(caller, InputMethodManager.SHOW_IMPLICIT)
    }, 100)
}

/**
 * Creates [Pair] to use with Lolipop [Activity] transitions
 * @author Jacek Kwiecień
 * @param view transitioned view
 * @param key unique transition key
 */
fun Context.makeTransitionPair(view: View, key: String): android.support.v4.util.Pair<View, String> {
    return android.support.v4.util.Pair(view, key)
}

fun Context.getString(strId:Int) = this.getString(strId)