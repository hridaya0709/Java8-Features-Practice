package org.example.streams.classes.logic;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MatchInList {
    public boolean process(List<Integer> nums, Predicate<Integer> condition, int matchtype) {
        Stream<Integer> stream =  nums.stream();
        if(matchtype==1) {
            return stream.anyMatch(condition);
        }
        else if(matchtype==2) {
            return stream.allMatch(condition);
        }
        else if(matchtype==3) {
            return stream.noneMatch(condition);
        }
        else {
            return false;
        }
    }

}
