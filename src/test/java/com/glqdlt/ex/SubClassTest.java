package com.glqdlt.ex;

import org.junit.Assert;
import org.junit.Test;

public class SubClassTest {
    @Test
    public void callableMethodB() throws Exception {
        SuperClass superClass = new SubClass();
        Assert.assertEquals("b메소드는 Sub에서 의도해서 오버라이딩하지 않았지만, 오버라이딩 취급되어야 한다.","Sub.b()",superClass.b());
    }
}
