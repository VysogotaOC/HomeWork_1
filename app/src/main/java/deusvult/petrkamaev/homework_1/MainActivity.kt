package deusvult.petrkamaev.homework_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.support.design.widget.Snackbar
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var editText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SumBTN.setOnClickListener { v -> sum(v) }
        MultiplyBTN.setOnClickListener { v ->  mult(v) }
        SubBTN.setOnClickListener { v ->  sub(v) }
        DivBTN.setOnClickListener { v ->  div(v) }
    }
    fun sum(v: View){
        editText = findViewById<View>(R.id.EditText_1) as EditText
        val t1 = editText.text.toString()
        editText2 = findViewById<View>(R.id.EditText_2) as EditText
        val t2 = editText2.text.toString()
        if(t1 != "" && t2 !=""){
            val num1 = editText.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val value: Double = num1 + num2
            display(value)
        }else{
            Snackbar.make(findViewById(android.R.id.content), "Fill all fields", Snackbar.LENGTH_SHORT).show()
        }
    }

    fun mult(v: View){
        editText = findViewById<View>(R.id.EditText_1) as EditText
        val t1 = editText.text.toString()
        editText2 = findViewById<View>(R.id.EditText_2) as EditText
        val t2 = editText2.text.toString()
        if(t1 != "" && t2 !=""){
            val num1 = editText.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val value: Double = num1 * num2
            display(value)
        }else{
            Snackbar.make(findViewById(android.R.id.content), "Fill all fields", Snackbar.LENGTH_SHORT).show()
        }
    }
    fun sub(v: View){
        editText = findViewById<View>(R.id.EditText_1) as EditText
        val t1 = editText.text.toString()
        editText2 = findViewById<View>(R.id.EditText_2) as EditText
        val t2 = editText2.text.toString()
        if(t1 != "" && t2 !=""){
            val num1 = editText.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val value: Double = num1 - num2
            display(value)
        }else{
            Snackbar.make(findViewById(android.R.id.content), "Fill all fields", Snackbar.LENGTH_SHORT).show()
        }
    }
    fun div(v: View){
        editText = findViewById<View>(R.id.EditText_1) as EditText
        val t1 = editText.text.toString()
        editText2 = findViewById<View>(R.id.EditText_2) as EditText
        val t2 = editText2.text.toString()
        if(t1 != "" && t2 !=""){
            val num1 = editText.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            if(num2 != 0.0) {
                val value: Double = num1 / num2
                display(value)
            }else{
                Snackbar.make(findViewById(android.R.id.content), "Can't be divided by zero", Snackbar.LENGTH_SHORT).show()
            }
        }else{
            Snackbar.make(findViewById(android.R.id.content), "Fill all fields", Snackbar.LENGTH_SHORT).show()
        }
    }

    fun display(value: Double) {
        val TextView = findViewById<View>(R.id.ResultTxt) as TextView
        TextView.text = "Result: " + value
    }
}
