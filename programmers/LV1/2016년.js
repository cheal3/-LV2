function solution(a, b) {
    var month = [31,29,31,30,31,30,31,31,30,31,30,31]
    var month_monday = [5]
    var result = ['SUN','MON','TUE','WED','THU','FRI','SAT']
    for (var i = 0 ; i<month.length-1; i++){
        month_monday.push((month[i]%7 + month_monday[i])%7)
    }      
    return (month_monday[a-1] + (b%7 -1))%7 == -1 ? "SAT": result[(month_monday[a-1] + (b%7 -1))%7] 
}
