const fullname = "Bro Code";

let firstName = fullname.slice(0, 3);
let lastName = fullname.slice(4, 8);

let firstChar = fullname.slice(0, 1);
let lastChar = fullname.slice(-1);

console.log(firstName, firstChar, lastName, lastChar);

let full = "krishna sonawane";

console.log(full.slice(0, full.indexOf(" ")));
console.log(full.slice(full.indexOf(" ") + 1, full.length));

let email = "krishna.sonawane03@gmail.com";

let username = email.slice(0, email.indexOf("@"));
let extension = email.slice(email.indexOf("@") + 1);

console.log(username);
console.log(extension);
