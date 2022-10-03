fun main() {
    var employee1 = Employee("John Doe", PositionTitle.production, false,15.00,1)
    var employee2 = Employee("Mark Whalburg", PositionTitle.maintenance,false, 20.00,2)
    var employeeCEO = Employee("Chuck Finley",PositionTitle.administration,true,100.00,1)
    var employeeUnknown = Employee("Troll under the entrance", PositionTitle.secretarial,salary = false,0.0,4)
    employee1.printAll()
    employee1.Calculate(35F)
    employee2.printAll()
    employee2.Calculate(43F)
    employeeCEO.printAll()
    employeeCEO.Calculate(25F)
    employeeUnknown.printAll()
    employeeUnknown.Calculate(7F)
    employeeUnknown.shift = 2
    employeeUnknown.payRate = 300.00
    employeeUnknown.name = "Troll notindisguise notunderenterance"
    employeeUnknown.printAll()
    employeeUnknown.Calculate(400F)

}