document.getElementById("submit").addEventListener("click", function () {
  let name = document.getElementById("userInput").value;
  console.log(name);

  document.getElementById("welcome").textContent = "Hello " + name;
});

// window.prompt("Enter Your Name");
