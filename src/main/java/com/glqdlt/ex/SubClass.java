package com.glqdlt.ex;

/**
 * @author glqdlt
 * <pre>@Overrid</pre> 는 컴파일상에서의 메타정보뿐이라는 걸 알아본다.
 * 2019-03-10
 */
public class SubClass  extends SuperClass{

//의도한 오버라이딩
    @Override
    public String a() {
        return "Sub.a()";
    }
//원하지 않는 오버라이딩
    public String b(){
        return "Sub.b()";
    }
//Super.c()에 final 이 있어서 컴파일 단계에서 오버라이딩이 불가능하게 된다.
//    public void c(){
//        return "Sub.b()";
//    }
}
