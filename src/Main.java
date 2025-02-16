public class Main {
    public static void main(String[] args){
        Worker worker = new Worker();
        worker.eat();

        RobotWorker robotWorker = new RobotWorker();
        robotWorker.fix();

        OutsorceWorker outsorceWorker = new OutsorceWorker();
        outsorceWorker.work();

    }
}