package behavioral.template_method;

import behavioral.template_method.networks.Facebook;
import behavioral.template_method.networks.Network;
import behavioral.template_method.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Вводим сообщение.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("""
                Choose social network for posting message.
                1 - Facebook
                2 - Twitter""");
        int choice = Integer.parseInt(reader.readLine());

        // Создаем сетевые объекты и публикуем пост.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
