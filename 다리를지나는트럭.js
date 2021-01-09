function solution(bridge_length, weight, truck_weights) {
    var answer = 0;
    var passed = []
    var passing = []
    var sum = 0
    var popTime = []
    var truck = truck_weights.length
    var elapsedSec = 1;    
    var temp = truck_weights.shift()
    
    passing.push(temp);
    popTime.push(elapsedSec + bridge_length)
    sum += temp
    
     while(passed.length != truck){     
        elapsedSec ++;  // 경과시간 증가            
        if(elapsedSec == popTime[0]){ // 다리를 다 건넌 트럭을 이동
            temp = passing.shift()
            passed.push(temp)     
            sum -= temp
            popTime.shift()            
        }

        if (truck_weights[0]!= undefined && truck_weights[0] + sum <= weight) {       // 트럭이 더 들어갈 수 있으면 넣기
            temp = truck_weights.shift()
            passing.push(temp);
            sum += temp
            popTime.push(elapsedSec + bridge_length)            
        }
         
}    
    return elapsedSec;
}
