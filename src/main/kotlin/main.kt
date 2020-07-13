
import java.util.*
import kotlin.system.exitProcess

val username = 123
val pwd = 111
var tempUsername=0
var tempPwd=0
var money =2000
var num = 0
var j=0  //错误次数
var scanner = Scanner(System.`in`)


fun main(){
    loadUi()
    check()
    menu()
    todo()

}
fun loadUi(){
    println("*************************************************")
    println("   欢   迎   使   用   中   国   农   业   银   行")
    println("*************************************************")
    print("请输入用户名：")
    tempUsername = scanner.nextInt()
    print("请输入密码：")
    tempPwd = scanner.nextInt()

}
fun check(){

    if (pwd== tempPwd &&username ==tempUsername) {println("登陆成功！请稍候");  j=0}
    else if ((pwd != tempPwd || username != tempUsername) && j<3){println("密码或用户名错误，请重试！") ; j+=1 ;loadUi();check() }
    else {println("错误次数太多，请联系管理员") ; j=0; exitProcess(0)}

}
fun menu(){
    println("*************************************************")
    println("   欢   迎   使   用   中   国   农   业   银   行")
    println("*************************************************")
    println("1.查询余额")
    println("2.取款")
    println("3.存款")
    println("4.转账")
    println("5.退出")
    println("请输入办理业务编号：")
    num = scanner.nextInt()
}
fun todo(){
    when(num){
        1 -> money_1()
        2 -> money_2()
        3 -> money_3()
        4 -> money_4()
        5 -> money_5()
    }
}
fun money_1 (){
    println("当前余额为：$money")
    println("是否退出y/n")
    var temp = readLine()
    when(temp){
        "y" -> menu()
        "n" -> money_1()
    }

}
fun money_2 (){
    println("请输入取钱金额：")
    var leaveMoney = scanner.nextInt()
    if (leaveMoney <= money){
        money-=leaveMoney
        println("取钱成功  余额为：$money")

    }else{
        println("余额不足！请从新输入")
        money_2()
    }
    println("是否退出y/n")
    var temp = readLine()
    when(temp){
        "y" -> menu()
        "n" -> money_2()
    }
}
fun money_3 (){
    println("是否退出y/n")
    var temp = readLine()
    when(temp){
        "y" -> menu()
        "n" -> money_3()
    }
}
fun money_4 (){
    println("是否退出y/n")
    var temp = readLine()
    when(temp){
        "y" -> menu()
        "n" -> money_4()
    }
}
fun money_5 (){
    println("感谢你的使用!")
    exitProcess(1)
}
