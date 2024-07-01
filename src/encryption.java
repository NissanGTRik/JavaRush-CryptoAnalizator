import controllers.MainController;
import javax.xml.transform.Result;
import java.util.Arrays;

class Application {
    private MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            Result result = (Result) mainController.doAction(action, parameters);
            return result; // Возвращаем результат вызова doAction
        } else {
            // Обработка случая, когда args пустой
            return null; // Возвращаем null, если args пустой
        }
    }
}
