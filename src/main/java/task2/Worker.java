package task2;

abstract class Worker {
    String name;
    public Worker (String name) {
        this.name = name;
    }
    abstract double salary();
}


