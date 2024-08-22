import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void logMessages(String message) {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute(message);
        }
    }
}
