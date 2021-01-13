function solution(dartResult) {
    var answer = 0;
    var temp = '';
    var prevNum =0;
    var sum = 0;
    var currentNum = 0;
    for (var i = 0 ; i < dartResult.length ; i ++ ){    
        if( dartResult[i] == 'S'){  //S 일경우
        }else if( dartResult[i] == 'D'){   // D일 경우
            currentNum = currentNum*currentNum
        }else if( dartResult[i] == 'T'){ //T일 경우
            currentNum = currentNum*currentNum*currentNum 
         }else if( dartResult[i] == '*'){  //*일 경우
            prevNum *= 2    // 이전 점수를 2배
            currentNum *= 2 // 현재 점수를 2배
             if(i == dartResult.length-1){   // *로 끝난 경우
                 return sum+prevNum/2+currentNum
             }
         }else if( dartResult[i] == '#'){ // #일 경우
            currentNum *= -1
         }else{      // 숫자일 경우              
             sum = currentNum + prevNum 
             prevNum = currentNum   
             if( !isNaN( parseInt(dartResult[i+1]) ) ){  // 점수가 두자릿수일경우
                 currentNum = parseInt(dartResult[i]+ dartResult[i+1] )
                 i++;
             }else{
             currentNum = parseInt(dartResult[i]) // 현재 점수를 기록
             }
            }
    }
    sum += currentNum  // 최종 점수 집계
    return sum;
}
