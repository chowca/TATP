function countWords(message){
  // wirte your code here
  var str = message.split(' ');
  return str.length;
}
countWords('Good morning, I love JavaScript.'); // should return 5

console.log(countWords('Good morning, I love JavaScript.'));