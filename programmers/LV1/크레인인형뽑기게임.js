function solution(board, moves) {
    var result = []
    var count = 0;
    for (var j = 0 ; j < moves.length; j ++){
        shift = moves[j]
        for (var i = 0 ; i < board.length ; i++){
           if(board[i][shift-1] != 0 ){            
                result.push(board[i][shift-1])                
                board[i][shift-1] = 0;      
                 if(result[result.length-1] == result[result.length-2] ){
                         result.splice(result.length-2,2)
                         count +=2 ;
                 }                
                break;
            }            
        }      
    }
    return count;
}
