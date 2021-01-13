package ca.shubbar;

/**
 *
 * @author Mustafa Shubbar <codingbox@outlook.com>
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
    
    
}
