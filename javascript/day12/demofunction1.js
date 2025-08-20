function functionname(parameters)
 {
    //body of the function
 }
 
 let username="Molly";
 
 function displayMe()
  {
    let username="Dolly"; // local variable
    console.log("welcome\t"+username);
  }
 
  console.log(username);
  displayMe();
 
  function addition(x,y,z)
  {
    return x+y+z;
  }
  console.log(addition(1,2,3));
 
  function displayData(name,age,city="Bangalore")
  {
    console.log(name);
    console.log(age);
    console.log(city);
  }
 
  displayData("Polly",21,"Mysuru");
 
let getData=(x,y)=>x+y;
console.log(getData(10,65));
 
let getMe=(x)=>x.toUpperCase();
console.log(getMe("Jolly"))
 
 
   
  console.log(getData(10,43));
 
 
 let getmail=(name,age,city)=>name+age+city+"@"+"gmail.com";

 console.log(getmail("dolly",22,"bengaluru"));
 

 let fullname=(fn,mn,ln)=>fn+"\t"+mn+"\t"+ln;

 console.log(fullname("dolly","molly","k"));
 


let getname=(name)=>name.toUpperCase().trim();
console.log(getname("   jolly"));
