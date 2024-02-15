package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curNum = findViewById<TextView>(R.id.tVCurNum)
        val backNum = findViewById<TextView>(R.id.tVBackNum)
        var answer: Boolean  = false
        var num1: Double = 0.0;
        var num2: Double = 0.0;

        val btn1: Button = findViewById(R.id.butOne)
        btn1.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth" || answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("1")
        }

        val btn2: Button = findViewById(R.id.butTwo)
        btn2.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("2")
        }

        val btn3: Button = findViewById(R.id.butThree)
        btn3.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("3")
        }

        val btn4: Button = findViewById(R.id.butFour)
        btn4.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("4")
        }

        val btn5: Button = findViewById(R.id.butFive)
        btn5.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("5")
        }

        val btn6: Button = findViewById(R.id.butSix)
        btn6.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("6")
        }

        val btn7: Button = findViewById(R.id.butSeven)
        btn7.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("7")
        }

        val btn8: Button = findViewById(R.id.butEight)
        btn8.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("8")
        }

        val btn9: Button = findViewById(R.id.butNine)
        btn9.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("9")
        }

        val btn0: Button = findViewById(R.id.butZero)
        btn0.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append("0")
        }

        val btnDot: Button = findViewById(R.id.butDot)
        btnDot.setOnClickListener {
            if (curNum.text == "Error" || curNum.text == "Input smth"|| answer) {
                curNum.text = ""
                answer = false
            }
            curNum.append(".")
        }

        val btnCL: Button = findViewById(R.id.butClear)
        btnCL.setOnClickListener {
            curNum.setText("")
            backNum.setText("")
        }


        var operation: String = ""

        val btnAdd: Button = findViewById(R.id.butPlus)
        btnAdd.setOnClickListener {
            operation = "+"
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }

        val btnMin: Button = findViewById(R.id.butMinus)
        btnMin.setOnClickListener {
            operation = "-"
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }

        val btnDiv: Button = findViewById(R.id.butDivis)
        btnDiv.setOnClickListener {
            operation = "/"
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }

        val btnMulti: Button = findViewById(R.id.butMulti)
        btnMulti.setOnClickListener {
            operation = "*"
            val currentText = curNum.text.toString()
            curNum.text = ""
            backNum.text = currentText
            num1 = backNum.text.toString().toDouble()
        }


        val btnEq: Button = findViewById(R.id.butEqual)
        btnEq.setOnClickListener {
            if(!curNum.text.isEmpty()) {
                num2 = curNum.text.toString().toDouble()
                if (num2 == 0.0) {
                    curNum.text = "Error"
                } else {
                    var result: Double = 0.0

                    backNum.append(" " + operation + " " + curNum.text.toString() + " = ")

                    when (operation) {
                        "+" -> result = num1 + num2
                        "-" -> result = num1 - num2
                        "*" -> result = num1 * num2
                        "/" -> result = num1 / num2
                    }
                    answer = true
                    if(result % 2.0 == 0.0)
                        curNum.text = result.toInt().toString()
                    else
                        curNum.text = result.toString()
                }
            }
            else if(answer){
                var result: Double = 0.0
                num1 = curNum.text.toString().toDouble()
                when (operation) {
                    "+" -> result = num1 + num2
                    "-" -> result = num1 - num2
                    "*" -> result = num1 * num2
                    "/" -> result = num1 / num2
                }
            }
            else {curNum.text = "Input smth"}
        }
    }
}
