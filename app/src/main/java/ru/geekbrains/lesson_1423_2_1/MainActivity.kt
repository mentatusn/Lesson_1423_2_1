package ru.geekbrains.lesson_1423_2_1

import android.os.Bundle
import android.util.Log
import android.view.View
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
        val objTest = Test("Аня", "Оля")
        Log.d("mylogs","$i  sdrgrerg $i  ${objTest.name1}")
        Log.d("mylogs","$i  sdrgrerg $i  ${objTest.name2}")
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

        Log.d("mylogs","$str")


        val test3 = object  {
            var i:Int = 0
            val field1 = "STATIC_STRING"
        }
        //Log.d("mylogs","  ${test3.i}")
        //Log.d("mylogs","  ${test3.field1}")


    }
}
class Test(var name1: String, var name2: String) {
    var i:Int = 0

}

fun test(name1: String,name2: String=""):Int{
    var i:Int = 0
    return i


}