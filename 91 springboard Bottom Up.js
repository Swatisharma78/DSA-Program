function noBoard(arr, dp, N, M){

  // console.log(arr);

//  console.log(arr, dp, N, M);

    for(let i = 1; i < N; i++){

        for(let j = 0; j < M; j++){

            if(j == 0){
              dp[i][j] = arr[i][j]+ (Math.max(dp[i-1][j], dp[i-1][j+1]))
            }else if( j == M-1){
              dp[i][j] = arr[i][j] + (Math.max(dp[i-1][j], dp[i-1][j-1]))
            }else{
              dp[i][j] = arr[i][j] + (Math.max(dp[i-1][j], dp[i-1][j-1], dp[i-1][j+1]))
            }

        }
    }
    


}


function runProgram(input) {
   var input = input.trim().split("\n")

   let testCases = +input[0];

   let line = 1;

   for(let i = 0; i < testCases; i++){

    let [N, M] = input[line].trim().split(" ").map(Number);
    line++;
    let arr = [];

    for(let j = 0; j < N; j++){
      
      let eachRow = input[line].trim().split(" ").map(Number);
      line++;

      arr.push(eachRow);

    }

    // console.log(arr);
    // console.log(N, M);

    let dp = [];
    dp[0] = arr[0]
    for(let i = 1; i < N; i++){
      dp[i] = [];
      for(let j = 0; j < M; j++){

        dp[i][j] = 0;

      }
      
    }
    // console.log(dp);

    noBoard(arr, dp, N, M);
    let ans = dp[N-1].sort((a,b)=>{return a-b})
        console.log(ans[ans.length-1]);
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
   