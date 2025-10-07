const PI = 3.14159;
let radius;
let circumference;

// radius = window.prompt(`Enter The Radius of a circle`);

document.getElementById("submit").onclick = function () {
  radius = document.getElementById("text").value;

  // PI = 420.69; // Assigment to constant variable not Allowed

  radius = Number(radius);

  circumference = 2 * PI * radius;

  console.log(circumference);

  document.getElementById("head").textContent = circumference + "cm";
};
