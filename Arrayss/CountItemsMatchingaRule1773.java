package Arrayss;

//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class CountItemsMatchingaRule1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        int count = 0;
        if (ruleKey.equals("type")) {
            i = 1;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(i-1).equals(ruleValue))
                    count++;
            }
        }
        if (ruleKey.equals("color")) {
            i = 2;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(i-1).equals(ruleValue))
                    count++;
            }
        }
        if (ruleKey.equals("name")) {
            i = 3;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(i-1).equals(ruleValue))
                    count++;
            }
        }
        return count;
    }


    public int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            String type = (String) ((List)items.get(i)).get(0);
            String color = (String)((List)items.get(i)).get(1);
            String name = (String)((List)items.get(i)).get(2);

            if ( ( ruleKey.equals("type") && ruleValue.equals(type) ) ||
                    ( ruleKey.equals("color") && ruleValue.equals(color) ) ||
                    ( ruleKey.equals("name") && ruleValue.equals(name) )
            ) count++;
        }
        return count;
    }
}
