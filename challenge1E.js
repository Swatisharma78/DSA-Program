function findCost(n, m) {
    let ans = 0;
    let max = 0;
    for (let i = 0; i < m.length; i++) if (m[i] > max) max = m[i];
    max += 1;

    for (let i = 0; i < n.length; i++) {
        if (n[i] < max) {
            ans += max - n[i];
        }
    }
    return ans;
}

function runProgram(input) {
    let newInput = input.split("\n");
    let n = newInput[1].trim().split(" ").map(Number);
    let m = newInput[3].trim().split(" ").map(Number);
    console.log(findCost(n, m));
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
  