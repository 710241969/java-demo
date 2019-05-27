package demo;

public class Handler1 extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if ("1".equals(request)) {
            System.out.println("Handler1 处理了 1");
            return;
        }
        next(request);
    }
}
