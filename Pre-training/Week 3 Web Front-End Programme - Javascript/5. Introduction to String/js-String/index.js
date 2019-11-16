// Complete the following procedure, the 'name' variable in all letters to uppercase, output: ' 'HELLO' '.
var name = 'hello';
// TODO write your code here...
name = name.toUpperCase();
console.log(name);

// Complete the following procedure, capitalizing all the words in the variable sentence and printing: 'Good Afternoon, Mr Mike.'
var sentence = 'good afternoon, mr mike.';
var splitSentence = sentence.toLowerCase().split(' ');
//TODO write your code here...
for (var i = 0; i < splitSentence.length; i++) {
    splitSentence[i] = splitSentence[i].charAt(0).toUpperCase() + splitSentence[i].substring(1);
}
sentence = splitSentence.join(' ');
console.log(sentence);

// Complete the following procedure to extract the amount of money variable, output: 20.
var money = '￥20';
//TODO write your code here...
money = money.replace(money.charAt(0),'');
console.log(money);