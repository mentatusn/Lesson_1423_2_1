package ru.geekbrains.lesson_1423_2_1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity(){
    companion object{
        val field1 = "STATIC_STRING"
    }

    val listener = object : View.OnClickListener{
        override fun onClick(p0: View?) {
            TODO("Not yet implemented")
        }
    }

    var i:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         /*val btn = findViewById<Button>(R.id.SHOW_ALL)
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })*/
        val objTest = Test("Аня", "Оля")
        //val objTest2 = objTest.copy()
        //objTest2.name2 = objTest2.name1
       // Log.d("mylogs","$i  sdrgrerg $i  ${objTest.name1}")
       // Log.d("mylogs","$i  sdrgrerg $i  ${objTest.name2}")
        val getI = objTest.i;
        objTest.i = 2;
        this.i = 2;
        this.i =try {
            throw IllegalStateException()
        }catch (e:IllegalStateException){
            3
        }
        this.i = if( objTest.i==3) {2;
            1}  else 3
        this.i =1
        val str = when(this.i){
            1-> "1"
            2-> {val int1:Int = 12
            int1}
            else ->1
        }
       // Log.d("mylogs","$str")
        val test3 = object  {
            var i:Int = 0
            val field1 = "STATIC_STRING"
        }
        //Log.d("mylogs","  ${test3.i}")
        //Log.d("mylogs","  ${test3.field1}")



        /** циклы */
        val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

        repeat(daysOfWeek.size){
           // Log.d("mylogs","$it")
           // Log.d("mylogs","${daysOfWeek[it]}")

        }



        for(day in daysOfWeek){
            //Log.d("mylogs","$day")

        }
        for(i in 0..daysOfWeek.size-1){
            //Log.d("mylogs", daysOfWeek[i])
        }
        for(i in 0 until daysOfWeek.size){
            //Log.d("mylogs", daysOfWeek[i])
        }
        for(i in daysOfWeek.indices){
          //  Log.d("mylogs", daysOfWeek[i])
        }
        for(i in daysOfWeek.size-1 downTo 0 step 1){ }
        daysOfWeek.reversed().forEach{
            Log.d("mylogs","$it")
        }


    }
}
class Test(var name1: String, var name2: String) {
    var i:Int = 0

}

fun test():Nothing{
    while (true){

    }
}