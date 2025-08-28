// 1. constructor
const obj1 = {};
console.log("1. constructor:");
console.log(obj1.constructor); // [Function: Object]
console.log(obj1.constructor === Object); // true

const arr = [];
console.log(arr.constructor === Array); // true
console.log("\n");

// 2. hasOwnProperty()
const obj2 = { a: 1 };
console.log("2. hasOwnProperty:");
console.log(obj2.hasOwnProperty('a')); // true
console.log(obj2.hasOwnProperty('toString')); // false
console.log("\n");

// 3. isPrototypeOf()
function Animal() {}
function Dog() {}
Dog.prototype = Object.create(Animal.prototype);
const myDog = new Dog();

console.log("3. isPrototypeOf:");
console.log(Animal.prototype.isPrototypeOf(myDog)); // true
console.log(Dog.prototype.isPrototypeOf(myDog));    // true
console.log("\n");

// 4. propertyIsEnumerable()
const obj3 = { a: 1 };
Object.defineProperty(obj3, 'b', {
  value: 2,
  enumerable: false,
});

console.log("4. propertyIsEnumerable:");
console.log(obj3.propertyIsEnumerable('a')); // true
console.log(obj3.propertyIsEnumerable('b')); // false
console.log(obj3.propertyIsEnumerable('toString')); // false
console.log("\n");

// 5. toLocaleString()
const date = new Date(Date.UTC(2025, 7, 25));
const number = 123456.789;

console.log("5. toLocaleString:");
console.log(date.toLocaleString()); // Locale-based date string
console.log(number.toLocaleString('en-US')); // "123,456.789"
console.log(number.toLocaleString('de-DE')); // "123.456,789"
console.log("\n");

// 6. toString()
const obj4 = {};
const array = [1, 2, 3];

console.log("6. toString:");
console.log(obj4.toString()); // "[object Object]"
console.log(array.toString()); // "1,2,3"
console.log(date.toString()); // Full date string
console.log("\n");

// 7. valueOf()
const obj5 = {
  valueOf() {
    return 100;
  }
};

console.log("7. valueOf:");
console.log(obj5 + 50); // 150
const numObj = new Number(42);
console.log(numObj.valueOf()); // 42
console.log("\n");

// 8. __proto__ (legacy)
const obj6 = {};
console.log("8. __proto__ (legacy, avoid):");
console.log(obj6.__proto__ === Object.prototype); // true

// Better alternative:
console.log(Object.getPrototypeOf(obj6) === Object.prototype); // true
