package Extract_Refactorings.ExtractFunctionalVariable;

import java.util.List;

public class PrintAction implements Runnable {
    private List<String> data;

    public PrintAction(List<String> data) {
        this.data = data;
    }

    public void run() {
        System.out.println("Data: " + data.toString());
    }
}