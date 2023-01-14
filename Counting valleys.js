function runProgram(input){
    input = input.trim().split("\n")
    let n = +input[0]
    let str = input[1]
     UpDown(str,n)
}
function UpDown(str,n){
    let cur =0
    let cnt =0
    for(var i=0;i<n;i++){
        if(str[i]=="U"){
            cur++
            if(cur==0){
                cnt++
            }
        }
        else{
            cur--
        }
    }
   console.log(cnt)
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
 