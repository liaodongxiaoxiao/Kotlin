package com.ldxx.kotlin.mvp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.ldxx.kotlin.R
import com.ldxx.kotlin.mvp.bean.Person
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

        when (item?.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.action_settings -> {
                startActivity(Intent(this, ExcelPanelActivity::class.java))
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return true
    }
}
