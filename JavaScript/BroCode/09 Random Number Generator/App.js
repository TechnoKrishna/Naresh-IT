document.getElementById("Generate").onclick = function () {
  let min = document.getElementById("Min").value;
  let max = document.getElementById("Max").value;

  min = Number(min);
  max = Number(max);

  let randomNo = Math.floor(Math.random() * (max - min) + min);

  document.getElementById("Count").textContent = randomNo;
};
