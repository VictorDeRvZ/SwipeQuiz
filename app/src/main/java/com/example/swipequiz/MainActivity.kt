package com.example.swipequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val questions = arrayListOf<Questions>()
    private val questionAdapter = QuestionAdapter(questions)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        rvQuestions.layoutManager =   LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)

        rvQuestions.adapter = questionAdapter

        // Populate the places list and notify the data set has changed.
        for (i in Questions.QUESTIONS.indices) {
            questions.add(Questions(Questions.QUESTIONS[i]))
        }
        questionAdapter.notifyDataSetChanged()
    }

}
