var numbers = [1,2,3];

var isOdd = function(el){
    return el % 2 !== 0;

}
var OddNumbers = numbers.filter(isOdd);
console.log(OddNumbers);
