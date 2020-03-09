package com.example.swipequiz

import androidx.annotation.DrawableRes

data class Questions(
    var question: String

) {
    companion object {
        val QUESTIONS = arrayOf(
            "vraag 1",
            "vraag 2"
        )
    }
}
