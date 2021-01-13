function solution(priorities, location) {
    var answer = 0;
    var count  = 0;
    var temp   = 0;
    var max = Math.max(...priorities);   
    while (true){   
        if(max == priorities[0]){
           temp = priorities.shift()    
           count++;     
            if(location == 0){
                location = priorities.length-1
                return count
            }
            location--;
            max = Math.max(...priorities);            
        }else{     
            temp = priorities.shift()
            location--;
            priorities.push(temp)
            if (location == -1)
                location = priorities.length-1
            max = Math.max(...priorities);
        }
        
        if (priorities === [])
            return count 
    }
 
    return 0;
}
