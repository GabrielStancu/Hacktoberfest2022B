import java.io.*;
import java.util.*;

public class CommandController {

    private Stack<String> history;
    private Queue<String> queue;

    public CommandController() {
        this.history = new Stack<String>();
        this.queue = new LinkedList<String>();
    }

    public void addCommand(String command) {
        this.queue.add(command);
    }

    public String removeCommand() {
        if(this.queue.isEmpty()) {
            throw new Exception("Command queue is empty");
        }

        String command = this.queue.remove();
        this.history.push(command);
        return command;
    }

    public String getLastExecutedCommand() {
        if(this.history.isEmpty()) {
            return null;
        }

        String command = this.history.pop();
        return command;
    }

    public boolean isQueueEmpty(){
        return this.queue.isEmpty();
    }

    public boolean isHistoryEmpty() {
        return this.history.isEmpty();
    }
}