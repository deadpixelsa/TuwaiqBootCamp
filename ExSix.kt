package com.example.myapplication12
/* السلام عليكم ورحمة الله وبركاته هذا حلي للسؤال حسب فهمي له لأنني لم احضر.شكراً
 */
fun main(){

    print(testFunction(3.5,4.0,"/"))

}

fun testFunction ( num1:Double,num2:Double,operator:String = "+" ) {
    when(operator){
        "+" -> print(num1+num2)
        "-" -> print(num1-num2)
        "/" -> print(num1/num2)
        "*" -> print(num1*num2)


    }


    }


