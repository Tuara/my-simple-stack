package deqo.tgan.mysimplestack;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {

    public ArrayList<Item> myStack = new ArrayList<Item>();

    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public int getSize() {
        return myStack.size();
    }

    public void push(Item item) {
        myStack.add(0, item);
    }

    public Item peek() throws EmptyStackException {
        if(myStack.isEmpty()) throw new EmptyStackException();
        Item item = myStack.get(0);
        return item;
    }

    public Item pop() throws EmptyStackException {
        Item item = peek();
        myStack.remove(0);
        return item;
    }
}
