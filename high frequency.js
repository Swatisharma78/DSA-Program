//Enter code here
function runProgram(input){
   input = input.trim().split("\n")
   var tc = +input[0]
   var line = 1
   for(var i=0;i<tc;i++){
       var l = +input[line]
       line++
       var arr = input[line].trim().split(" ").map(Number)
       line++
       high_freq(l,arr)
   }
}

function high_freq(l,arr){
   arr = arr.sort()
   // console.log(arr)
   var obj = {}
   for(var i=0;i<l;i++){
       if(obj[arr[i]]===undefined){
           obj[arr[i]] = 1
       }
       else{
           obj[arr[i]] = obj[arr[i]] + 1
       }
   }
   // console.log(obj)
   var ele = null
   var total = 0
   for(var key in obj){
       var count = obj[key]
       if(total < count){
           ele = key
           total = count
       }
   }
   console.log(ele)
}


if (process.env.USER === "swatisharma") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
 