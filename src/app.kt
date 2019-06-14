fun  main(args:Array<String>){
    println("Hello world")

    println(sum(1,2))
    println(sum_void(1,2))

     vars(1,2,3,4,5)

    //lambda匿名函数
    val sumLambda:(Int,Int)->Int={x,y->x+y}
    println(sumLambda(1,2))

    //常量与变量
    val a:Int=1
    val b=2
    val c:Int
    c=3
    var x=5
    x+=1
    println("===a==$a====")
    println("===b==$b====")
    println("===c==$c====")
    println("===x==$x====")

    //字符串模板
    var aa=1
    val s1 = "aa is $aa"
    aa=2
    val s2 = "${s1.replace("is","was")},but now is $aa"
    println("======s2==="+s2)

    //类型后面加?表示可为空
    var age:String?="23"
    println("===age==$age====")

    //抛出空指针异常
    val ages = age!!.toInt()
    println("===ages==$ages====")

    //不做处理返回 null
    val ages1 = age?.toInt()

    println("===ages1==$ages1====")



    //age为空返回-1
    age=null
    val ages2 = age?.toInt() ?: -1

    println("===ages2==$ages2====")

    if(args.size<2){
        print("two integers expected")
        return
    }

//    args[0]= readLine()
//    args[1]= readLine()
//
//    val x1= parseInt(args[0])
//    val y1= parseInt(args[1])
//
//
//
//    if (x1 != null && y1 != null) {
//        // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
//        print(x1 * y1)
//    }


    println(getStringLength("sadsadsdasd"))



}

fun sum(a:Int,b:Int)= a+b

/*
上面的等同于
fun sum(a:Int,b:Int)：Int{
    return a+b
}
*/

fun sum_void(a:Int,b:Int):Unit{
    print( a+b)
}

/*
上面的等同于
fun sum_void(a:Int,b:Int){
    print( a+b)
}
*/

//可变参数函数
fun vars(vararg v: Int){
    for(vt in v){
        print("=====vt===="+vt)
        println()
    }
}
//当 str 中的字符串内容不是一个整数时, 返回 null:
fun parseInt(str:String): Int? {
    return null
}

//类型检测及自动类型转换
fun getStringLength(obj:Any):Int?{
    if(obj is String ){
        return obj.length
    }

    if (obj !is String ){
        return 0
    }

    return null
}



