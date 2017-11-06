package deqo.tgan.mysimplestack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getItemValue() throws Exception {
        Item item = new Item(0);
        assertThat(item.getItemValue(), is(0));
    }

    @Test
    public void setItemValue() throws Exception {
        Item item = new Item(0);
        item.setItemValue(1);
        assertThat(item.getItemValue(), is(1));
    }

}