//Enter code here
function runProgram(input){
    input=input.split("\n")
    var tc=+input[0];
    var l=1;
    
    for(let i=0;i<tc;i++)
    {
        var n=+input[l++]
        var arr=input[l++].split("").map(Number)
        var arr2=input[l++].split("").map(Number)
       var x= fun(arr,arr2,n)
       console.log(x)
    }
    function fun(arr,arr2,n){
    var cow = 0;
    var bull = 0;
    var jam = Array(10).fill(0);

    for(var i = 0; i<arr.length; i++)
    {
        const g= parseInt(arr2[i]);
        const s= parseInt(arr[i]);
        
        if (s === g) 
        {
            bull++;
            continue
        }

        if(jam[s] < 0) 
        {
            cow++;
        }
        
        if(jam[g] > 0)
        {
            cow++;
        }
        
        jam[s]++;
        jam[g]--;
    }
  
    return `${bull}A${cow}B`;
    
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
    read = read.jamlace(/\n$/, "");
    read = read.jamlace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.jamlace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}