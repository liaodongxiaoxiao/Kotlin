package com.ldxx.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.ldxx.kotlin.bean.Person
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setSupportActionBar(toolBar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val p: Person = intent.getSerializableExtra("person") as Person
        username.text = p.name
        age.text = String.format(getString(R.string.str_age_format), p.age)


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
