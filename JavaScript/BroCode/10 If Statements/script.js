let age = 13;

if (age >= 18) {
  console.log("You are old enough to enter this site : ");
} else {
  console.log("You must be 18+ to enter this site");
}

let time = 9;

if (time < 12) {
  console.log("Good Morning!");
} else {
  console.log("Good Afternoon!");
}

let isStudent = false;

if (isStudent) {
  console.log("You are a Student!");
} else {
  console.log("You are Not a Student!");
}

let age1 = 25;
let hasLicense = true;

if (age >= 16) {
  console.log("You are old enough to drive");

  if (hasLicense) {
    console.log("You have your License!");
  } else {
    console.log("You do not have Your License yet!");
  }
} else {
  console.log("You must be 16+ to have a license");
}

let age2 = 21;

if (age2 >= 18) {
  console.log("You are old enough to enter this site : ");
} else if (age2 < 0) {
  console.log("You age can't be below 0");
} else {
  console.log("You must be 18+ to enter this site");
}
