function solution(bridge_length, weight, truck_weights) {
    var answer = 0;
    var passed = 0;
    var passing = [];
    var popTime = [];
    var truck = truck_weights.length;
    var elapsedSec = 1;
    var temp = 0;
    var sum = truck_weights[passed + passing.length];
    passing.push(truck_weights[passed + passing.length]);
    popTime.push(elapsedSec + bridge_length);   
    
   while(passed != truck) {     
      elapsedSec ++;  // 경과시간 증가            
      if(elapsedSec == popTime[0]){ // 다리를 다 건넌 트럭을 이동
         passed++;         
         temp = passing.shift();
         sum -= temp;   
         popTime.shift();  
      }            
      if ( truck_weights[passed + passing.length] != undefined && truck_weights[passed + passing.length] + sum <= weight) {       // 트럭이 더 들어갈 수 있으면 넣      
         sum += truck_weights[passed + passing.length]
         passing.push(truck_weights[passed + passing.length]);    
         
        
         popTime.push(elapsedSec + bridge_length);
      }        
    
   }
    return elapsedSec;
}
