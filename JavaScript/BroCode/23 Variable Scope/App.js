let globalVar = "I am Global"; // Global Scope

function myFunction() {
  let functionVar = "I am inside the function"; // Function Scope

  if (true) {
    let blockVar = "I am inside a block"; // Block Scope
    console.log(blockVar); // ✅ works here
  }

  console.log(functionVar); // ✅ works here
  // console.log(blockVar); ❌ error, blockVar not accessible here
}

myFunction();

console.log(globalVar); // ✅ works anywhere
// console.log(functionVar); ❌ error, not accessible outside function
