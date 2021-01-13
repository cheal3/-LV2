function solution(n, lost, reserve) {
    var answer = 0;
    n -= lost.length  
    for (var i = 0 ; i < lost.length ; i ++){     
        if(reserve.indexOf(lost[i]) != -1 ){  
            reserve[reserve.indexOf(lost[i])] =-1;
            lost[i] = 31;            
            n++; 
          }
    }
    for (var i = 0 ; i < lost.length ; i ++){               
        for (var j = 0 ; j < reserve.length ; j++){                   
            if ( (reserve[j] - lost[i] == -1) ||  (reserve[j] - lost[i] == 1)){
                lost[i] = 31;
                reserve[j] = -1;
                n++;
            }
        }     
    }   
    return n;
}
