let day = "Sunday";

switch (day) {
  case "Monday":
    console.log("Uff! Start of the week 😩");
    break;

  case "Tuesday":
    console.log("Still a long way to weekend 😓");
    break;

  case "Wednesday":
    console.log("Midweek hustle! 💪");
    break;

  case "Thursday":
    console.log("Almost there 😌");
    break;

  case "Friday":
    console.log("Yay! Weekend is near 😍");
    break;

  case "Saturday":
    console.log("Weekend fun day 🎉");
    break;

  case "Sunday":
    console.log("Relax and recharge 😴");
    break;

  default:
    console.log("Invalid day entered ❌");
}

let dayNumber = 3;

switch (dayNumber) {
  case 1:
    console.log("Monday");
    break;

  case 2:
    console.log("Tuesday");
    break;

  case 3:
    console.log("Wednesday");
    break;

  case 4:
    console.log("Thursday");
    break;

  case 5:
    console.log("Friday");
    break;

  case 6:
    console.log("Saturday");
    break;

  case 7:
    console.log("Sunday");
    break;

  default:
    console.log("Invalid number ❌ (Enter between 1 to 7)");
}

let marks = 80;

switch (true) {
  case marks >= 90:
    console.log("Grade: A+ 🏆");
    break;

  case marks >= 75:
    console.log("Grade: A 🎯");
    break;

  case marks >= 50:
    console.log("Grade: B 🙂");
    break;

  default:
    console.log("Grade: Fail 😢");
}
