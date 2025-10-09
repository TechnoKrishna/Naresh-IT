let age = 21;
let message = age >= 18 ? "You're an adult" : "you're a minor";
console.log(message);

let time = 9;
let greeting = time < 12 ? "Good Morning!" : "Good Afternoon!";
console.log(greeting);

let isStudent = true;
let message1 = isStudent ? "You are a Student" : "You are Not a Student";
console.log(message1);

let purchaseAmount = 125;
let discount = purchaseAmount >= 100 ? 10 : 0;
console.log(
  `Your Total is ${purchaseAmount - purchaseAmount * (discount / 100)}`
);
