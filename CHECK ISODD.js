function isOdd(n)
{
 for (var i = 1; i<=n; i++)
     if ( i%2 == 1){
		console.log("Odd" + " " + i);
	   }else{
       console.log("Even" + " " + i);
     }
}
 isOdd(10); 
