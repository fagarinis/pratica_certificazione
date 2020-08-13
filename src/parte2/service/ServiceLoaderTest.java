package parte2.service;

import java.util.ServiceLoader;

public class ServiceLoaderTest {

    public static void main(String[] args) {
        MyService service = ServiceLoader.load(MyService.class).findFirst().get();

        System.out.println(service);
    }
}
