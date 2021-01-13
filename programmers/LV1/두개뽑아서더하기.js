// sort()를 썼더니 사전순 정렬이 돼서 11 이 2 보다앞에 리스트되는 문제가있음 , ((a,b) =>a-b)  화살표 함수를 통해서 해결

function solution(numbers) {
 
    var answer = [];
    for (var i = 0 ; i < numbers.length ; i ++){
        for (var j = i+1 ; j < numbers.length ; j++){
            answer.push(numbers[i]+numbers[j])        
        }
    }
    answer = new Set(answer)
    return [...answer].sort((a,b) =>a-b)
}

