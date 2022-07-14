import org.springframework.transaction.annotation.Transactional;

@Transactional
public Order cancelOrder(int orderId){
        1) 데이터베이스로부터 주문정보 ( Orders ), 결제 정보 (Billing), 배송정보 (Delivery) 조회

        2) 배송취소를 해야 하는지 확인

        3) (if 배송중이라면){
            배송 취소 변경
        }

        4) 각 테이블에 취소 상태 Update
}

// 실제 코드
@Transactional
public Order cancelOrder(int orderId){
        1) 데이터베이스로부터 주문정보 ( Orders ), 결제 정보 (Billing), 배송정보 (Delivery) 조회
        OrdersDto order = ordersDao.selectOrders(orderId);
        BillingDto billing = billingDao.selectBilling(orderId);
        DeliveryDto delivery = deliveryDao.selectDelivery(orderId);

        2) 배송취소를 해야 하는지 확인

        3) (if 배송중이라면){
        배송 취소 변경
        }

        4) 각 테이블에 취소 상태 Update
        }
