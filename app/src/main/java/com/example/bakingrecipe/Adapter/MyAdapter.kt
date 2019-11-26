package com.example.bakingrecipe.Adapter

import android.content.ClipData.Item
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingrecipe.Holder.MyHolder
import com.example.bakingrecipe.R
import com.example.bakingrecipe.name
import com.example.bakingrecipe.ui.Bread.CheesyGarlicBreadMeatballRing
import com.example.bakingrecipe.ui.Bread.ChocolateChipBananaBread
import com.example.bakingrecipe.ui.Bread.GarlicBread
import com.example.bakingrecipe.ui.Bread.IrishSodaBread
import layout.CostomItemClickListener


class MyAdapter (private val place : IntArray, private val name :Array<String>, private val mContext: Context):RecyclerView.Adapter<MyHolder>(), Filterable {



    lateinit var list:MutableList<name>
    lateinit var listFiltered: MutableList<name>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.bread_list2, parent, false)
        return MyHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder?.index(place[position], name[position])
        holder.setOnCostomItemClickListener(object:CostomItemClickListener{
            override fun onCostomItemClickListener(view: View, pos: Int) {




                if(position == 0)
                {
                    val intent = Intent(view.context, ChocolateChipBananaBread::class.java)
                    view.context.startActivity(intent)

                    /*val hisdatasource = HistoryDateSource(this)
                    val historyRecord = HistoryRecord()
                    historyRecord.name = "Chocolate Chip Banana Bread"

                    if (!hisdatasource.getRecord("Chocolate Chip Banana Bread")) {
                        hisdatasource.insertHistory(historyRecord)
                    }*/
                }
                if(position == 1)
                {
                    val intent = Intent(view.context, GarlicBread::class.java)
                    view.context.startActivity(intent)
                }
                if(position == 2)
                {
                    val intent = Intent(view.context, IrishSodaBread::class.java)
                    view.context.startActivity(intent)
                }
                if(position == 3)
                {
                    val intent = Intent(view.context, CheesyGarlicBreadMeatballRing::class.java)
                    view.context.startActivity(intent)
                }
                if(position == 4)
                {
                    val intent = Intent(view.context, CheesyGarlicBreadMeatballRing::class.java)
                    view.context.startActivity(intent)
                }
                //Toast.makeText(mContext, "Name: ", Toast.LENGTH_LONG).show()
            }
        })
    }



    override fun getItemCount(): Int {
        return place.size
        return listFiltered.size
    }

    private var onItemClickListener: AdapterView.OnItemClickListener? = null

    fun setOnItemClickListener(onItemClickListener: AdapterView.OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    override fun getFilter(): Filter {
        return object: Filter(){
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                var charString: String = constraint.toString()
                if (charString.isEmpty())
                {
                    listFiltered =list
                }
                else
                {
                    var filteredList: MutableList<name> = mutableListOf()
                    for(s: name in list)
                    {
                        if(s.getSname().toLowerCase().contains(charString.toLowerCase()))
                        {
                            filteredList.add(s)
                        }
                    }
                    listFiltered = filteredList
                }
                var filterResults:FilterResults = FilterResults()
                filterResults.values = listFiltered
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                listFiltered = results!!.values as MutableList<name>
                notifyDataSetChanged()

            }
        }
    }


}


