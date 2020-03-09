package com.example.swipequiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

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
        rvQuestions.addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
        // Populate the places list and notify the data set has changed.
        for (i in Questions.QUESTIONS.indices) {
            rvQuestions.addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
            questions.add(Questions(Questions.QUESTIONS[i]))
        }
        questionAdapter.notifyDataSetChanged()
    }


}
