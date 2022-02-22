package classes;

import interfaces.OrderAbstractFactory;
import services.OrderBuilderService;

import java.util.Objects;

public class Client {
    OrderBuilderService service = new OrderBuilderService();

    // POST makeOrder
    public void getMakeOrder(String fabricName) {
        OrderAbstractFactory factory = (Objects.requireNonNull(FabricProvider.getOrder(fabricName)));
        service.makeOrder(factory);
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
