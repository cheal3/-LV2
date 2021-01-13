function solution(skill, skill_trees) {

    var answer = 0;
    skill = skill.split('')
    
    for (var i = 0 ; i < skill_trees.length ; i ++){
        var substring =''
    
         for (var j = 0 ; j < skill.length ; j ++){
          if (skill_trees[i].indexOf(skill[j]) == -1) {
              
              substring += "F"
              
          }else{
            substring += skill_trees[i].indexOf(skill[j])        
          }
    } 
        
        
        var substring_2 = substring.split('').sort().join("")

        if(substring == substring_2) {
            answer+=1;
            
        }
    }
    
    return answer;
}
