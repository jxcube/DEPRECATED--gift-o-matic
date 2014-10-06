/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

import java.util.LinkedList;

/**
 *
 * @author izul
 */
public class Gift {

    String name;
//    Details category;
    LinkedList<String> tags;
    String pictLoc;
    String description;
    int minPrice, maxPrice;
//String ItemID;

    int match(LinkedList<String> target) {
        int matchpoint = 0;
        matchpoint = target.stream().filter((target1) -> (tags.contains(target1))).map((_item) -> 1).reduce(matchpoint, Integer::sum);
        return matchpoint;
    }
}
