package com.company

class StringUtils {
    String reverse(String str) {
        return str.reverse()
    }

    String toUpper(String str) {
        return str.toUpperCase()
    }

    String toLower(String str) {
        return str.toLowerCase()
    }

    String capitalize(String str) {
        return str.capitalize()
    }

    int count(String str){
        return str.length()
    }

    boolean isPalindrome(String str) {
        String reversed = str.reverse()
        return str.equalsIgnoreCase(reversed)
    } 
}