package level1.test35;

import java.util.*;

/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. 
 * "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length(); i++){
            int code = (int)s.charAt(i) == 32 ?32 : (int)s.charAt(i)+n; //32는 공백이다 만약 아스키코드가 32일때 code는 32 아니면 아스키코드+n값을 변수에 넣어준다.
            if(code > 122) code -= 26;  //122는 소문자 z 이다. code가 z를 넘어서면 a부터 시작되도록
            else if(code > 90 && (int)s.charAt(i) < 91 ) code -= 26; //122는 대문자 Z 이다. code가 Z를 넘어서면 a부터 시작되도록한다 이때 아스키코드가 대문자인지 구별해야하기떄문에 and연산자를 사용
            answer += (char)code;            
        }
        return answer;
    }
}