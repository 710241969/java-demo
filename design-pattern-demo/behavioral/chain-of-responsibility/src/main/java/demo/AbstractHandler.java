package demo;

public abstract class AbstractHandler {
    private AbstractHandler abstractHandler;

    public AbstractHandler() {

    }

    public AbstractHandler(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public void setAbstractHandler(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public AbstractHandler getAbstractHandler() {
        return this.abstractHandler;
    }

    public void next(String request) {
        this.abstractHandler.handleRequest(request);
    }

    abstract public void handleRequest(String request);
}
