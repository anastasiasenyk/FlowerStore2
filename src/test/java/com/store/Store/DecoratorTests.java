package com.store.Store;

import com.store.Store.flower.properties.types.Chamomile;
import com.store.Store.store.FlowerPack;
import com.store.Store.store.Item;
import com.store.Store.store.decorators.BasketDecorator;
import com.store.Store.store.decorators.ItemDecorator;
import com.store.Store.store.decorators.PaperDecorator;
import com.store.Store.store.decorators.RibbonDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorTests {
    private FlowerPack pack;

    @BeforeEach
    public void init() {
        pack = new FlowerPack(new Chamomile(), 4);
    }

    @Test
    public void testPaperDecorator() {

        PaperDecorator paperDecorator = new PaperDecorator(pack);

        Assertions.assertInstanceOf(PaperDecorator.class, paperDecorator);
        Assertions.assertInstanceOf(ItemDecorator.class, paperDecorator);
        Assertions.assertInstanceOf(Item.class, paperDecorator);

        Assertions.assertEquals(paperDecorator.getPrice(), 13 + pack.getPrice());
    }

    @Test
    public void testBasketDecorator() {

        BasketDecorator basketDecorator = new BasketDecorator(pack);

        Assertions.assertInstanceOf(BasketDecorator.class, basketDecorator);
        Assertions.assertInstanceOf(ItemDecorator.class, basketDecorator);
        Assertions.assertInstanceOf(Item.class, basketDecorator);

        Assertions.assertEquals(basketDecorator.getPrice(), 4 + pack.getPrice());
    }

    @Test
    public void testRibbonDecorator() {

        RibbonDecorator ribbonDecorator = new RibbonDecorator(pack);

        Assertions.assertInstanceOf(RibbonDecorator.class, ribbonDecorator);
        Assertions.assertInstanceOf(ItemDecorator.class, ribbonDecorator);
        Assertions.assertInstanceOf(Item.class, ribbonDecorator);

        Assertions.assertEquals(ribbonDecorator.getPrice(), 40 + pack.getPrice());
    }

}
