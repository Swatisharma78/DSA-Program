function runProgram(input) {
    var newInput = input.split("\n");
    var nmk = newInput[0].split(" ").map(Number);
    var n = nmk[0];
    var m = nmk[1];
    var k = nmk[2];

    var arr = newInput[1].split(" ").map(Number);;
    var index = 0;

    for (var i = 0; i < n * m; i++) {
        var result = "";
        for (var j = 0; j < k; j++) {
            result += arr[index] + " ";
            index++;
        }
        console.log(result);
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
 