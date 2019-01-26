package queuestack;

public class ReverseQueueToStack {

    //Sa se inverseze o lista de numere stocate intr-un Queue folosind un Stack.
    //Avem un stack gol in care punem fiecare element care iese din queue apoi afisam stack-ul.
    //Rezultatul trebuie sa fie elementele in ordine inversa
    private NewStack stack;
    private NewQueue queue;

    public ReverseQueueToStack(NewQueue queue) {
        this.queue = queue;
        this.stack = new NewStack(queue.getSize());
    }

    public String reverse() {

        while (stack.isItFull()==false) {
            stack.push(queue.getRearElement());
            queue.setFront(queue.getRear());
            queue.remove();
            queue.setRear(queue.getRear()-1);

        }

        return stack.toString();
    }

}