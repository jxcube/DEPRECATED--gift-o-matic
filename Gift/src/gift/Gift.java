/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gift;

/**
 *
 * @author izul
 */
public class Gift {
    String name;
    Details category;
    String pictLoc;
    String description;
    String place;
    String ItemID;
    
    int match(Details target){
        return category.match(target);
    }
}
