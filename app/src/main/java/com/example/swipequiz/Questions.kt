package com.example.swipequiz

data class Questions(
    var question: String

) {
    companion object {
        val QUESTIONS = arrayOf(
            "A 'val' and 'var' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin cooresponds to a void in Java.",
            "In Kotlin 'when' replaces the 'switch' operator in Java."
        )
    }
}
