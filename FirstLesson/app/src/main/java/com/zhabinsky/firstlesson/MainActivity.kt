package com.zhabinsky.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.zhabinsky.firstlesson.data.ClHome
import com.zhabinsky.firstlesson.data.Start

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_click)
        val btnClear = findViewById<Button>(R.id.btn_clear)
        val editText = findViewById<EditText>(R.id.editText_showInfo)

        btnClear.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                editText.setText("")
                Start.clearArray()
            }
        })


        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val st : Start = Start

                st.getArrayToConsole()
                for(x in st.getArray())
                    editText.setText( editText.text.toString() + "\nЗначение = " + x.floorCount + "(" + x.colour + ")" )

                if( st.setValue( 0,"floorCount", "55" ) )
                    println("OK")
                if( st.setValue( 0,"colour", "BROWN" ) )
                    println("OK")
                if( st.setValue( 2,"floorCount", "55" ) )
                    println("OK")

                st.getArrayToConsole()

                var i=0
                while (i < st.getArray().size){
                    editText.setText( editText.text.toString() + "\nЗначение = " + st.getArray()[i].floorCount + "(" + st.getArray()[i].colour + ")" )
                    ++i
                }

                editText.setText( editText.text.toString() + "\n" )
            }
        })
    }
}
