let age = 20;
let hasID = true;
let hasTicket = false;
let isRaining = false;

// Check if person can enter the concert
if ((age >= 18 && hasID) || hasTicket) {
  console.log("You can enter the concert!");
} else {
  console.log("You cannot enter the concert.");
}

// Check if it's safe to go outside
if (!isRaining) {
  console.log("You can go outside and enjoy!");
} else {
  console.log("Stay home, it's raining.");
}

// 🧠 Step-by-step Explanation:

// (age >= 18 && hasID)
// → Checks if person is 18+ and has an ID.
// In this case → true && true → ✅ true.

// (age >= 18 && hasID) || hasTicket
// → Even if the person doesn’t have a ticket, they can still enter because the first part is true.
// Result → ✅ “You can enter the concert!”

// !isRaining
// → isRaining is false, so !false → ✅ true.
// Hence → “You can go outside and enjoy!”
