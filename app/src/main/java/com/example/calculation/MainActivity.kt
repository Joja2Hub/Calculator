package com.example.calculation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curNum = findViewById<TextView>(R.id.tVCurNum)
        val backNum = findViewById<TextView>(R.id.tVBackNum)
        val operationText = findViewById<TextView>(R.id.tVOperation)
        var answer: Boolean  = false
        var num1: Double = -2342.2;
        var num2: Double = num1;

        val btn1: Button = findViewById(R.id.butOne)
        btn1.setOnClickListener {
            curNum.append("1")
        }

        val btn2: Button = findViewById(R.id.butTwo)
        btn2.setOnClickListener {
            curNum.append("2")
        }

        val btn3: Button = findViewById(R.id.butThree)
        btn3.setOnClickListener {
            curNum.append("3")
        }

        val btn4: Button = findViewById(R.id.butFour)
        btn4.setOnClickListener {
            curNum.append("4")
        }

        val btn5: Button = findViewById(R.id.butFive)
        btn5.setOnClickListener {
            curNum.append("5")
        }

        val btn6: Button = findViewById(R.id.butSix)
        btn6.setOnClickListener {
            curNum.append("6")
        }

        val btn7: Button = findViewById(R.id.butSeven)
        btn7.setOnClickListener {
            curNum.append("7")
        }

        val btn8: Button = findViewById(R.id.butEight)
        btn8.setOnClickListener {
            curNum.append("8")
        }

        val btn9: Button = findViewById(R.id.butNine)
        btn9.setOnClickListener {
            curNum.append("9")
        }

        val btn0: Button = findViewById(R.id.butZero)
        btn0.setOnClickListener {
            curNum.append("0")
        }

        val btnDot: Button = findViewById(R.id.butDot)
        btnDot.setOnClickListener {
            curNum.append(".")
        }

        val btnCL: Button = findViewById(R.id.butClear)
        btnCL.setOnClickListener {
            curNum.text = ""
            backNum.text = ""
            operationText.text = ""
        }


        var operation: String = ""

        val btnAdd: Button = findViewById(R.id.butPlus)
        btnAdd.setOnClickListener {
            if(backNum.text.isEmpty() || operationText.text.isEmpty()) {
                operation = "+"
                operationText.text = operation
                backNum.text = curNum.text
                curNum.text = ""
                num1 = backNum.text.toString().toDouble()
            }
            else
            {
                val result: Double = num1 + num2
                if(result % 10.0 == 0.0)
                    backNum.text = result.toInt().toString()
                else
                    backNum.text = result.toString()
                num2 = result;
            }

        }

        val btnMin: Button = findViewById(R.id.butMinus)
        btnMin.setOnClickListener {
            operation = "-"
            operationText.text = operation
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }

        val btnDiv: Button = findViewById(R.id.butDivis)
        btnDiv.setOnClickListener {
            operation = "/"
            operationText.text = operation
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }

        val btnMulti: Button = findViewById(R.id.butMulti)
        btnMulti.setOnClickListener {
            if(curNum.text.isNotEmpty() || backNum.text.isNotEmpty() || operationText.text.isNotEmpty()) {

            }
            else {
                operation = "*"
                operationText.text = operation
                val currentText = curNum.text.toString()
                curNum.text = ""
                backNum.text = currentText
                num1 = backNum.text.toString().toDouble()
            }
        }


        val btnEq: Button = findViewById(R.id.butEqual)
        btnEq.setOnClickListener {
            if(curNum.text.isNotEmpty() || backNum.text.isNotEmpty() || operationText.text.isNotEmpty()) {
                num2 = curNum.text.toString().toDouble()
                if (num2 == 0.0) {
                    Toast.makeText(this, "Заполните поле ввода", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    var result: Double = 0.0
                    when (operation) {
                        "+" -> result = num1 + num2
                        "-" -> result = num1 - num2
                        "*" -> result = num1 * num2
                        "/" -> result = num1 / num2
                    }
                    //answer = true
                    if(result % 10.0 == 0.0)
                        backNum.text = result.toInt().toString()
                    else
                        backNum.text = result.toString()
                    num2 = result
                }
            }

            else {curNum.text = "";
                Toast.makeText(this, "Заполните всн поля ввода", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
