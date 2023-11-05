package com.example.googleplay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Category>()
        val apps1 = ArrayList<App>()
        val app11 = App("image", "Githubs", "4.6")
        val app12 = App("image", "Japanese", "1.0")
        val app13 = App("image", "Nihongo", "0.9")
        val app14 = App("image", "Ielts", "4.6")
        apps1.add(app11)
        apps1.add(app12)
        apps1.add(app13)
        apps1.add(app14)
        val category1 = Category("Technologies", apps1)

        val apps2 = ArrayList<App>()
        // val app11 = App("image", "Githubs", "4.6")
        // val app12 = App("image", "Japanese", "1.0")
        // val app13 = App("image", "Nihongo", "0.9")
        // val app14 = App("image", "Ielts", "4.6")

        apps2.add(app11)
        apps2.add(app12)
        apps2.add(app13)
        apps2.add(app14)
        val category2 = Category("Workout", apps2)

        val apps3 = ArrayList<App>()
        // val app11 = App("image", "Githubs", "4.6")
        // val app12 = App("image", "Japanese", "1.0")
        // val app13 = App("image", "Nihongo", "0.9")
        // val app14 = App("image", "Ielts", "4.6")
        apps3.add(app11)
        apps3.add(app12)
        apps3.add(app13)
        apps3.add(app14)
        val category3 = Category("Health & fitness", apps3)

        data.add(category1)
        data.add(category2)
        data.add(category3)

        val categoryAdapter = CategoryAdapter(data, this)
        val rvApp = findViewById<RecyclerView>(R.id.categories)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvApp.layoutManager = layoutManager
        rvApp.adapter = categoryAdapter
    }
}
