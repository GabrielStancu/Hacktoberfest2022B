import java.io.*;
import java.util.*;

public class CommandController {

    private Stack<String> history;
    private Queue<> queue;

    public CommandController() {
        history = new Stack();
        queue = new LinkedList();
    }

    public void addCommand(String command) {
        this.queue.add(command);
    }

    public String removeCommand() {
        String command = this.queue.remove();
        this.history.push(command);
        return command;
    }
}