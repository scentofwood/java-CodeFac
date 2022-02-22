class Main {
    public static void main(String args[]) {
        
        Client c1 = new Client(new ConcreteStrategy1());
        c1.algorithm();
        
        Client c2 = new Client(new ConcreteStrategy2());
        c2.algorithm();
        
    }
}