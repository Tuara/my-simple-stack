package deqo.tgan.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class MySimpleStackTest {

    private MySimpleStack simpleStack = new MySimpleStack();
    private Item item1 = new Item(1);
    private Item item2 = new Item(2);

    @Test
    public void testIsEmptyOK() throws Exception {
        assertThat(simpleStack.isEmpty(), is(true));
        simpleStack.push(item1);
        assertThat(simpleStack.isEmpty(), is(false));
    }

    @Test
    public void testGetSizeOK() throws Exception {
        assertThat(simpleStack.getSize(), is(0));
        simpleStack.push(item1);
        assertThat(simpleStack.getSize(), is(1));
        simpleStack.push(item2);
        assertThat(simpleStack.getSize(), is(2));
    }

    @Test
    public void testPushOK() throws Exception {
        simpleStack.push(item1);
        simpleStack.push(item2);
        assertThat(simpleStack.peek(), sameInstance(item2));
    }

    @Test
    public void testPeekOK() throws Exception {
        simpleStack.push(item1);
        simpleStack.push(item2);

        final Item item = simpleStack.peek();
        assertThat(item, sameInstance(item2));
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() {
        Item nothing = simpleStack.peek();
    }

    @Test
    public void testPopOK() throws Exception {
        simpleStack.push(item1);
        simpleStack.push(item2);

        final Item actual2 = simpleStack.pop();
        assertThat(actual2, sameInstance(item2));

        final Item actual1 = simpleStack.pop();
        assertThat(actual1, sameInstance(item1));

        assertThat(simpleStack.isEmpty(), is(true));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() {
        Item nothing = simpleStack.pop();
    }

}