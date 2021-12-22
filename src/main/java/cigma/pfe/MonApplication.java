import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.constrollers.ClientController;
import cigma.pfe.models.Client;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
		Client c = new Client(1L, "saad");
		ctrl.save(c);
	}
}
