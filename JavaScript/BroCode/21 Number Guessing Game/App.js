let KeepRunning = true;
let Attempt = 0;
let min = 1;
let max = 100;
let Answer = Math.floor(Math.random() * (max - min + 1)) + min;
let guess;

while (KeepRunning) {
  guess = window.prompt(`Guess a Number between ${min} - ${max}`);
  guess = Number(guess);

  if (isNaN(guess)) {
    window.alert("Enter a Valid Number");
  } else if (guess > max || guess < min) {
    window.alert("Enter a Valid Number");
  } else {
    Attempt++;
    if (guess < Answer) {
      window.alert("Too Low! Try Again");
    } else if (guess > Answer) {
      window.alert("Too High! Try Again");
    } else {
      window.alert(
        `Correct! The Answer was ${Answer}. It take you ${Attempt} Attempt`
      );
      KeepRunning = false;
    }
  }
}
