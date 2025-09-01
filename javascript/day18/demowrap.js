const student={
    name:"Rakesh",
    greetings:function()
    {
        console.log(`Welcome Mr ${this.name}`);
    }
};
 
 
 
// setTimeout(student.greetings,1000);

//setTimeout with wrapper funtion 

setTimeout(function(){
 student.greetings();  
},2000);
 
//setTimeout with arrow function
setTimeout(()=>student.greetings(),2000)

//using the bind funtions ,u can call the function  
let greet=student.greetings.bind(student);
setTimeout(greet,2000);
 
//using the .apply or .call to access the function

let gree=student.greetings.apply(student);
setInterval(greet,1000,3);
