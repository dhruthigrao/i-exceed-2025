"use strict";
 
let age=12;
 
if(age<18)
{
   
   var greeting= function ()
     {
        console.log("welcome you all and wait for your turn!");
     };
 
     
}
else
{
    var greeting=function()
     {
        console.log("welcome you all and you are all eligible to write the exam!");
     };
     
}
console.log("Hello");
greeting();

//args can be used in the arrow funtion 
//argument keyword cant be used in the functional programming
//multi line commands can be used in the arrow function using the {} followed by ;

let multiline=(x,y)=>{
                        let sum=x+y;
                        return sum
                     }

console.log(multiline(12,31));


//arrow function with args

let display1