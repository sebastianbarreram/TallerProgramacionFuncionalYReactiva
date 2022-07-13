package org.sofkau.retofinal.ejercicio1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class LiteralATest {
    @Test
    public void testExecute() {
        Assert.assertThat(LiteralA.execute().size(), equalTo(2));
    }

}