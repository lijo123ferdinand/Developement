function convert(){
   const celciusval= Number(document.getElementById("input").value)
   const farval=Number(celciusval*1.8+32)
   const result=document.getElementById("result")
   result.innerHTML=farval.toFixed(3)+"farenheit"
}