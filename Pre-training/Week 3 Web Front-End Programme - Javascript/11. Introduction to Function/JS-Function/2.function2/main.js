function palindrome(message){
  // wirte your code here
  var str = message.split('').reverse().join('');
  var result = (str == message) ?  true :  false;
  return result;
}
palindrome('hello'); // should return false
palindrome('abcba'); // should return true

console.log(palindrome('hello'));
console.log(palindrome('abcba'));