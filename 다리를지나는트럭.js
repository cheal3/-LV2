function solution(bridge_length, weight, truck_weights) {
    var answer = 0;
    var passed = []
    var passing = []
    var sum = 0
    var popTime = []
    var truck = truck_weights.length
    var elapsedSec = 1;
    var prevSum = 0;
    passing.push(truck_weights.shift());
    popTime.push(elapsedSec + bridge_length)
    
     while(passed.length != truck){     
        elapsedSec ++;  // 경과시간 증가   
         
        if(elapsedSec == popTime[0]){ // 다리를 다 건넌 트럭을 이동
            passed.push(passing.shift())
            popTime.shift()
        }
         
        for (var i = 0 ; i < passing.length ; i++){  //지나는 트럭의 무게
            sum += passing[i]           
        }  
         
        if (truck_weights[0]!= undefined && truck_weights[0] + sum <= weight) {       // 트럭이 더 들어갈 수 있으면 넣기
            passing.push(truck_weights.shift());
            popTime.push(elapsedSec + bridge_length)
        }
        
        
        sum = 0 ;
}
    
    return elapsedSec;
}
