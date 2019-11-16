/*
Create a new index.js file and write a loop in any way to achieve the following requirements:
  from 0 to 20, determine whether the number is odd or even, and output. The output is as follows:

1 is odd number.
2 is even number.
3 is odd number.
……
19 is odd number.
20 is even number.
*/
var oddStr = ' is odd number.';
var evenStr = ' is even number.';
var str;
for (i = 0; i <= 20; i++){
  if (i != 0) {
    if (i % 2 != 0)
      str = i + oddStr;
    else
      str = i + evenStr;
    console.log(str);
  }
}