function solution(progresses, speeds) {
    var ret = []
    var count = 0;
    var pointer = 0; 
    while(progresses[pointer] < 100){
        
        for (var i = 0 ; i < progresses.length ;  i++){
            progresses[i] += speeds[i]          
        }      
        
        if (progresses[pointer] >= 100){           
            for (var i = 0 ; i < progresses.length ; i++){                     
                if (progresses[pointer] >= 100 ){
                    pointer++;
                    count++; 
                }else{
                    break;
                }
            }        
            ret.push(count) 
            count = 0 ;         
        }    
    }    
    return ret;
}
