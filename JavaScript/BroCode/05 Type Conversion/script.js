let age = window.prompt("How old are you ? ");

console.log(age, typeof age); // 21, String

age = Number(age); // Explicit Conversion

console.log(age, typeof age); // 21, Number

// Explicit Type Conversion Example

let x = "pizza";
let y = "pizza";
let z = "pizza";

x = Number(x);
y = String(y);
z = Boolean(z);

console.log(x, typeof x); // NaN, number
console.log(y, typeof y); // pizza, string
console.log(z, typeof z); // true, boolean

let a = "0";
let b = "0";
let c = "0";

a = Number(a);
b = String(b);
c = Boolean(c);

console.log(a, typeof a); // 0, number
console.log(b, typeof b); // 0, string
console.log(c, typeof c); // true, boolean

let j = "";
let k = "";
let l = "";

j = Number(j);
k = String(k);
l = Boolean(l);

console.log(j, typeof j); // 0, number
console.log(k, typeof k); //  , string
console.log(l, typeof l); // false, boolean

let d;
let e;
let f;

d = Number(d);
e = String(e);
f = Boolean(f);

console.log(d, typeof d); // Nan, number
console.log(e, typeof e); //  undefined, string
console.log(f, typeof f); // false, boolean
