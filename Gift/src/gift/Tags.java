/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

import java.util.LinkedList;

/**
 *
 * @author muhammad
 */
public class Tags {

    LinkedList<String> Tag;
    static Tags obj;
    private Tags() {
        this.Tag = new LinkedList<>();
        this.Tag.add("Male");
        this.Tag.add("Female");
        
    }
    
    public static Tags GetObject(){
        if(obj==null){
            return new Tags();
        }
        return obj;
    }

    public void add(String Tag) {
        this.Tag.add(Tag);
    }
    public void remove(String Tag){
        this.Tag.remove(Tag);
    }
}
