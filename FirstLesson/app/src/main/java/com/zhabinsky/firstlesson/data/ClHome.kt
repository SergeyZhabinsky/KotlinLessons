package com.zhabinsky.firstlesson.data

//import android.widget.EditText
//import java.text.FieldPosition
//import kotlin.math.floor

data class ClHome( val floorCount : Int = 2, val colour : String = "Yellow"  )

object Start {
    var homes : ArrayList<ClHome> = arrayListOf()

    init {
        initial()
    }

    private fun initial(){
        homes.add( ClHome(floorCount = 3, "White") )
        homes.add( ClHome(floorCount = 4, "Yellow") )
        homes.add( ClHome(floorCount = 7, "Green") )
    }

    fun clearArray(){
        homes.clear()
        initial()
    }


    fun setValue( _nClass : Int, _field : String, _value : String ) : Boolean{
        var bRetValue = true

        if(_nClass.toInt() <= homes.size-1){

            if(_field.equals("floorCount", true) ){
                homes[_nClass] = homes[_nClass].copy( floorCount = _value.toInt() )
            }else if(_field.equals("colour", true) ){
                homes[_nClass] = homes[_nClass].copy( colour = _value )
            }else bRetValue = false

        }
        else bRetValue = false

        return bRetValue
    }


    fun getArrayToConsole(){
        for(x in homes)
            println( "Значение = " + x.floorCount + "(" + x.colour + ")")
    }


    fun getArray() : ArrayList<ClHome> = homes

}
