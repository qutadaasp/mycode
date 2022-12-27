/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author قتادة
 */
public class vertix {
    private String label;
    private boolean isvisited[];

    public vertix(String label) {
        this.label = label;
        this.isvisited = isvisited;
    }

    

    public void setLabel(String label) {
        this.label = label;
    }

    public void setIsvisited(boolean[] isvisited) {
        this.isvisited = isvisited;
    }

    public String getLabel() {
        return label;
    }

    public boolean[] getIsvisited() {
        return isvisited;
    }
}
