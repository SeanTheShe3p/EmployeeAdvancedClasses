import java.text.DecimalFormat

class Employee constructor(name:String, positionTitle: PositionTitle, salary:Boolean, payRate:Double, shift:Int) {
    var name = name
        get() = field
        set(value){
            field = value}
    var position = positionTitle
        get() = field
        set(value){
            field = value}
    var salary = salary
        get() = field
        set(value){
            field = value}
    var payRate = payRate
        get() = field
        set(value){
            field = value}
    var shift = shift
        get() = field
        set(value){
            field = value}

    fun Calculate(field:Float) {
        val dec = DecimalFormat("\$###,###,###.00")
        if (salary == false) {
            if(shift==1){
                if (0<field && field<=40){
                    var pay = field.toFloat()*payRate.toFloat()
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field>40){
                    var overtime = field.toFloat()-40
                    var pay = (field.toFloat()*payRate.toFloat())+(overtime*1.5)
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field <0){
                    println("They did not work this week, or forgot to punch in; they were payed $0.00 this week.")
                }
            }
            else if(shift==2){
                if (0<field && field<=40){
                    var pay = (field.toFloat()*payRate.toFloat())*1.05
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field>40){
                    var overtime = field.toFloat()-40
                    var pay = ((field.toFloat()*payRate.toFloat())+(overtime*1.5))*1.05
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field <0){
                    println("They did not work this week, or forgot to punch in; they were payed $0.00 this week.")
                }
            }
            else if(shift==3){
                if (0<field && field<=40){
                    var pay = (field.toFloat()*payRate.toFloat())*1.1
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field>40){
                    var overtime = field.toFloat()-40
                    var pay = ((field.toFloat()*payRate.toFloat())+(overtime*1.5))*1.1
                    var finalpay = dec.format(pay)
                    println("They were payed "+finalpay+" this week.")
                }
                if (field <0){
                    println("They did not work this week, or forgot to punch in; they were payed $0.00 this week.")
                }
            }
                else{
                    println("You have selected an invalid shift")
            }
        }
        if (salary==true){
            println("See 'EMPLOYEE SALARY' for wage information.")
        }
    }
    fun printAll(){
        var sal = ""
        if(salary==true){
            sal = "are salaried,"
        }
        if (salary==false){
            val dec = DecimalFormat("\$###,###,###.00")
            var finalpay = dec.format(payRate)
            sal = "are not salaried, at a rate of "+finalpay+" an hour,"
        }
        println(name+" is working in "+position+". They "+sal+"working on shift "+shift.toString()+".")
    }
}