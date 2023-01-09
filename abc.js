const findit = (array, n, k) => {
  let i = 0,
    j = 0;
  while (j < n) {
    if (array[j] - array[i] === k) {
      return true;
    } else if (array[j] - array[i] > k) i++;
    else j++;
  }
  return false;
};

const runProgram = (input) => {
  input = input.trim().split("\n");
  let cases = +input[0];
  let line = 1;
  for (let i = 0; i < cases; i++) {
    let [n, k] = input[line++].trim().split(" ").map(Number);
    let array = input[line++].trim().split(" ").map(Number);
    findit(array, n, k) ? console.log("Yes") : console.log("No");
  }
};


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
 
