function bitK(N, K){

    // console.log(N, K);

     N = N.toString(2).split("")
     N.reverse()
    let c = 0;
    // console.log(N);
     
    if(N[K] == "1"){
             return console.log("Yes")
    }
     

   return console.log("No");
}

function runProgram(input) {
   var input = input.trim().split("\n");

   let testCases = +input[0];
    let line = 1;

   for(let i = 0; i < testCases; i++){
        let [N, K] = input[line].trim().split(" ").map(Number);
        line++;
        bitK(N, K)
   }
   
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
   