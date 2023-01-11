var input = ["assignment", "problem", "media", "upload"];

var pattern = function(inp){
    if(inp[0]=="a" || inp[inp.length-1] == "a"){
        return inp;
    }
}
console.log(input.filter(pattern))
