function runProgram(input){
    
    console.log(masai123(input))
    
}


function masai123(str)
{
      let bag = {};
    
    for (let i =0; i < str.length; i++)
    {
        if (str[i] === "a" ||  str[i] === "i" || str[i] === "o" || str[i] === "u")
        {
            
            if (bag[str[i]] === undefined )
            {
                bag[str[i]] = 1;
            }
        }
    }
    
    
     let count = 0
     
    for (let i =0; i <str.length; i++)
    {   
        let sum = "";
        
        for (let j =i; j <str.length; j++)
        {
            sum = sum + str[j];
            
            let bag1 = {};
            
            for (let k = 0; k < sum.length; k++)
            {
                if (sum[k] === "a" ||  sum[k] === "i" || sum[k] === "o" || sum[k] === "u")
                {
                    if (bag1[sum[k]] === undefined)
                    {
                        bag1[sum[k]] = 1;
                    }
                }
            }            
            
            
        
            if (Object.keys(bag1).length === Object.keys(bag).length)
            {
                count++;
            }
        }
    }
    return count
   
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