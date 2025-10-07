let counter = 0;

document.getElementById("btn1").onclick = function () {
  document.getElementById("counter").textContent = ++counter;
};
document.getElementById("btn2").onclick = function () {
  counter = 0;
  document.getElementById("counter").textContent = counter;
};
document.getElementById("btn3").onclick = function () {
  document.getElementById("counter").textContent = --counter;
};
