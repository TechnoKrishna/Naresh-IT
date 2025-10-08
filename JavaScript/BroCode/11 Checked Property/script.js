const CheckBox = document.getElementById("c1");
const visaBtn = document.getElementById("visaBtn");
const masterCardBtn = document.getElementById("masterCardBtn");
const PaypalBtn = document.getElementById("PaypalBtn");
const mySubmit = document.getElementById("mySubmit");
const subResult = document.getElementById("subResult");
const paymentResult = document.getElementById("paymentResult");

mySubmit.onclick = function () {
  if (CheckBox.checked) {
    subResult.textContent = `You are Subscribed!`;
  } else {
    subResult.textContent = `You are Not Subscribed!`;
  }
  if (visaBtn.checked) {
    paymentResult.textContent = `You are Paying with Visa`;
  } else if (masterCardBtn.checked) {
    paymentResult.textContent = `You are Paying with MasterCard`;
  } else if (PaypalBtn.checked) {
    paymentResult.textContent = `You are Paying with Paypal`;
  } else {
    paymentResult.textContent = `You Must select apayment type`;
  }
};
