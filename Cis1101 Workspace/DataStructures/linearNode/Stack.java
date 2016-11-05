package DataStructures.linearNode;
import java.util.*;

/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack
{

    Vector container;
    int pointer ;
    public Stack()
    {
        try{
    container = new Vector();
    pointer = 0;
}
    catch(Exception e){

}
    }
    public void push (int a)
    {
        container.add(a);
        pointer = pointer +1;
    }
    
    public int pop()
    {
        int contents = (int)container.get(pointer);
        pointer = pointer - 1;
        return contents;
    
    }
    
    
}
