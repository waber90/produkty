package pl.sda.shop.products;

class NoSuchProductException extends RuntimeException {
    NoSuchProductException(String message) {
        super(message);
    }
}
