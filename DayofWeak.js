const runProgram = (input)=> {
  input = input.trim().split('\n')
   let str = input[0].trim();
   let n = +input[1]
   let array = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
   for(let i = 0;i < array.length; i++){
       if(array[i] === str){
           let x = i+ n;
           x = x % 7;
           console.log(array[x]);
       }
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
   