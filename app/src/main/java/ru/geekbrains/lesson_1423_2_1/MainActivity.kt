package ru.geekbrains.lesson_1423_2_1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    var i:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val objTest = Test();
        val getI = objTest.i;
        objTest.i = 2;
        this.i = 2;
        this.i =try {
            throw IllegalStateException()
        }catch (e:IllegalStateException){
            3
        }
        Log.d("mylogs","$i  sdrgrerg $i  ${objTest.i}")
    }
}
class Test(){
    var i:Int = 0
}

fun test():Int{
    var i:Int = 0
    return i
}