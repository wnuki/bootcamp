package com.bootcamp.good.patterns.challenges.alledrogo;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService,
                                 ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(ProductOrderRequest productOrderRequest) {
        boolean isSuccessfullySold = productOrderService.sold(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());
        if (isSuccessfullySold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
        } else {
            System.out.println("Sorry, your order was rejected.");
        }

        return new ProductOrderDto(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                isSuccessfullySold);
    }
}
