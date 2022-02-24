package classes;

import interfaces.Order;
import interfaces.OrderAbstractFactory;
import services.OrderBuilderService;

public class Client {
    OrderBuilderService service = new OrderBuilderService();

    // GET makeOrder
    public void getMakeOrder(FabricProvider.Fabrics fabricName) {
        try {
            OrderAbstractFactory<Order> factory = (FabricProvider.getOrder(fabricName));
            service.makeOrder(factory);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // GET search
    public void search() {
        service.getAll();
    }

    // POST setProduct
    public void setProduct(String product) {
        service.set(product);
    }

    // GET searchFree
    public void searchFree() {
        service.searchFree();
    }

    // POST rent
    public void rent(int[] data) {
        service.rent(data);
    }

    // POST confirmedOrder
    public void confirmedOrder() {
        service.confirmedOrder();
    }
}
