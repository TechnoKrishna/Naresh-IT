// String Methods Demo
let text = "   Hello JavaScript World 123!   ";
console.log("Original String:", `"${text}"`);

// 1️⃣ trim() - remove spaces from both ends
let trimmed = text.trim();
console.log("trim():", `"${trimmed}"`);

// 2️⃣ length - count characters
console.log("length:", trimmed.length);

// 3️⃣ toUpperCase() - convert to CAPITALS
console.log("toUpperCase():", trimmed.toUpperCase());

// 4️⃣ toLowerCase() - convert to small letters
console.log("toLowerCase():", trimmed.toLowerCase());

// 5️⃣ slice(start, end) - cut part of string
console.log("slice(0,5):", trimmed.slice(0, 5));

// 6️⃣ substring(start,end) - similar to slice
console.log("substring(6,16):", trimmed.substring(6, 16));

// 7️⃣ substr(start,length) - older method
console.log("substr(6,10):", trimmed.substr(6, 10));

// 8️⃣ replace(old,new) - replace first match
console.log(
  "replace('World','Universe'):",
  trimmed.replace("World", "Universe")
);

// 9️⃣ replaceAll(old,new) - replace all matches
let repeatText = "apple banana apple";
console.log(
  "replaceAll('apple','orange'):",
  repeatText.replaceAll("apple", "orange")
);

// 🔟 concat() - join strings
console.log("concat():", "Greeting: ".concat(trimmed));

// 1️⃣1️⃣ charAt(index) - character at index
console.log("charAt(0):", trimmed.charAt(0));

// 1️⃣2️⃣ charCodeAt(index) - ASCII code
console.log("charCodeAt(0):", trimmed.charCodeAt(0));

// 1️⃣3️⃣ indexOf(text) - first occurrence
console.log("indexOf('JavaScript'):", trimmed.indexOf("JavaScript"));

// 1️⃣4️⃣ lastIndexOf(text) - last occurrence
console.log("lastIndexOf('l'):", trimmed.lastIndexOf("l"));

// 1️⃣5️⃣ includes(text) - check presence
console.log("includes('Hello'):", trimmed.includes("Hello"));

// 1️⃣6️⃣ startsWith(text) - check start
console.log("startsWith('Hello'):", trimmed.startsWith("Hello"));

// 1️⃣7️⃣ endsWith(text) - check end
console.log("endsWith('123!'):", trimmed.endsWith("123!"));

// 1️⃣8️⃣ split(separator) - convert to array
console.log("split(' '):", trimmed.split(" "));

// 1️⃣9️⃣ repeat(n) - repeat string
console.log("repeat(2):", trimmed.repeat(2));

// 2️⃣0️⃣ padStart(length,text) - pad start
console.log("padStart(30,'*'):", trimmed.padStart(30, "*"));

// 2️⃣1️⃣ padEnd(length,text) - pad end
console.log("padEnd(35,'-'):", trimmed.padEnd(35, "-"));

// 2️⃣2️⃣ match(regex) - find pattern
console.log("match(/\\d+/):", trimmed.match(/\d+/));

// 2️⃣3️⃣ search(regex) - find index of pattern
console.log("search(/\\d+/):", trimmed.search(/\d+/));

// 2️⃣4️⃣ localeCompare(string) - compare alphabetically
console.log(
  "localeCompare('Hello World'):",
  trimmed.localeCompare("Hello World")
);

// 2️⃣5️⃣ valueOf() - get primitive value
console.log("valueOf():", trimmed.valueOf());

// 2️⃣6️⃣ toString() - convert to string
console.log("toString():", trimmed.toString());

// 2️⃣7️⃣ normalize() - Unicode normalization
console.log("normalize():", trimmed.normalize());
