package ru.geekbrains.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        for (i in 1..10) {
            log("Hello Kotlin!")
        }
        for (i in 10 downTo 1 step 2) {
            log("Hello Kotlin!")
        }

        for (person in Repository.people) {
            if (person.age >= 30) {
                log(person.toString())
            }
        }

        val person2 = Person("Борис", 25)
        val person3 = person2.copy()
        person3.phone = "54764564"
        if (person2 === person3) {
            log("person2 == person3")
        } else {
            log("person2 != person3")
        }
        log(person2.toString())
        log(person3.toString())
    }

    private fun log(i: String) {
        Log.d("MyLogs", i)
    }

    private fun initView() {
        button1 = findViewById<Button>(R.id.button_1).apply {
            setOnClickListener {
                showToast("Hello")
            }
        }

        textView1 = findViewById<TextView>(R.id.text_view_1).apply {
            val person1 = Person("Борис", 25)
            setText(person1.toString())
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}