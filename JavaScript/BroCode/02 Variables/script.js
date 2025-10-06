let name = `krishna`;
let age = 21;
let price = 12.99;
let gender = "A";
let isYes = true;

console.log(name);
console.log(typeof name);
console.log(age);
console.log(typeof age);
console.log(price);
console.log(typeof price);
console.log(gender);
console.log(typeof gender);
console.log(isYes);
console.log(typeof isYes);

console.log(`My name is ${name} and i am ${age} years old`);

document.getElementById("Name").textContent = `My name is ${name}`;
document.getElementById("Age").textContent = `My age is ${age}`;
document.getElementById("Bool").textContent = `Do i Like Biryani : ${isYes}`;
