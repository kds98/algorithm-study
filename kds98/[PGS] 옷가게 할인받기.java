#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int price) {
    int answer = 0;
    
    if(price >= 100000) {
        answer = (int) (price * 0.95);
    } 
    if(price >= 300000) {
        answer = (int) (price * 0.9);
    }
    if(price >= 500000) {
        answer = (int) (price * 0.8);
    }
    if(price < 100000) {
        answer = price;
    }
    
    return answer;
}