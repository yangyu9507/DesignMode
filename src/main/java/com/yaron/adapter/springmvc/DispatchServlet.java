package com.yaron.adapter.springmvc;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */

public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    public void doDispatch() {

        // 此处模拟SpringMVC从request中获取Handler

//        AnnotationController controller = new AnnotationController();
//        HttpController controller = new HttpController();
        SimpleController controller = new SimpleController();
        HandlerAdapter adapter = getHandler(controller);

        adapter.handle(controller);

    }

    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter handlerAdapter: handlerAdapters){
            if (handlerAdapter.supports(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }


}
