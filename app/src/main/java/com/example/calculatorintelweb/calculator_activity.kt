package com.example.calculatorintelweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator_activity : AppCompatActivity() {

    lateinit var ButtonAdd: Button
    lateinit var ButtonSub:Button
    lateinit var ButtonDiv:Button
    lateinit var ButtonProduct:Button
    lateinit var edit_fnum:EditText
    lateinit var edit_snum:EditText
    lateinit var text_ans:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        ButtonAdd=findViewById(R.id.add)
        ButtonSub=findViewById(R.id.sub)
        ButtonDiv=findViewById(R.id.div)
        ButtonProduct=findViewById(R.id.product)
        edit_fnum=findViewById(R.id.Edit_number)
        edit_snum=findViewById(R.id.edt_number2)
        text_ans=findViewById(R.id.edt_ans)




        ButtonAdd.setOnClickListener {
        var firstnum = edit_fnum.text.toString()
        var secondnumber = edit_snum.text.toString()
            if(firstnum.isEmpty() &&  secondnumber.isEmpty()){
                text_ans.text = "Please input some numbers!"
            }else{
                var Answer=firstnum.toDouble() + secondnumber.toDouble()
                text_ans.text=Answer.toString()
            }
        }


        ButtonSub.setOnClickListener {
            var firstnum = edit_fnum.text.toString()
            var secondnumber = edit_snum.text.toString()
            if(firstnum.isEmpty() &&  secondnumber.isEmpty()){
                text_ans.text = "Please input some numbers!"
            }else{
                var Answer=firstnum.toDouble() - secondnumber.toDouble()
                text_ans.text=Answer.toString()
            }
        }

        ButtonDiv.setOnClickListener {

            var firstnum = edit_fnum.text.toString()
            var secondnumber = edit_snum.text.toString()
            if(firstnum.isEmpty() &&  secondnumber.isEmpty()){
                text_ans.text = "Please input some numbers!"
            }else{
                var Answer=firstnum.toDouble() / secondnumber.toDouble()
                text_ans.text=Answer.toString()
            }
        }

        ButtonProduct.setOnClickListener {

            var firstnum = edit_fnum.text.toString()
            var secondnumber = edit_snum.text.toString()
            if(firstnum.isEmpty() &&  secondnumber.isEmpty()){
                text_ans.text = "Please input some numbers!"
            }else{
                var Answer=firstnum.toDouble() * secondnumber.toDouble()
                text_ans.text=Answer.toString()
            }
        }
    }
}