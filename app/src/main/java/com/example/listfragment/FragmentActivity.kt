package com.example.listfragment

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentActivity : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val fruits = arrayOf("Grapes","Pineapple","Apple","Kiw","Mango","Blueberry","Strawberry","Watermelon","Orange","Banana","Guava","Lime","Avocado","papaya")
        val view:View = inflater!!.inflate(R.layout.activity_fragment,container,false)
        val listView = view.findViewById<ListView>(R.id.listfragment)
        val fruitsAdapter:ArrayAdapter<String> = ArrayAdapter(view.context,android.R.layout.simple_list_item_1,fruits)
        listView.adapter = fruitsAdapter
        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(activity,"Item Clicked :-$id",Toast.LENGTH_SHORT).show()

        }
        return view
    }
}