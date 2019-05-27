package demo;

public class Handler2 extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if ("2".equals(request)) {
            System.out.println("Handler2 处理了 2");
            return;
        }
        next(request);
    }
}
