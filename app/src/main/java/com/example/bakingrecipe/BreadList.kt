package com.example.bakingrecipe

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout.VERTICAL
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingrecipe.Adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_pie_list.*
import kotlinx.android.synthetic.main.app_bar_main.*


class BreadList : AppCompatActivity() {

    private val productlist: List<Item>? = null
    //val name1 : MutableList<String> =ArrayList()
    private lateinit var searchView:SearchView
    lateinit var adapter:MyAdapter




    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bread_list)


        val rview = findViewById<View>(R.id.rview) as RecyclerView

        val place = intArrayOf(
            R.drawable.chocolate_chip_banana_bread,
            R.drawable.garlic_bread,
            R.drawable.irish_soda_bread,
            R.drawable.cheesy_garlic_bread_meatball_ring,
            R.drawable.chicken_parmesan_stuffed_garlic_bread
        )

        val name = arrayOf("Chocolate Chip Banana Bread",
            "Garlic Bread",
            "Irish Soda Bread",
            "Cheesy Garlic Bread Meatball Ring",
            "Chicken Parmesan-Stuffed Garlic Bread")

        val lManager = LinearLayoutManager(this, VERTICAL, false)
        rview.setLayoutManager(lManager)

        rview.setHasFixedSize(true)
        rview.adapter = MyAdapter(place, name, this)

    }


    /*fun loadData (){

        name1.add("Chocolate Chip Banana Bread")
        name1.add("Garlic Bread")
        name1.add("Irish Soda Bread")
        name1.add("Cheesy Garlic Bread Meatball Ring")
        name1.add("Chicken Parmesan-Stuffed Garlic Bread")
        // productlist.addAll(name1)



    }*/


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)

        var item: MenuItem = menu!!.findItem(R.id.menu_search)
        searchView = MenuItemCompat.getActionView(item) as SearchView
        MenuItemCompat.setOnActionExpandListener(
            item, object : MenuItemCompat.OnActionExpandListener {
                override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
                    toolbar.setBackgroundColor(Color.WHITE)
                    (searchView.findViewById(R.id.search_src_text) as EditText).setHintTextColor(
                        Color.BLACK
                    )
                    return true
                }

                override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
                    toolbar.setBackgroundColor(resources.getColor(R.color.colorLogin1))
                    searchView.setQuery("", false)
                    return true
                }
            })
        searchView.maxWidth = Int.MAX_VALUE
        searchName(searchView)

        return true
    }

    private fun searchName(searchView: SearchView) {
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }


        })
    }


    override fun onBackPressed() {
        if(!searchView.isIconified)
        {
            searchView.isIconified = true
            return
        }
        super.onBackPressed()
    }



}
