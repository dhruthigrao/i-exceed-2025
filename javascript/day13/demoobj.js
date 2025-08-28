//Creating of Object
 
// creating object by literal
 
const student={name:"Rakesh",age:21,department:"cse",isAvail:true}
console.log(student);
 
// creating object by constructor (object)
 
const student1=new Object();
student1.name="Surya";
student1.age=22;
student1.department="ece";
student1.isAvail=true;
console.log(student1);
 
 




// we an add another object to an object
 
const customer=new Object();
customer.name="Bhargav";
customer.id=43243;
customer.isActive=true;
 
const customer1={
                    name:"Bhargav",
                    id:43434,
                    city:"Bangalore",
                    account:{
                                accno:4343435,
                                type:"sb",
                                balance:100000,
                                deposit:function(amt)
                                {
                                     return this.balance+=amt;  
                                },
                                withdraw:function(amt)
                                {
                                    return this.balance-=amt;
                                }
                                }
                };
 
console.log(customer1.account.deposit(10000));
console.log(customer1.account.withdraw(20000));
