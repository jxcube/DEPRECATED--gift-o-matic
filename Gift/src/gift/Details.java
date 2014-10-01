/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

import gift.details.*;


/**
 *
 * @author izul
 */
class Details {


    Age age;
    Gender gender;
    Occasion occasion;
    Budget budget;
    Interest interest;
    private int currentMatch = 0;

    int match(Details target) {
        return currentMatch;
    }

}
