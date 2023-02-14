package com.example.kotlincdalyon

import android.content.Context
import android.util.AttributeSet
import android.util.Log


class MyBtn: androidx.appcompat.widget.AppCompatButton {
    //Alt + INS
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.i("Mybtn", "Click button")
    }
}