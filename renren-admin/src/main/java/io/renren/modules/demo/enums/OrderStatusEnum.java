package io.renren.modules.demo.enums;/**
 * @author tian
 * @date 2024/5/7 16:49
 */

/**
 * @author tian
 * @date 2024/5/7 16:49
 */
/**
 * 订单状态
 */
public enum OrderStatusEnum {
    /**
     * 已取消
     */
    CANCEL(-1),
    /**
     * 等待付款
     */
    WAITING(0),
    /**
     * 已完成
     */
    FINISH(1);

    private int value;

    OrderStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}