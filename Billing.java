package com.maktab25.hw4.torabi.practice3;

public class Billing {
    private static int photoBookPrice = 150;

    public static void setPhotoBookPrice(int photoBookPrice) {
        Billing.photoBookPrice = photoBookPrice;
    }

    public int getPhotoBookPrice() {
        return photoBookPrice;
    }
    static double computeBill(String photoBook) {
        System.out.println("price of a Photo Book:" + photoBookPrice);
        return photoBookPrice * (1 + 0.08);

    }

    static double computeBill(String photoBook, int quantity) {
        System.out.println("price of a Photo Book:" + photoBookPrice + "\n" + "quantity:" + quantity);
        return photoBookPrice * quantity * (1 + 0.08);

    }

    static double computeBill(String photoBook, int quantity, int couponValue) {
        System.out.println("price of a Photo Book:" + photoBookPrice + "\n" + "quantity:" + quantity + "\n" + "coupon value:" + couponValue);
        return (photoBookPrice * quantity-couponValue)*1.08;

    }
}
