function runProgram(input) {
    input = input.trim().split(/[\r+\n]+/);
    for(let i =0; i<input.length; i++){
        input[i] = input[i].trim().split(" ").map(Number);
    }
  //  console.log(input)
    let test=input[0];
    let line=1;
    const stack=[];
    var str=""
    for(let i=0;i<test;i++)
    {
      const {el,target}=input[line++]
      const arr=input[line++]
      console.log(sortArr(el,target,arr))
    }
    function sortArr(el,target,arr)
    {
      for(let i=0;i<el;i++){
      if(stack.length===0)
      {
         str+="-1"+" "
         stack.push(arr[i])
         continue
      }
      for(j=stack.length-1;j>=0;j--)
      {
        if(stack[j]<arr[i])
        {
          str+=stack[j]+" ";
          break;
        }
        stack.pop()
      }
      if(stack.length===0)
      {
         str+="-1"+" "
      }
      stack.push(arr[i])}
    
    }
    return str;

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
   