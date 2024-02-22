package com.example.calculation


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curNum = findViewById<EditText>(R.id.edCurNum)
        val backNum = findViewById<TextView>(R.id.tVBackNum)
        val operationText = findViewById<TextView>(R.id.tVOperation)
        var num1 = 0.0
        var num2: Double

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
            if(curNum.text.isEmpty())
                curNum.append("0.")
            else
                curNum.append(".")
        }

        val btnCL: Button = findViewById(R.id.butClear)
        btnCL.setOnClickListener {
            curNum.text.clear()
            backNum.text = ""
            operationText.text = ""
        }


        var operation = ""

        val btnAdd: Button = findViewById(R.id.butPlus)
        btnAdd.setOnClickListener {
            if (backNum.text.isEmpty() && operationText.text.isEmpty()) {
                operation = "+"
                operationText.text = operation
                backNum.text = curNum.text
                curNum.text.clear()
                num1 = backNum.text.toString().toDouble()

            }
            else if(backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isNotEmpty()){
                num2 = curNum.text.toString().toDouble()
                num1 = backNum.text.toString().toDouble()
                var result = 0.0
                when (operation) {
                    "+" -> result = num1 + num2
                    "-" -> result = num1 - num2
                    "*" -> result = num1 * num2
                    "/" -> result = num1 / num2
                }
                if (result % 1.0 == 0.0) {
                    backNum.text = ""
                    backNum.append(result.roundToInt().toString())
                } else {
                    backNum.text = ""
                    backNum.append(result.toString())
                }
                num2 = result
                curNum.text.clear()
                operation = "+"
                operationText.text = operation
            }
            else if (backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isEmpty()){
                operation = "+"
                operationText.text = operation
            }

        }

        val btnMin: Button = findViewById(R.id.butMinus)
        btnMin.setOnClickListener {
            if (backNum.text.isEmpty() && operationText.text.isEmpty()) {
                operation = "-"
                operationText.text = operation
                backNum.text = curNum.text
                curNum.text.clear()
                num1 = backNum.text.toString().toDouble()

            }
            else if(backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isNotEmpty()){
                num2 = curNum.text.toString().toDouble()
                num1 = backNum.text.toString().toDouble()
                var result = 0.0
                when (operation) {
                    "+" -> result = num1 + num2
                    "-" -> result = num1 - num2
                    "*" -> result = num1 * num2
                    "/" -> result = num1 / num2
                }
                if (result % 1.0 == 0.0) {
                    backNum.text = ""
                    backNum.append(result.roundToInt().toString())
                } else {
                    backNum.text = ""
                    backNum.append(result.toString())
                }
                num2 = result
                curNum.text.clear()
                operation = "-"
                operationText.text = operation
            }
            else if (backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isEmpty()){
                operation = "-"
                operationText.text = operation
            }
        }

        val btnDiv: Button = findViewById(R.id.butDivis)
        btnDiv.setOnClickListener {
            if (backNum.text.isEmpty() && operationText.text.isEmpty()) {
                operation = "/"
                operationText.text = operation
                backNum.text = curNum.text
                curNum.text.clear()
                num1 = backNum.text.toString().toDouble()

            }
            else if(backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isNotEmpty()){
                num2 = curNum.text.toString().toDouble()
                num1 = backNum.text.toString().toDouble()
                var result = 0.0
                when (operation) {
                    "+" -> result = num1 + num2
                    "-" -> result = num1 - num2
                    "*" -> result = num1 * num2
                    "/" -> result = num1 / num2
                }
                if (result % 1.0 == 0.0) {
                    backNum.text = ""
                    backNum.append(result.roundToInt().toString())
                } else {
                    backNum.text = ""
                    backNum.append(result.toString())
                }
                num2 = result
                curNum.text.clear()
                operation = "/"
                operationText.text = operation
            }
            else if (backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isEmpty()){
                operation = "/"
                operationText.text = operation
            }
        }

        val btnMulti: Button = findViewById(R.id.butMulti)
        btnMulti.setOnClickListener {
            if (backNum.text.isEmpty() && operationText.text.isEmpty()) {
                operation = "*"
                operationText.text = operation
                backNum.text = curNum.text
                curNum.text.clear()
                num1 = backNum.text.toString().toDouble()

            }
            else if(backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isNotEmpty()){
                num2 = curNum.text.toString().toDouble()
                num1 = backNum.text.toString().toDouble()
                var result = 0.0
                when (operation) {
                    "+" -> result = num1 + num2
                    "-" -> result = num1 - num2
                    "*" -> result = num1 * num2
                    "/" -> result = num1 / num2
                }
                if (result % 1.0 == 0.0) {
                    backNum.text = ""
                    backNum.append(result.roundToInt().toString())
                } else {
                    backNum.text = ""
                    backNum.append(result.toString())
                }
                num2 = result
                curNum.text.clear()
                operation = "*"
                operationText.text = operation
            }
            else if (backNum.text.isNotEmpty() && operationText.text.isNotEmpty() && curNum.text.isEmpty()){
                operation = "*"
                operationText.text = operation
            }
        }


        val btnEq: Button = findViewById(R.id.butEqual)
        btnEq.setOnClickListener {
            try {
                num2 = curNum.text.toString().toDouble()
                num1 = backNum.text.toString().toDouble()
                var result = 0.0
                if (operation == "/" && num2 == 0.0) {

                    curNum.error = "Division by zero is not allowed"
                    curNum.requestFocus()
                    return@setOnClickListener
                }
                else {
                    when (operation) {
                        "+" -> result = num1 + num2
                        "-" -> result = num1 - num2
                        "*" -> result = num1 * num2
                        "/" -> result = num1 / num2
                    }
                    if (result % 1.0 == 0.0) {
                        curNum.text.clear()
                        curNum.append(result.roundToInt().toString())
                    } else {
                        curNum.text.clear()
                        curNum.append(result.toString())
                    }
                    //curNum.text.clear()
                    backNum.text = ""
                    operationText.text = ""
                    num2 = result

                }
            }
            catch (e : Exception){
                if (curNum.text.isEmpty()) {

                    //curNum.text.clear()
                    curNum.error = "Input number"
                    curNum.requestFocus()
                    return@setOnClickListener

                } else if (backNum.text.isEmpty()) {

                    //curNum.text.clear()
                    curNum.error = "Input operation"
                    curNum.requestFocus()
                    return@setOnClickListener
                } else if (operationText.text.isEmpty()) {

                    //curNum.text.clear()
                    curNum.error = "Input operation"
                    curNum.requestFocus()
                    return@setOnClickListener
                }
            }

        }
    }
}