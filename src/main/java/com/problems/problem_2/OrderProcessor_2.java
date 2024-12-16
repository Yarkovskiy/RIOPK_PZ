package com.problems.problem_2;

public class OrderProcessor_2 {
    public static void main(String[] args) {
        processOrder("Иван", "Товар1", 5, 100);
    }

    public static void processOrder(String customerName, String productName, int quantity, int price) {
        if (!validateInput(customerName, productName, quantity, price)) {
            return;
        }

        int total = calculateTotal(quantity, price);
        System.out.println("Сумма заказа для клиента " + customerName + ": " + total);

        sendNotification(customerName);
    }

    private static boolean validateInput(String customerName, String productName, int quantity, int price) {
        if (customerName == null || customerName.isEmpty()) {
            System.out.println("Ошибка: Имя клиента не указано.");
            return false;
        }
        if (productName == null || productName.isEmpty()) {
            System.out.println("Ошибка: Название товара не указано.");
            return false;
        }
        if (quantity <= 0 || price <= 0) {
            System.out.println("Ошибка: Некорректные данные.");
            return false;
        }
        return true;
    }

    private static int calculateTotal(int quantity, int price) {
        return quantity * price;
    }

    private static void sendNotification(String customerName) {
        System.out.println("Уведомление отправлено клиенту " + customerName);
    }
}
