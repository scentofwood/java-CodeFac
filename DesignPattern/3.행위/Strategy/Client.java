public class Client {
    Strategy strategy;
    
    public Client(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void algorithm() {
        strategy.algorithm();
    }
}